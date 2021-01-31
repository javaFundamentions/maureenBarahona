/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje5_12;

/**
 *
 * @author maureen
 * @code Escriba una aplicación que calcule el producto de los enteros impares del 1 al 15.
 */
public class productoImpares {

    public static void main(String[] args) {
        long producto = 1;
        int cont = 0;
        for (int i = 1; i < 30; i += 2) {
            producto *= i;
            System.out.println("i:" + i);
            cont++;
        }
        System.out.println("El producto es: " + producto);
        System.out.println("cantidad de numeros evaluados:" + cont);
    }

}
