/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_21;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class MasGrande {

    public static void main(String[] args) {
        int cantNum = 0;
        Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("-----Encontrar el valor mas grande ------");
        System.out.println("Ingrese la cantidad de numeros a jugar  ");
        cantNum = capturador.nextInt();

        int[] numero = new int[cantNum];
        int mayor = 0;
        for (int i = 0; i < cantNum; i++) {

            System.out.println("Ingrese el valor del num. " + (i+1));
            numero[i] = capturador.nextInt();
        
            if (numero[i] > mayor) {
                mayor = numero[i];
            }

        }
        System.out.println("El mayor numero ingresado es " + mayor);
    }
}
