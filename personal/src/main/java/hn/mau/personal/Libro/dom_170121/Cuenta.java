/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.dom_170121;

/**
 *
 * @author maureen
 */
public class Cuenta {

    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial > 0.0) {
            saldo = saldoInicial;
        }
    }

    public void abonar(double monto) {
        saldo = saldo + monto;
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
