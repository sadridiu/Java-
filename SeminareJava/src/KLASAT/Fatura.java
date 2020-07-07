package KLASAT;


public class Fatura extends Produkt {
    private String kodi;

    public Fatura() {
        super();
    }

    public Fatura(String kodi) {
        this.kodi = kodi;
    }

    public Fatura(String kodi, String emri, double cmimi) {
        super(emri, cmimi);
        this.kodi = kodi;
    }

    public String getKodi() {
        return kodi;
    }

    public void setKodi(String kodi) {
        this.kodi = kodi;
    }

    
    public String toString() {
        return " Fatura{" + " kodi= " + kodi + super.toString()+'}';
    }
    
    
}
