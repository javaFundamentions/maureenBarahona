/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_20;

/**
 *
 * @author maureen
 */
public class SalarioEmpleados {

    private String nomEmpleado;
    private double sueldoBruto;
    private double horaSemanales;
    private double tarifaXHora;

    public SalarioEmpleados() {
        super();
    }

    public SalarioEmpleados(String nomEmpleado, double sueldoBruto, double horaSemanales, double tarifaXHora) {
        this.nomEmpleado = nomEmpleado;
        this.sueldoBruto = sueldoBruto;
        this.horaSemanales = horaSemanales;
        this.tarifaXHora = tarifaXHora;
    }

    public String getNomEmpleado() {
        return nomEmpleado;
    }

    public void setNomEmpleado(String nomEmpleado) {
        this.nomEmpleado = nomEmpleado;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public double getHoraSemanales() {
        return horaSemanales;
    }

    public void setHoraSemanales(double horaSemanales) {
        this.horaSemanales = horaSemanales;
    }

    public double getTarifaXHora() {
        return tarifaXHora;
    }

    public void setTarifaXHora(double tarifaXHora) {
        this.tarifaXHora = tarifaXHora;
    }

    public void obtenerSalarioBruto() {
        double salBruto;
        if (this.horaSemanales <= 40) {
            salBruto = this.tarifaXHora * this.horaSemanales;

        } else {
            salBruto = (this.tarifaXHora * 40) + (((this.horaSemanales - 40) * this.tarifaXHora)/2);
        }
        this.setSueldoBruto(salBruto);
        
         System.out.printf("%-20s%-20s%-20s%-20s\n",this.nomEmpleado,this.horaSemanales,this.tarifaXHora, this.sueldoBruto);

    }
    
   
}
