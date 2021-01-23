/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_17;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class PruebaRegistro {

    public static void main(String[] args) {
        try {
            boolean on = true;
            String option;
            float value, km, hm, dam, m, dm, cm, mm;

            while (on) {
                RegistroCombustible reg1 = new RegistroCombustible();
                Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
                System.out.println("-----Ingrese su registro reabastecimiento de gasolina------");
                System.out.println("Ingrese los kms conducidos");
                value = capturador.nextInt();
                reg1.setKm_conducidos((int) value);

                System.out.println("Ingrese los litros usados");
                value = capturador.nextInt();
                reg1.setLts_usados((int) value);

                System.out.println(" la cantidad de kilometros por litros son " + reg1.obtenerKmsXLts());

                System.out.println(" presione cualquier tecla para continual , para salir presione x");
                option = capturador.next();

                if ("x".equals(option)) {
                    on = false;
                }

            }

        } catch (Exception e) {
        }
    }
}
