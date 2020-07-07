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
public class DogList {
    private Dog[] thelist= new Dog[5];
    private int i=0;
    
    public void add(Dog d)
    {
        if(i<thelist.length)
        {
            thelist[i]=d;
            System.out.println("Dog added at index"+i);
            i++;
        }
    }
}
