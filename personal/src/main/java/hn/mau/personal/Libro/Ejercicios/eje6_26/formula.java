/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje6_26;

/**
 *
 * @author maureen
 */
public class formula {

    public String invierte(int y) {
        String invertido = "";
        for (int i = 1; i < y; i *= 10) {
            invertido += (y / i % 10);

        }
        return invertido;
    }

}
