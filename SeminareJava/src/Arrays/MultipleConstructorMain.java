
package Arrays;


public class MultipleConstructorMain {

    
    public static void main(String[] args) {
       
        MultipleConstructor MultipleConstructorObject=new MultipleConstructor();
        
        MultipleConstructor MultipleConstructorObject2=new MultipleConstructor(5);
        MultipleConstructor MultipleConstructorObject3=new MultipleConstructor(5,13);
        MultipleConstructor MultipleConstructorObject4=new MultipleConstructor(5,13,43);
        
        System.out.printf("%s\n",MultipleConstructorObject.toMilitary());
        System.out.printf("%s\n",MultipleConstructorObject2.toMilitary());
        System.out.printf("%s\n",MultipleConstructorObject3.toMilitary());
        System.out.printf("%s\n",MultipleConstructorObject4.toMilitary());
        
        
        
        
    }
    
}
