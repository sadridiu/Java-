/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MjetTransporti;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Tren extends MjetTransporti 
{
    private int nrVagona;

    public Tren() {
        super();
    }

    public Tren(int nrVagona, int shpejtesi, int nrPasagjere) {
        super(shpejtesi, nrPasagjere);
        this.nrVagona = nrVagona;
    }

    public int getNrVagona() {
        return nrVagona;
    }

    public void setNrVagona(int nrVagona) {
        this.nrVagona = nrVagona;
    }

    @Override
    public String toString() {
        return super.toString()+
           "nrVagona=" + nrVagona;
    }
    
    public void krahaso(Tren t)
    {
        if(this.getShpejtesi()>t.getShpejtesi())
      System.out.println("Te dhenat e trenit me te shpejte: \n"+this.toString());
        else
     System.out.println("Te dhenat e trenit me te shpejte: \n"+t.toString());
    }
}
