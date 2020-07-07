/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aktor;

/**
 *
 * @author sadri
 */
public class Aktor {
 String emri;
 String mbiemri;
 String ditelindja;
 String vendlindja;
 int mosha;
 
 public Aktor(){
     emri="";
     mbiemri="";
     ditelindja="";
     vendlindja="";
     mosha=0;
     
 }
 public Aktor(String e,String m,String d,String v,int mo){
     emri=e;
     mbiemri=m;
     ditelindja=d;
     vendlindja=v;
     mosha=mo;
 }
 public void setemri(String e){emri=e;}
 public String getemri(){return emri;}
 
 public void setmbiemri(String m){mbiemri=m;}
 public String getmbiemri(){return mbiemri;}
 
 public void setditelindja(String d){ditelindja=d;}
 public String getditelindja(){return ditelindja;}
 
 public void setvendlindja(String v){vendlindja=v;}
 public String getvendlindja(){return vendlindja;}
 
 public void setmosha(int mo){mosha=mo;}
 public int getmosha(){return mosha;}
 
 public void AfishoTeDhena(){
     System.out.println("Gjeneralitetet e aktorit/es jane:\n"+"Emri:"+emri+"\n Mbiemri"+mbiemri+"\n Vendlindja"+vendlindja+"\n Datelindja"+ditelindja+"\n Mosha"+mosha);
 }
 

}
