/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.personal.ejercicio1;

/**
 *
 * @author maureen
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class Calculadora extends JFrame {

    JTextField pantalla;

    double resultado;
    double resultado2;
    String operacion;
    JPanel panelNumeros, panelOperaciones;
    boolean nuevaOperacion = true;

    public Calculadora() {
        super();
        setSize(350, 400);
        setTitle("Calculadora Mau ");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new BorderLayout());

        pantalla = new JTextField("0", 20);
        pantalla.setBorder(new EmptyBorder(4, 4, 4, 4));
        pantalla.setFont(new Font("Arial", Font.BOLD, 25));
        pantalla.setHorizontalAlignment(JTextField.RIGHT);
        pantalla.setEditable(false);
        pantalla.setBackground(Color.WHITE);
        panel.add("North", pantalla);

        panelNumeros = new JPanel();
        panelNumeros.setLayout(new GridLayout(4, 3));
        panelNumeros.setBorder(new EmptyBorder(4, 4, 4, 4));

        for (int n = 9; n >= 0; n--) {
            nuevoBotonNumerico("" + n);
        }

        nuevoBotonNumerico(".");

        panel.add("Center", panelNumeros);

        panelOperaciones = new JPanel();
        panelOperaciones.setLayout(new GridLayout(6, 1));
        panelOperaciones.setBorder(new EmptyBorder(4, 4, 4, 4));

        nuevoBotonOperacion("+");
        nuevoBotonOperacion("-");
        nuevoBotonOperacion("*");
        nuevoBotonOperacion("/");
        nuevoBotonOperacion("√");
        nuevoBotonOperacion("^2");
        nuevoBotonOperacion("^x");
        nuevoBotonOperacion("sin(");
        nuevoBotonOperacion("cos(");
        nuevoBotonOperacion("tan(");
        nuevoBotonOperacion("=");
        nuevoBotonOperacion("CE");

        panel.add("East", panelOperaciones);

        validate();
    }

    private void nuevoBotonNumerico(String digito) {
        JButton btn = new JButton();
        btn.setText(digito);
        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                numeroPulsado(btn.getText());
            }
        });

        panelNumeros.add(btn);
    }

    private void nuevoBotonOperacion(String operacion) {
        JButton btn = new JButton(operacion);
        btn.setForeground(Color.RED);

        btn.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent evt) {
                JButton btn = (JButton) evt.getSource();
                operacionPulsado(btn.getText());
            }
        });

        panelOperaciones.add(btn);
    }

    private void numeroPulsado(String digito) {
        if (pantalla.getText().equals("0") || nuevaOperacion) {
            pantalla.setText(digito);
        } else {
            pantalla.setText(pantalla.getText() + digito);
        }
        nuevaOperacion = false;
    }

    private void operacionPulsado(String tecla) {
        if (tecla.equals("=")) {
            calcularResultado();
        } else if (tecla.equals("CE")) {
            resultado = 0;
            pantalla.setText("");
            nuevaOperacion = true;
        } else {
            operacion = tecla;
            if ((resultado > 0) && !nuevaOperacion) {
                calcularResultado();
            } else {
                resultado = new Double(pantalla.getText());
            }
        }

        nuevaOperacion = true;
    }

    private void calcularResultado() {
        Double i = new Double(pantalla.getText());
        
        if (operacion.equals("+")) { //suma
            resultado += new Double(pantalla.getText());
        } else if (operacion.equals("-")) { //resta
            resultado -= new Double(pantalla.getText());
        } else if (operacion.equals("/")) { //division
            resultado /= new Double(pantalla.getText());
        } else if (operacion.equals("*")) { //multiplicacion
            resultado *= new Double(pantalla.getText());
        } else if (operacion.equals("√")) { //raiz cuadrada
            resultado = Math.sqrt(i);
        } else if (operacion.equals("sin(")) { //angulo seno
            Double i2 = i * Math.PI / 180;
            resultado = Math.sin(i2);
        } else if (operacion.equals("cos(")) { //angulo coseno
            Double i2 = i * Math.PI / 180;
            resultado = Math.cos(i2);
        } else if (operacion.equals("tan(")) { //angulo tangente
            Double i2 = i * Math.PI / 180;
            resultado = Math.tan(i2);
        } else if (operacion.equals("^2")) {  //elevado a la 2
            resultado = (int) Math.pow(i, 2);
        } else if (operacion.equals("^x")) { //elevado a la x
            resultado = (int) Math.pow(resultado, i);
        }
        pantalla.setText("" + resultado);
        operacion = "";
    }
}
