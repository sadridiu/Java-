/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    String s1;
    
    System.out.println("Jepni stringun");
    s1=input.next();
    int i=0;
    int j=s1.length()-1;
    while(i<j){
        if(s1.charAt(i)==s1.charAt(j)){
           
                i++;
                j--;
        }
        else break;
        }
    
            if(i>=j){System.out.println("teksti eshte nje palindrome");}
            else  System.out.println("teksti nuk eshte palindrome");
      }
    }
