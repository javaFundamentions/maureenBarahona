/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_19;

/**
 *
 * @author maureen
 */
public class VentasXVendedor {

    private int codArticulo;
    private int cantVendida;

    public VentasXVendedor() {
        super();
    }

    public VentasXVendedor(int codArticulo, int cantVendida) {
        this.codArticulo = codArticulo;
        this.cantVendida = cantVendida;
    }

    public int getCodArticulo() {
        return codArticulo;
    }

    public void setCodArticulo(int codArticulo) {
        this.codArticulo = codArticulo;
    }

    public int getCantVendida() {
        return cantVendida;
    }

    public void setCantVendida(int cantVendida) {
        this.cantVendida = cantVendida;
    }
    
    public double ObtenerValorArticulo(int codArticulo){
        double valor;
        
     switch (codArticulo) 
        {
            case 1: valor =239.99;
                     break;
            case 2:  valor = 129.75;
                     break;
            case 3:  valor = 99.95;
                     break;
            case 4:  valor = 350;
                     break;           
            default: valor = 0;
                     break;
        }
        return valor;
    }
    
    public void ComisionesXVendedor(double VentasBrutas){
      final double salSemanal = 200;
      
      double totalSemanal = salSemanal + (VentasBrutas*0.09);
      
        System.out.println("El salario semanal del venderor es de "+ totalSemanal);  
    
    }

}
