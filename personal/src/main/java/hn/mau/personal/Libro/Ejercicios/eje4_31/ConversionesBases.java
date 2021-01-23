/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.Libro.Ejercicios.eje4_31;

/**
 *
 * @author maureen
 */
public class ConversionesBases {

    private String conversion;
    private String conversion2;

    public void setDecimalBase(int numero, int base) {
        StringBuilder btemp = new StringBuilder();
        int residuo = 0;
        conversion = "";
        boolean comodin = true;

        String[] hex = new String[]{"A", "B", "C", "E", "F"};

        while (numero != 0) {
            comodin = true;
            residuo = (numero % base);
            for (int i = 10; i < 16; i++) {
                if (residuo == i) {
                    btemp.append(hex[i - 10]);
                    comodin = false;
                    break;
                }
            }
            if (comodin) {
                btemp.append(residuo);
            }

            numero = (int) (numero / base);

        }
        conversion = btemp.reverse().toString();
    }

    public void setBaseDecimal(String numero, int base) {
        conversion2 = "";
        int tmpnumero = 0;
        StringBuilder tmp = new StringBuilder();
        tmp.append(numero);
        numero = tmp.reverse().toString();
        for (int i = 0; i < numero.length(); i++) {
            tmpnumero += (Integer.parseInt(String.valueOf(numero.charAt(i)))
                    * (int) (Math.pow(base, i)));
        }
        conversion2 += tmpnumero;
    }

    public String getDecimalBase() {
        return conversion;
    }

    public String getBaseDecimal() {
        return conversion2;
    }
}
