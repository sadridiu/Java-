/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trashigimia;

/**
 *
 * @author sadri
 */
public class Mesues extends Personi{
    private String kod;
    private String []lendet;
    private int n;
    
    public Mesues()
    {
        super();
        kod="";
        lendet=null;
        n=0;
    }
public Mesues(String name,String adr, 
 String kodi,String []lendet, int n)
{
    super(name,adr);
    this.kod=kodi;
    this.lendet=lendet;
    this.n=n;
}
public void afishoLendet()
{
    for(int i=0;i<n;i++)
    {
        System.out.println("Lenda:"
        +lendet[i]);
    }
}

public void shtoLende(String lenda)
{
    lendet[n]=lenda;
    n++;
}

public String toString()
{
 return super.toString()+" kodi i mesuesit:"
            +kod;
}
}

