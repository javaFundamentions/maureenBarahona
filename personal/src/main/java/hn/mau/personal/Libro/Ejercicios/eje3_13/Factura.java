/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje3_13;

/**
 *
 * @author maureen
 */
public class Factura {

    private String numPieza;
    private String desPieza;
    private int CantComprar;
    private double preArticulo;

    public Factura() {
        super();
    }

    public Factura(String numPieza, String desPieza, int CantComprar, double preArticulo) {
        this.numPieza = numPieza;
        this.desPieza = desPieza;
        this.CantComprar = CantComprar;
        this.preArticulo = preArticulo;
    }

    public String getNumPieza() {
        return numPieza;
    }

    public void setNumPieza(String numPieza) {
        this.numPieza = numPieza;
    }

    public String getDesPieza() {
        return desPieza;
    }

    public void setDesPieza(String desPieza) {
        this.desPieza = desPieza;
    }

    public int getCantComprar() {
        return CantComprar;
    }

    public void setCantComprar(int CantComprar) {
        this.CantComprar = CantComprar;
    }

    public double getPreArticulo() {
        return preArticulo;
    }

    public void setPreArticulo(double preArticulo) {
        this.preArticulo = preArticulo;
    }

    public double obtenerMontoFactura() {
        Double total;
        total = this.CantComprar * this.preArticulo;

        if (total < 0) {
            total = 0.0;
        }

        return total;
    }

}
