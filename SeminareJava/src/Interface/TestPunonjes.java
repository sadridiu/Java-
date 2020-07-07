/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author sadri
 */
public class TestPunonjes {
    public static void main(String []args)
 {
    Punonjes p1=new Punonjes("beni","it",3500); 
    Punonjes p2=new Punonjes("mira","it",2500);
    System.out.println("Te dhenat e p1: "
            + p1.toString());
    System.out.println("Te dhenat e p2: "
            + p2.toString());
    boolean test1=p1.equals(p2);
    if(test1==true)
      System.out.println("Punonjesit punonje ne te njejtin departament");
    else
    System.out.println("Punonjesit nuk punonje ne te njejtin departament");  
    
    boolean test2=p1.kontrolloPage();
    if(test2==true)
    {
        System.out.println("Paga e punonjesit eshte per tu aplikuar takse"); 
        p1.llogaritTatim();}
    else
        System.out.println("Paga e p1 nuk esht per tu aplikuar takse");  
    
    System.out.println("Paga e p1 pasi aplikohet tatimi mbi pagen 0.5% eshte: "+ p1.getPaga());    
    
    
    boolean test3=p2.kontrolloPage();
    if(test3==true)
    {
        System.out.println("Paga e punonjesit eshte per tu aplikuar takse"); 
        p2.llogaritTatim();}
    else
    System.out.println("Paga e p2 nuk esht per tu aplikuar takse");  
      
    
 }
}
 
