
package Arrays;
import java.util.EnumSet;

public class EnumerationMain {

    
    public static void main(String[] args) {
        for(Enumeration people:Enumeration.values())
            System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
        
        System.out.println("\nAnd now for the range of constants!!!\n");
        
        for(Enumeration people: EnumSet.range(Enumeration.kelsey,Enumeration.candy))
            System.out.printf("%s\t%s\t%s\n",people,people.getDesc(),people.getYear());
    }
    
}
