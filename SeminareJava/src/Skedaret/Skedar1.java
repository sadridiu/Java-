
package Skedaret;
import java.io.*;
import java.util.*;


public class Skedar1 
{
    public static void main(String[]args) throws FileNotFoundException
    {
        File f=new File("C:/Users/sadri/Documents/libra.txt");
        Scanner scn=new Scanner(f);
        
        System.out.println("Permbajtja e skedarit eshte ");
        while(scn.hasNextLine())
        {
            String line=scn.nextLine();
            System.out.println(line);
        }
        scn.close();
        
    }
     
}
