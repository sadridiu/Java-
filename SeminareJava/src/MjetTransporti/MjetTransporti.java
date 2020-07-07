/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MjetTransporti;

/**
 *
 * @author Instam
 */
public class MjetTransporti {

    private int shpejtesi;
    private int nrPasagjere;

    public MjetTransporti() {
    }

    public MjetTransporti(int shpejtesi, int nrPasagjere) {
        this.shpejtesi = shpejtesi;
        this.nrPasagjere = nrPasagjere;
    }

    public int getShpejtesi() {
        return shpejtesi;
    }

    public void setShpejtesi(int shpejtesi) {
        this.shpejtesi = shpejtesi;
    }

    public int getNrPasagjere() {
        return nrPasagjere;
    }

    public void setNrPasagjere(int nrPasagjere) {
        this.nrPasagjere = nrPasagjere;
    }

    @Override
    public String toString() {
        return "MjetTransporti{" + "shpejtesi=" + shpejtesi + ", nrPasagjere=" + nrPasagjere + '}';
  
}
}
