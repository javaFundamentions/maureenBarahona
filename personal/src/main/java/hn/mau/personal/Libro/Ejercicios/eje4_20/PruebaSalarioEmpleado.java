/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_20;

import java.util.Scanner;

/**
 *
 * @author maureen
 */
public class PruebaSalarioEmpleado {

    public static void main(String[] args) {
        boolean on = true;
        while (on) {
            SalarioEmpleados emp1 = new SalarioEmpleados();
            SalarioEmpleados emp2 = new SalarioEmpleados();
            SalarioEmpleados emp3 = new SalarioEmpleados();
            Scanner capturador = new Scanner(System.in, "ISO-8859-1").useDelimiter("\\n");
            System.out.println("-----Sistema de calculo de salario------");
            System.out.println("Ingrese el nombre del empleado 1  ");
            emp1.setNomEmpleado(capturador.next());
            System.out.println("Ingrese la cantidad de horas trabajadas ");
            emp1.setHoraSemanales(capturador.nextDouble());
            System.out.println("Ingrese la tarifa por hora de ese empleado");
            emp1.setTarifaXHora(capturador.nextDouble());

            System.out.println("Ingrese el nombre del empleado 2  ");
            emp2.setNomEmpleado(capturador.next());
            System.out.println("Ingrese la cantidad de horas trabajadas ");
            emp2.setHoraSemanales(capturador.nextDouble());
            System.out.println("Ingrese la tarifa por hora de ese empleado");
            emp2.setTarifaXHora(capturador.nextDouble());

            System.out.println("Ingrese el nombre del empleado 3 ");
            emp3.setNomEmpleado(capturador.next());
            System.out.println("Ingrese la cantidad de horas trabajadas ");
            emp3.setHoraSemanales(capturador.nextDouble());
            System.out.println("Ingrese la tarifa por hora de ese empleado");
            emp3.setTarifaXHora(capturador.nextDouble());

            System.out.printf("%-20s%-20s%-20s%-20s\n", "Empleado", "Horas Semanal", "Tarifa", "Salario Bruto");
            emp1.obtenerSalarioBruto();
            emp2.obtenerSalarioBruto();
            emp3.obtenerSalarioBruto();

            System.out.println(" presione cualquier tecla para continuar , para salir presione x");

            if ("x".equals(capturador.next())) {
                on = false;
            }
        }

    }
}
