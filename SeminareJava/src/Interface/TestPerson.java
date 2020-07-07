package Interface;
public class TestPerson 
{
 public static void main(String []args)
 {
    Person p1=new Person("beni","abc","tr",
    "+355..."); 
    Person p2=new Person("mira","xyz","tr",
    "+355...");
    System.out.println("Te dhenat e p1: "
            + p1.toString());
    System.out.println("Te dhenat e p2: "
            + p2.toString());
    boolean test1=p1.equals(p2);
    if(test1==true)
      System.out.println("Personat kane"
              + " te njejtin emer");
    else
    System.out.println("Personat nuk kane"
              + " te njejtin emer");  
    int test2=p1.compareTo(p2);
    if(test2==-1)
 System.out.println(p2.getEmer()
+" eshte me mbrapa ne rend alf");
    else if(test2==1)
System.out.println(p1.getEmer()
+" eshte me mbrapa ne rend alf");
    else
System.out.println("Personat kane "
        + "te njejtin emer"); 
    
    boolean test3=p1.kontrolloAdr();
    if(test3==true)
 System.out.println("Adr e p1 eshte tr");
    else
System.out.println("Adr e p1 nk eshte tr");        
        
 }
}
