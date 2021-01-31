/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje6_26;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class main {

    public static void main(String[] args) {
        int num;
        formula form = new formula();
        Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        System.out.println("\nEste programa recibe un entero y lo presenta con los ");
        System.out.println("digitos invertidos. ");
        System.out.println("\nPor favor introduzca un numero: ");
        num = capturador.nextInt();
        
         System.out.println("\nEste es el numero invertido:\n "+ form.invierte(num));
        
       

    }
}
