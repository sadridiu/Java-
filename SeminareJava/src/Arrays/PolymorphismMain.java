
package Arrays;


public class PolymorphismMain {

   
    public static void main(String[] args) {
       
    PolymorphismFood bucky[]=new PolymorphismFood[2];
    bucky [0]=new PolymorphismPotpie();
    bucky[1]=new PolymorphismTuna();
    
    for(int x=0;x<2;++x)
    {
        bucky[x].eat();
    }
    
    PolymorphismFatty buck=new PolymorphismFatty();
    PolymorphismFood fo=new PolymorphismFood();
    PolymorphismFood po=new PolymorphismPotpie();
    buck.digest(fo);
    buck.digest(po);
    }
    
}
