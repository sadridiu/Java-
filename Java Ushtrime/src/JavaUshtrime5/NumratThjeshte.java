/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime5;

/**
 *
 * @author sadri
 */
public class NumratThjeshte {
    public static void main(String[]args)
    {
        
        
        int sasia=0;
        int numer=4;
        
        System.out.println("20 numrat e pare thjeshte janne:\n");
        
        
        for(int i = 2;i <= numer/2;i++){
           
            if(numer  % i == 0)
                    continue;
                else {
                        if(sasia % 5 == 0){
                             System.out.println(numer);
                     
                        }else { 
                            
                            System.out.print(numer +" ");
                
                        }
                    sasia++; 
                    if(sasia % 20 == 0){
                        break;
                    }
                }
            numer++;
        }
    }
    }
    

