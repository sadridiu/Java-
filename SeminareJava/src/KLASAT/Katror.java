/*
 ruhen kordinatat xy e pikes lart majtas dhe brinja e katrorit
 Ndertoni konstruktor defalt dhe me parametra
metodat get dhe set
nje metod qe llogarit siperfaqen e katrorit
metoden to string
je metode qe krahason dy katrore ne baze te siperfaqes dhe kthen 
te dhenat e katrorit qe ka siperfqe me te madhe
testoni klasen;
*/
package KLASAT;

public class Katror {
    private double x,y,brinja;
    public Katror() {}
    
    public Katror(double x,double y,double b)
    {this.x=x;
    this.y=y;
    this.brinja=b;
    }
    public void setX(double x){this.x=x;}
    public void setY(double y){this.y=y;}
    public void setBrinja(double b){this.brinja=b;}
    
    public double getX(){return x;}
    public double getY(){return y;}
    public double getBrinja(){return brinja;}
    public double getSiperfaqe(){return brinja*brinja;
    }
    
    public String toString() {
    return "te dhenat e katrorit jane: \n"
            + "brinja "+brinja+" ndodhet ne kordinatat"
            + "X  "+x+"\n "
            + "Y "+y+"\n me Siperfaqe "+getSiperfaqe();
}
    void krahaso (Katror k)
    {
        if(this.getSiperfaqe()>k.getSiperfaqe())
            System.out.println("Te dhenat e katrorit me siperfae me te madhe"
                    +this.toString());
        else 
           System.out.println("Te dhenat e katrorit me siperfae me te madhe"
                    +k.toString());
    }
}

