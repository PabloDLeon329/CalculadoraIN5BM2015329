/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pablodeleon.sistema;

import javax.swing.JOptionPane;

/**
 *
 * @author programacion
 */
public class Dividir {
 int valor1;
 int valor2;

    public Dividir(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public double division(int valor1, int valor2) {
                        if(valor2==0){
                       JOptionPane.showMessageDialog(null,"Error matematico");
                    }
                    else{
                    }   
        return valor1 / valor2;
   }   
 
}
