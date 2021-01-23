/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_19;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class PruebaVentasXVendedor {

    public static void main(String[] args) {
        try {
            boolean on = true;
            String option;
            float value;
            double VentaXArticulo, VentaTotalVendedor = 0;
            VentasXVendedor vXVendedor = new VentasXVendedor();

            while (on) {

                Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
                System.out.println("-----Calculo de comisiones por vendedor------");
                System.out.println("Ingrese el codigo de articulo del vendedor ");
                value = capturador.nextInt();
                VentaXArticulo = vXVendedor.ObtenerValorArticulo((int) value);
                System.out.println("Las ventas del vendedor son " + VentaXArticulo);

                VentaTotalVendedor = VentaTotalVendedor + VentaXArticulo;
                System.out.println("el vendedor lleva un total de :" + VentaTotalVendedor);

                System.out.println(" presione cualquier tecla para continuar , para salir presione x");
                option = capturador.next();

                if ("x".equals(option)) {
                    on = false;
                }

            }
            vXVendedor.ComisionesXVendedor(VentaTotalVendedor);

        } catch (Exception e) {
            System.err.println("error " + e.getMessage());
        }

    }
}