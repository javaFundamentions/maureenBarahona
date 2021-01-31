/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje5_14;

/**
 *
 * @author maureen
 */
public class Interes {

    public static void main(String[] args) {
        double monto;
        double principal = 1000.0;
        //  double tasa = 0.05;

        for (double tasa = 0.05; tasa <= 0.1; tasa += 0.01) {
            
             System.out.println("tasa del "+Math.round(tasa*100.0)+"%");
            
            System.out.printf("\n%s%20s", "Anio", "Monto en deposito");

            for (int anio = 1; anio <= 10; anio++) {
                monto = principal * Math.pow(1.0 + tasa, anio);

                System.out.printf("%4d%,20.2f\n", anio, monto);
            }
            
            System.out.println(" ");
        }

    }
}
