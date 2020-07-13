/*
 Gjej numrin n me te madhe till qe n nkatror <15600.
 Perdorni nje cikel for per te gjetur n, katror i se ciles eshte
me i vogel se 15600.
 */
package JavaUshtrime5;

/**
 *
 * @author sadri
 */
public class Ushtrimi9 {

        public static void main(String[] args) {
        int n = 1,max=-999;
        
        for (int i = 0; i <=1000; i++) {
            n++;
            double katror = Math.pow(n, 2);
            if (katror < 15600) {
                if(n>max){
                max=n;
                }
            }
            else {
                System.out.println(max);
                break;
            }
        }

    }
    
}
