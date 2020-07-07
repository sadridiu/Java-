/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaUshtrime4;

/**
 *
 * @author sadri
 * Duke supozuar qe s1,s2,dhe s3 jane tre stringje me permbajtje si me poshte:
 * 
 */
public class Ushtrimi9 {
    public static void main(String []args)
    {
        String s1="Pershendetje nga Java!";
        String s2="Me pelqen programimi!";
        String s3="Pershendetje nga Java!";
        
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s2));
        System.out.println(s1.charAt(0));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf("nga"));
        System.out.println(s1.lastIndexOf('e'));
        System.out.println(s1.lastIndexOf("o",10));
        System.out.println(s1.length());
        System.out.println(s1.substring(12));
        
        System.out.println(s1.substring(12,16));
        System.out.println(s1.startsWith("Me"));
        System.out.println(s1.startsWith("Per"));
        System.out.println(s1.endsWith("Java"));
        System.out.println(s1.endsWith("Java!"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(s3));
        System.out.println(s1.trim());
        System.out.println(s1.contains("Me"));
        System.out.println(s1.contains(s3));
        
        
        
        
        
        
        
        
    } 
}
