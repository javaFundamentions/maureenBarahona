/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje6_15;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class hipotenusa {

    public static void main(String[] args) {

        formulas form = new formulas();
        double cateto1, cateto2, hipotenusa;
        Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");

        System.out.print("\nEste programa calcula la hipotenusa de un triangulo ");
        System.out.println("rectangulo. ");

        System.out.println("Por favor introduzca el cateto 1: ");
        cateto1 = capturador.nextInt();

        System.out.println("Por favor introduzca el cateto 2: ");
        cateto2 = capturador.nextInt();

        hipotenusa = form.hipotenusa(cateto1, cateto2);

        System.out.printf("\nLa hipotenusa es: %f \n", hipotenusa);

    }

}
