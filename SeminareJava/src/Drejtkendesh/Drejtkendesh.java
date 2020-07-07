/*
 Ndertoni klasen Pike per te cilen ruhen koordinatat x, y te pikes. 
Ndertoni konstruktor default, konstruktor me parametra, metodat get dhe set,
metoden toString dhe nje metode qe llogarit siperfaqen e pikes
(ne rastin e pikes metoda kthen vleren 0 sepse pika nuk ka siperfaqe)
Ndertoni klasen Drejtkendesh qe trashegon nga klasa Pike. 
Per klasen Drejtkendesh ruhet gjeresia dhe lartesia e drejtkendeshit. 
Ndertoni konstruktor default, konstruktor me parametra, metodat get dhe set, metoden toString, 
metoden qe llogarit siperfaqen e drejtkendeshit dhe nje metode qe kontrollon 
nese nje pike, koordinatat e se ciles merren si parameter nga metoda,
ndodhet brenda drejtkendeshit ose jo. Testoni klasat me te dhena qe merren si input nga perdoruesi.
 */
package Drejtkendesh ;

/**
 *
 * @author sadri
 */
public class Drejtkendesh extends Pike {
    private double width;
    private double height;
    public Drejtkendesh()
    {
        super();
        
    }
    public Drejtkendesh (double x,double y,double w,double h)
    {
        super(x,y);
        this.width=w;
        this.height=h;
    }
    public void setWidth(double w)
    {
        this.width=w;
    }
    public void setHeight(double h)
    {
        this.height=h;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
   public void Siperfaqe()
    {
        double siperfaqe=this.height*this.width;
        System.out.println("Siperfaqja e drejtkendeshit eshte"+siperfaqe);
    }
   public double getSiperfaqe()
   {
       return this.width*this.width ;
   }
    public String toString()
            {
                return super.toString()+" Gjeresia e Drejtkendeshit eshte: "+getWidth()+" dhe lartesi: "+getHeight();
            }
    
    public void krahaso(Drejtkendesh d)
    {
        if(super.getKordinataX()>=d.x&&super.getKordinataX()<=d.x+this.width)
        {
            if(super.getKordinataY()>=d.y&&super.getKordinataY()<=d.y+this.height);
            System.out.println("Pika Ndodhet brenda drejtkendeshit");
        }
        else
            System.out.println("Pika nuk ndodhet brenda drejtkendeshit");
    }
}
