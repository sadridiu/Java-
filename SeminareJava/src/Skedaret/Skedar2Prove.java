
package Skedaret;
import java.io.*;
import java.util.*;

public class Skedar2Prove
{
public static void main(String[]args) throws FileNotFoundException
{
    File f=new File("");
    Scanner scn=new Scanner(f);
    PrintWriter out=new PrintWriter("");
    
    while(scn.hasNextLine())
    {
        String line=scn.nextLine();
        out.println(line);
    }
    scn.close();
    out.close();
}
}