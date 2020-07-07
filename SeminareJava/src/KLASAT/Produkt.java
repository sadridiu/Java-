
package KLASAT;

public class Produkt {
    private String emri;
    private double cmimi;

    public Produkt() {
    }

    public Produkt(String emri, double cmimi) {
        this.emri = emri;
        this.cmimi = cmimi;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    @Override
    public String toString() {
        return " Produkt{" + " emri=" + emri + ", cmimi=" + cmimi + '}';
    }
    
    
}
