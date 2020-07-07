
package KLASAT;


public class Autor {
    private String emer,email;

    public Autor() {
    }
    
    public Autor(String emer) {
        this.emer = emer;
        
    }
    public Autor(String emer, String email) {
        this.emer = emer;
        this.email = email;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getAutor() {
        return toString();
    }
    
    public String toString() {
        return "Autor{" + "emer=" + emer + ", email=" + email + '}';
    }
    
}
