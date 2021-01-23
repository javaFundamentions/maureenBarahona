/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_26;

/**
 *
 * @author maureen
 */
public class Misterio3 {

    public static void main(String args[]) {
        int fila = 10;
        int columna;
        while (fila >= 1) {
            columna = 1;
            while (columna <= 10) {
                System.out.print(fila % 2 == 1 ? "<" : ">");
                ++columna;
            } 
            --fila;
            System.out.println();
        } 
    } 
}
