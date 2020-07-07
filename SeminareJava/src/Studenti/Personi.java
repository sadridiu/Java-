package Studenti;
public class Personi 
{
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
