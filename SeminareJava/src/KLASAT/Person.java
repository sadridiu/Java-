/*Ndertoni klasen person per te cilin ruhet 
emri mosha dhe gjinia
ndretoni kontruktor defaul ,konstruktor me paramara,metodat get dhe set 
dhe nje metode toString qe afishon te dhennat e personit
*/
package KLASAT;

public class Person
{
    private String emer;
    private int mosha;
    private char gjini;
    
public Person()
    {   }
public Person(String emer,int mosha,char gjinia)
    {
        this.emer=emer;
        this.mosha=mosha;
        this.gjini=gjinia;
    }
public void setEmer(String name)
{
    emer=name;
}
public void setMosha(int mosha)
{
    this.mosha=mosha;
}
public void setGjini(char gender)
{
    gjini=gender;
}
public String getEmer(){return emer;}
public int getMosha(){return mosha;}
public char getGjini(){return gjini;}
public String toString()
{
    return "Emeri eshte "+emer+" mosha eshte "+mosha+" gjinia eshte "+gjini;
}
}
