/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickbracker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author sadri
 */
public class Gameplay extends JPanel implements KeyListener,ActionListener{
    private boolean play = false;
    private int score = 0;
    
    private int totalBricks = 21;
    
    private Timer timer;
    private int delay = 8;
    
    private int playerX = 310;
    
    private int ballposX = 120;
    private int ballposY = 350;
    private int ballXdir = -1;
    private int ballYdir = -2;
    
    private MapGenerator map;
    
    public Gameplay(){
        map = new MapGenerator(3,7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay,this);
        timer.start();
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        //background
        g2.setColor(Color.black);
        g2.fillRect(1,1,692,592);
        
        //drawing map
        map.draw(g2);
        //borders
        g2.setColor(Color.yellow);
        g2.fillRect(0,0,3,592);
        g2.fillRect(0,0,692,3);
        g2.fillRect(691,0,3,592);
        
        //scores
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("serif",Font.BOLD,25));
        g2.drawString(""+score ,590,30);
        
        
        //the paddle
        g2.setColor(Color.green);
        g2.fillRect(playerX,550,100,8);
        
        //the ball
        g2.setColor(Color.yellow);
        g2.fillOval(ballposX,ballposY,20,20);
        
        if(totalBricks <=0){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g2.setColor(Color.RED);
            g2.setFont(new Font("serif",Font.BOLD,30));
            g2.drawString("YouWon,Scores:"+score,260,300);
            
            g2.setFont(new Font("serif",Font.BOLD,20));
            g2.drawString("Pres Enter to Restart:",230,350);
        }
        if(ballposY>570){
            play = false;
            ballXdir = 0;
            ballYdir = 0;
            g2.setColor(Color.RED);
            g2.setFont(new Font("serif",Font.BOLD,30));
            g2.drawString("Game Over,Scores:"+score,190,300);
            
            g2.setFont(new Font("serif",Font.BOLD,20));
            g2.drawString("Pres Enter to Restart:",230,350);
        }
        g2.dispose();
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void keyReleased(KeyEvent ke) {}

    @Override
    public void actionPerformed(ActionEvent ae) {
       timer.start();
       if(play){
           if(new Rectangle(ballposX,ballposY,20,20).intersects(new Rectangle(playerX,550,100,8))){
               ballYdir = -ballYdir;
           }
           A:  for(int i = 0;i <map.map.length; i++){
               for (int j = 0;j <map.map[0].length; j++){
                   if(map.map[i][j]>0){
                       int brickX = j*map.brickWidth+80;
                       int brickY =  i*map.brickHeight +50;
                       int brickWidth = map.brickHeight;
                       int brickHeight = map.brickHeight;
                       
                       Rectangle rect = new Rectangle(brickX,brickY,brickWidth,brickHeight);
                       Rectangle ballRect = new Rectangle(ballposX,ballposY,20 ,20);
                       Rectangle brickRect = rect;
                       
                       if(ballRect.intersects(brickRect)){
                           map.setBrickValue(0,i,j);
                           totalBricks--;
                           score +=5;
                           
                           if(ballposX + 19 <= brickRect.x || ballposX +1 >= brickRect.x +brickRect.width){
                               ballXdir = -ballXdir;
                           }else {
                               ballYdir = -ballYdir;
                           }
                           break A;
                       }
                   }
               }
           }
           
           ballposX +=ballXdir;
           ballposY +=ballYdir;
           if(ballposX <0){
               ballXdir = -ballXdir;
           }
           
           if(ballposY <0){
               ballYdir = -ballYdir;
           }
           
           if(ballposX > 670){
               ballXdir = -ballXdir;
           }
          
       }
       repaint();
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(playerX >=600){
                playerX=600;
            }else {
                moveRight();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(playerX <10){
                playerX=10;
            }else {
                moveLeft();
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(!play){
                play = true;
                ballposX=120;
                ballposY = 350;
                ballXdir = -1;
                ballYdir =-2;
                playerX = 310;
                score = 0;
                totalBricks = 21;
                map = new MapGenerator(3,7);
                
                repaint();
            }
        }
    }
    public void moveRight(){
        play = true;
        playerX+=20;
        repaint();
    }
    public void moveLeft(){
        play = true;
        playerX-=20;
        repaint();
    }
}
