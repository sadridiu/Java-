/*Ndertoni klasen person per te cilin ruhet 
emri mosha dhe gjinia
ndretoni kontruktor defaul ,konstruktor me paramara,metodat get dhe set 
dhe nje metode toString qe afishon te dhennat e personit
*/
package Trashigimia;

import KLASAT.*;

public class Person
{
    private String emer;
    private int mosha;
    private char gjini;
    
public Person()
    {   }
public Person(String emer,int mosha,char gjini)
    {
        this.emer=emer;
        this.mosha=mosha;
        this.gjini=gjini;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public char getGjini() {
        return gjini;
    }

    public void setGjini(char gjini) {
        this.gjini = gjini;
    }


public String toString()
{
    return "Emri eshte "+emer+" mosha eshte "+mosha+" gjinia eshte "+gjini;
}
}
