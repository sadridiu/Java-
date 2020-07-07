
package KLASAT;


public class Liber extends Autor{
    private String titulli;
    private int cmimi;

    public Liber() {
        super();
    }

    public Liber(String titulli, int cmimi) {
        this.titulli = titulli;
        this.cmimi = cmimi;
    }

    public Liber(String titulli, int cmimi, String emer) {
        super(emer);
        this.titulli = titulli;
        this.cmimi = cmimi;
    }

    public String getTitulli() {
        return titulli;
    }

    public void setTitulli(String titulli) {
        this.titulli = titulli;
    }

    public int getCmimi() {
        return cmimi;
    }

    public void setCmimi(int cmimi) {
        this.cmimi = cmimi;
    }

    
    public String toString() {
        return "Liber{" + "titulli=" + titulli + ", cmimi=" + cmimi  +super.toString()+ '}';
    }
    
    
    
}
