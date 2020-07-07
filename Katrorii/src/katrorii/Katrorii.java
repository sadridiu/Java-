/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package katrorii;

/**
 *
 * @author Instam
 */
public class Katrorii {
private double brinja;

public Katrorii(){
    brinja=0;
}
public Katrorii(double b){brinja=b;}

public void getbrinja(double b){brinja=b;}
public double setbrinja(){return brinja;}

public double setSiperfaqe(){return brinja*brinja;}

public void AfishoTeDhena(){
    System.out.println("brinja e katrotit eshte"+setbrinja()+"Dhe siperfaqja eshte"+setSiperfaqe());
}
}