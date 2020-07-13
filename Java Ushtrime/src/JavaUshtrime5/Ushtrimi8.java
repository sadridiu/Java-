/*
 GJej numrin n me te vogel i till qe n nkatror >1560.
 Perdorni nje cikel while per te gjetur n, katror i se ciles eshte me i madh se 15600.
 */
package JavaUshtrime5;

public class Ushtrimi8 {

    public static void main(String[] args) {
        int n = 1;

        for (int i = 0; i <=1000; i++) {
            n++;
            double katror = Math.pow(n, 2);

            if (katror > 15600) {
                System.out.println(n);
                break;
            }
        }

    }
}
