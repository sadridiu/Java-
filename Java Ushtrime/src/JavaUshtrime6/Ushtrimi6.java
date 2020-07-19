/*
SHkruani nje klase qe permbane dy metodat e meposhtme:
public static double celciusNeFahrenheit(double celcius);
public static double fahrenheitNeCelcius(double fahrenheit);
Formula per kete konvertim eshte :
fahrenheit = (9.0 / 5) * (celcius + 32)
celcius = (5.0 / 9) * (fahrenheit - 32)
Shkruani nje program test qe therret metoden e mesiperme dhe shfaq 
tabelen e meposhtme:
Celcius     Fahrenheit | Fahrenheit     Celcius
_______________________|___________________________
    50          122    |    152         66.6667
    71          159.8  |    167         7577

 */
package JavaUshtrime6;

import java.util.Scanner;

/**
 *
 * @author sadri
 */
public class Ushtrimi6 {

   
    public static void main(String[] args) {
        
        Scanner scn = new Scanner (System.in);
        System.out.println("Jepni temperaturen ne celcius");
        int nrCelcius =scn.nextInt();
        System.out.println("Jepni temperaturen e fahrenheit");
        int nrFahrenheit = scn.nextInt();
        System.out.println("Celcius     Fahrenheit | Fahrenheit     Celcius\n" +
"_______________________|___________________________\n" +
"    50          122    |    152         66.6667\n" +
"    71          159.8  |    167         7577\n"+
        "    "+nrCelcius+"          "+celciusNeFahrenheit(nrCelcius)+"  |    "
                +nrFahrenheit+"         "+fahrenheitNeCelcius(nrFahrenheit));
        
    }
    public static double celciusNeFahrenheit(double celcius){
        double fahrenheit = (9.0 / 5) * celcius + 32;
        return fahrenheit;
    }
    public static double fahrenheitNeCelcius(double fahrenheit){
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        return celcius;
    }
}
