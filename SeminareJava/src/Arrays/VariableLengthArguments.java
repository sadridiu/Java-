
package Arrays;


public class VariableLengthArguments {

   
    public static void main(String[] args) {
       System.out.println(average(42,56,76,8,65,76,2,31));
        
    }
    public static int average(int...numbers )
    {
        int total=0;
        for(int x:numbers)
        {
            total+=x;
        }
        return total/numbers.length;
    }
}
