/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cave;

/**
 *
 * @author sadri
 */
public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    
    public void greet(){
        System.out.println("Hello there");
    }

   
    public void showInfo() {
        System.out.println("Person name is: "+name);
    }
    
}
