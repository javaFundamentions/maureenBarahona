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
public class Empleado {

    private String nombre;
    private String apellido;
    private double salMensual;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, String apellido, double salMensual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salMensual = salMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalMensual() {
        return salMensual;
    }

    public void setSalMensual(double salMensual) {
        this.salMensual = salMensual;
    }

    public double obtenerSalarioAnual() {
        double salAnual;

        salAnual = this.salMensual * 12;

        if (salAnual < 0) {
            salAnual = 0.0;
        }
        return salAnual;
    }

    public double obtenerValAumento() {

        double aumento;

        aumento = (this.salMensual * 0.10);

        return aumento;

    }

}
