/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drejtkendesh;

/**
 *
 * @author sadri
 */
public class Pike {
    double x;
    double y;
    
    public Pike()
    {
        
    }
    public Pike(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public void setKordinataX(double x)
    {
        this.x=x;
    }
    public void setKordinataY(double y)
    {
        this.y=y;
    }
    public double getKordinataX()
    {
        return this.x;
    }
    public double getKordinataY()
    {
       return this.y;
    }
    public String toString()
    {
      return "Pika ndodhet ne Kordinatat ("+getKordinataX()+","+getKordinataY()+")";  
    }
    public void siperfaqja(Pike p)
    {
    
    }

}
