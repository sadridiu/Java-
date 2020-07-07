package Studenti;
public class Studenti extends Personi
{
    private String kod;
    private String []lendet;
    private int []notat;
    private int n;
    
    public Studenti()
    {
        super();
        kod="";
        lendet=null;
        notat=null;
        n=0;
    }
public Studenti(String name,String adr, 
 String kodi,String []lendet,
 int []notat,int n)
{
    super(name,adr);
    this.kod=kodi;
    this.lendet=lendet;
    this.notat=notat;
    this.n=n;
}
public void afishoListeNotash()
{
    for(int i=0;i<n;i++)
    {
        System.out.println("Lenda:"
        +lendet[i]+" nota:"+notat[i]);
    }
}

public double mesatare()
{
    int s=0; double sh=0.0,mes=0.0;
    for(int i=0;i<n;i++)
    {
        s=s+notat[i];
    }
    sh=(double)s;
    mes=sh/n;
    return mes;
}

public void shtoNote(String lenda,int nota)
{
    lendet[n]=lenda;
    notat[n]=nota;
    n++;
}

public String toString()
{
 return super.toString()+" kodi i std:"
            +kod;
}
}

