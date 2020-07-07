/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.LinkedList;

/**
 *
 * @author sadri
 */
public class LinkedListInsert {
    public static void main(String[] args)
    {
        // krijimi i listes
        LinkedList list = new LinkedList();
   
    //shtimi i elementeve ne liste
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");
   
    System.out.println("Elementet e listes jane: " + list);
     list.add(2, "2.5");
     System.out.println("Mbas shtimit te vleres 2.5, elemtente e listes jane : " + list);
    }
    
}
