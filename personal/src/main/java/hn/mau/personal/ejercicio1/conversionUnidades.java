/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class conversionUnidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            boolean on = true;
            String option;
            float value, km, hm, dam, m, dm, cm, mm;

            while (on) {
                Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
                System.out.println("-----Sistema de conversion de Longitud------");
                System.out.println("Cuantos metros deseas convertir");
                value = capturador.nextFloat();

                km = value * 1000;
                System.out.println(value + " metro(s) hay " + km + " kilometros");
                hm = km / 10;
                System.out.println(value + " metro(s) hay " + hm + " hectometros");
                dam = hm / 10;
                System.out.println(value + " metro(s) hay " + dam + " decametros");
                m = value;
                System.out.println(value + " metro(s) hay " + m + " metros");
                dm = (float) (m / 10.0);
                System.out.println(value + " metro(s) hay " + dm + " decimetros");
                cm = (float) (dm / 10.0);
                System.out.println(value + " metro(s) hay " + cm + " centimetros");
                mm = (float) (cm / 10.0);
                System.out.println(value + " metro(s) hay " + cm + " milimetros");

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
