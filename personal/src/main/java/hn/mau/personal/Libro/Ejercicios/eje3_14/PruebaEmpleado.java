/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje3_14;

/**
 *
 * @author maureen
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado ("Maureen","Barahona", 456.89);
        System.out.println("el saladio anual es "+ empleado.obtenerSalarioAnual());
        System.out.println("el procentaje de aumento anual sera "+ empleado.obtenerValAumento());
    }
}
