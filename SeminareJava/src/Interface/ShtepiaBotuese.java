/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author sadri
 */
public class ShtepiaBotuese implements Comparable {
    
    private String emri,adr,kodi;

    public ShtepiaBotuese() {
    }

    public ShtepiaBotuese(String kodi, String emri, String adr) {
        this.kodi = kodi;
        this.emri = emri;
        this.adr = adr;
    }

    public void setKodi(String kodi) {
        this.kodi = kodi;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public String getKodi() {
        return kodi;
    }

    public String getEmri() {
        return emri;
    }

    public String getAdr() {
        return adr;
    }

    @Override
    public String toString() {
        return "ShtepiaBotuese{" + "kodi=" + kodi + ", emri=" + emri + ", adr=" + adr + '}';
    }
    
 public  boolean equals(ShtepiaBotuese b){
     if(this.adr.equalsIgnoreCase(b.adr))
         return true;
     else return false;
 } 
  public int compareTo(Object obj)
 {
     ShtepiaBotuese b=(ShtepiaBotuese)obj;
if(this.emri.compareTo(b.emri)>0)
    return 1;
else if(this.emri.compareTo(b.emri)<0)
    return -1;
else
    return 0;
 }
}
