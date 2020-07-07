package Interface;
public class Person implements Comparable,
        Veprime
{
    private String emer,mbiemer,adr,tel;
    public Person()
    {  }
 public Person(String emer,String mbiemer,
    String adr,String tel)
 { this.emer=emer; this.mbiemer=mbiemer;
 this.adr=adr; this.tel=tel;
 }
 public void setEmer(String emer)
 { this.emer=emer;}
 public void setMbiemer(String mbiemer)
 { this.mbiemer=mbiemer; }
 public void setAdr(String adr)
 { this.adr=adr; }
 public void setTel(String tel)
 { this.tel=tel; }
 public String getEmer()
 { return emer; }
 public String getMbiemer()
 { return mbiemer; }
 public String getAdr()
 { return adr; }
 public String getTel()
 { return tel; }
 public String toString()
 { return "Emri eshte "+emer+
" mbiemri eshte "+mbiemer+" adr eshte "
    +adr+" tel eshte "+tel;
 }
 public boolean equals(Object obj)
 {
     Person p=(Person)obj;
if(this.emer.equalsIgnoreCase(p.emer)
        ==true)
    return true;
else 
    return false;
 }
 public boolean equals(Person p)
 {                          
  if(this.emer.equalsIgnoreCase(p.emer)
          ==true)
      return true;
  else
      return false;
 }
 public int compareTo(Object obj)
 {
     Person p=(Person)obj;
if(this.emer.compareTo(p.emer)>0)
    return 1;
else if(this.emer.compareTo(p.emer)<0)
    return -1;
else
    return 0;
 }
 public boolean kontrolloAdr()
 {
  if(this.adr.equalsIgnoreCase("tr")==true)
      return true;
  else
      return false;
 }
}
