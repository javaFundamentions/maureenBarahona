/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_17;

/**
 *
 * @author maureen
 */
public class RegistroCombustible {

    private int km_conducidos;
    private int lts_usados;
    
     public RegistroCombustible() {
        super();
    }

    public RegistroCombustible(int km_conducidos, int lts_usados) {
        this.km_conducidos = km_conducidos;
        this.lts_usados = lts_usados;
    }

   
    public int getKm_conducidos() {
        return km_conducidos;
    }

    public void setKm_conducidos(int km_conducidos) {
        this.km_conducidos = km_conducidos;
    }

    public int getLts_usados() {
        return lts_usados;
    }

    public void setLts_usados(int lts_usados) {
        this.lts_usados = lts_usados;
    }

    public float obtenerKmsXLts() {
        float total = (float) this.getKm_conducidos() / this.lts_usados;

        return total;
    }
   
}
