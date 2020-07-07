/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author sadri
 */
public class potpie {
    private int month;
    private int day;
    private int year;
    
    public potpie(int m,int d,int y)
    {
        month=m;
        day=d;
        year=y;
        
        System.out.printf("The constructor for this is %s\n",this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d",month,day,year);
    }
    
}
