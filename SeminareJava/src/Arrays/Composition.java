
package Arrays;

public class Composition {
    private String name;
    private potpie birthday;
    
    public Composition(String theName,potpie theDate)
    {
        name=theName;
        birthday=theDate;
    }
    
    public String toString()
    {
        return String.format("My name is %s, my birthday is %s"
                + "",name,birthday);
    }
    
}
