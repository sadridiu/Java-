/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automjet;

/**
 *
 * @author sadri
 */
public class Automjet {

    String marka;
    int viti;
    String ngjyra;
    String targa;
    int kilometra;
    int kuajFuqi;
    int karburant;
    String kambio;
    
    public Automjet(){
        marka="";
        viti=0;
        ngjyra="";
        targa="";
        kilometra=0;
        kuajFuqi=0;
        karburant=0;
        kambio="";
    }
    public Automjet(String m, int v, String n, String t, int km, int kF, int kb, String k)
    {  this.marka = m; 
    this.viti = v; 
    this.ngjyra = n; 
    this.targa = t; 
    this.kilometra = km;  
    this.kuajFuqi = kF;  
    this.karburant = kb;  
    this.kambio = k;  }  
    
    public void getmarka(String m){marka=m;}
    public String setmarka(){return marka;}
    
    public void getviti(int v){viti=v;}
    public int setviti(){return viti;}
    
    public void getngjyra(String n){ngjyra=n;}
    public String setngjyra(){return ngjyra;}
    
    public void gettarga(String t){targa=t;}
    public String settarga(){return targa;}
    
    public void getkm(int km){kilometra=km;}
    public int setkm(){return kilometra;}
    
    public void getkuajFuqi(int kF){kuajFuqi=kF;}
    public int setkuajFuqi(){return kuajFuqi;}
    
    public void getkarburant(int kb){karburant=kb;}
    public int setkarburant(){return karburant;}
    
    public void getkambi(String k){kambio=k;}
    public String setkambi(){return kambio;}
    
    public void AfishoTeDhena(){
        System.out.println("Te dhenat e automjetit jane:"+
                "\n Marka: "+marka+"\n Ngjyra: "+ngjyra+"\n viti: "+viti+"\n Targa: "+targa
        +"\n Karburant: "+karburant+"\n kilometra: "+kilometra+"\n Kuaj fuqi: "+kuajFuqi
        +"\n kambio: "+kambio);
    }

    
    
}
