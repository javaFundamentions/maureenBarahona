/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje6_20;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class main {

    public static void main(String[] args) {
        formulas form = new formulas();
        double radio, area;
        Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.print("\nEste programa recibe el radio de un circulo e imprime el area. ");
        System.out.println("");

        System.out.println("\nPor favor introduzca el radio: ");
        radio = capturador.nextInt();

        area = form.circuloArea(radio);

        System.out.printf("\nEl area del circulo es: %.2f\n", area);
    }

}
