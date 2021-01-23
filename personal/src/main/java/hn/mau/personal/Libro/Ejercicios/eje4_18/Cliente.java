/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_18;

/**
 *
 * @author maureen
 */
public class Cliente {

    private int numCuenta;
    private double salInicial;
    private int totArticulosCargados;
    private int totCreditosAplicados;
    private double limCreditoPermitido;
    
    public Cliente(){
    super();
    }

    public Cliente(int numCuenta, double salInicial, int totArticulos, int totCreditosAplicados, double limCreditoPermitido) {
        this.numCuenta = numCuenta;
        this.salInicial = salInicial;
        this.totArticulosCargados = totArticulos;
        this.totCreditosAplicados = totCreditosAplicados;
        this.limCreditoPermitido = limCreditoPermitido;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getSalInicial() {
        return salInicial;
    }

    public void setSalInicial(double salInicial) {
        this.salInicial = salInicial;
    }

    public int getTotArticulosCargados() {
        return totArticulosCargados;
    }

    public void setTotArticulosCargados(int totArticulosCargados) {
        this.totArticulosCargados = totArticulosCargados;
    }

    public int getTotCreditosAplicados() {
        return totCreditosAplicados;
    }

    public void setTotCreditosAplicados(int totCreditosAplicados) {
        this.totCreditosAplicados = totCreditosAplicados;
    }

    public double getLimCreditoPermitido() {
        return limCreditoPermitido;
    }

    public void setLimCreditoPermitido(double limCreditoPermitido) {
        this.limCreditoPermitido = limCreditoPermitido;
    }
    
    
      public double obtenerSaldo() {
         double saldo;
         saldo = this.salInicial+ this.totArticulosCargados - this.totCreditosAplicados;
         
          if (saldo > this.limCreditoPermitido) {
              System.out.println("Se exedio del limite permitido");   
          }
        return saldo;
    }

}