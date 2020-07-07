/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trashigimia;

/**
 *
 * @author dd
 */
public class TestPersonPunonjes {
    public static void main(String []args)
    {
        Person p1=new Person("beni",20,'m');
         Punonjes emp1=new Punonjes("mira",25,'f',"it",500);
        Punonjes emp2=new Punonjes("era",30,'f',"it",700);
        System.out.println("Te dhenat e p1: \n"+p1.toString());
        System.out.println("Te dhenat e emp1: \n"+emp1.toString());
        System.out.println("Te dhenat e emp2: \n"+emp2.toString());
        emp2.setMosha(29);
        System.out.println("Mbas ndryshimit mosha e emp2 eshte "+emp2.getMosha());
        
    }
}
