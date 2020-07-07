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
public class Personi {
  private String emer,adresa;
  
  public Personi()
  { emer="beni"; adresa="tr"; }
  public Personi(String emer,String adr)
  {  this.emer=emer; adresa=adr;  }
  
  public String getEmer()
  { return emer; }
  public String getAdrese()
  { return adresa;  }
  public String toString()
  { return "Emri:"+emer+" adresa:"
          +adresa;
  }
}
