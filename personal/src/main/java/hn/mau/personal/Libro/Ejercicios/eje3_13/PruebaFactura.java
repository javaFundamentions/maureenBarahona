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
public class PruebaFactura {

    
    public static void main(String[] args) {
      Factura factura1 = new Factura ("1", "Tornillo", 16,12.5);
       System.out.printf("El total a pagar es : $ %.2f\n",
                factura1.obtenerMontoFactura());
    }
    
}
