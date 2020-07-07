
package KLASAT;

public class TestKredimarresKredi {

    
    public static void main(String[] args) {
       Kredi k1= new Kredi();
       Kredi k2= new Kredi("55","10-1-2020",true);
       
       Kredimarres km1= new Kredimarres();
       Kredimarres km2= new Kredimarres("Albi");
       Kredimarres km3=new Kredimarres("Ana","55","10-1-2020",true);
       
        System.out.println("Te dhenat e k1"+k1.toString());
        System.out.println("Te dhenat e k2"+k2.toString());
        System.out.println("Te dhenat e km1"+km1.toString());
        System.out.println("Te dhenat e km2"+km2.toString());
        System.out.println("Te dhenat e km3"+km3.toString());
        
    }
    
}
