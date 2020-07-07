
package Skedaret;
import java.io.*;
import java.util.*;


public class Skedar2 
{
    public static void main(String[]args) throws FileNotFoundException
    {
        File f=new File("C:/Users/sadri/Documents/libra.txt");
        Scanner scn=new Scanner(f);
        PrintWriter out=new PrintWriter("C:/Users/sadri/Documents/output.txt");
        
        while(scn.hasNextLine())
        {
            String line=scn.nextLine();
            out.println(line);
        }
        scn.close();
        out.close();
    }
    
}
