
package KLASAT;


public class Kredimarres extends Kredi {
    private String emri;

    public Kredimarres() {
        super();
    }

    public Kredimarres(String emri) {
        this.emri = emri;
    }

    public Kredimarres(String emri, String kodi, String data, boolean statusi) {
        super(kodi, data, statusi);
        this.emri = emri;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    @Override
    public String toString() {
        return "Kredimarres{" + "emri=" + emri + '}';
    }
    
}
