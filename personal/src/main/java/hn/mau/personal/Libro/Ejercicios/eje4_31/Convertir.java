/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_31;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class Convertir {

    public static void main(String[] args) {
        String evalua;
        int valor;
        boolean on = true;
        Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
        while (on) {
            System.out.println("-----Calculadora de Binaro - decimal / decimal - binario ------");
            System.out.println("Ingrese B si desea ingresar binarios y D si desea ingrear Decimales  ");

            evalua = capturador.next();
            System.out.println("Ingrese el valor a convertir");
            valor = capturador.nextInt();
            ConversionesBases d = new ConversionesBases();

            if (evalua.equals("D")) {
                d.setDecimalBase(valor, 2);

                System.out.println(d.getDecimalBase());
            } else if (evalua.equals("B")) {
                d.setBaseDecimal(valor + "", 2);
                System.out.println(d.getBaseDecimal());
            } else {
                System.out.println("No es una opcion valida");
            }

            System.out.println(" presione cualquier tecla para continuar , para salir presione x");

            if ("x".equals(capturador.next())) {
                on = false;
            }
        }

    }
}
