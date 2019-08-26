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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sumar suma = new Sumar (0,0);
        Restar resta = new Restar (0,0);
        Multiplicar multiplicar = new Multiplicar (0,0);
        Dividir dividir = new Dividir (0,0);
        int retornar = 0;
        int opcion = 0;
        
        do{
                              opcion=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion"));
        
            switch(opcion){
                 case 1:
                     suma.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer valor a sumar"));
                     suma.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor a sumar"));
                    JOptionPane.showMessageDialog(null,"Total de la sumatoria: "+suma.sumatoria(suma.valor1,suma.valor2));
                 break;
                 case 2:
                     resta.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer valor a restar"));
                     resta.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor a restar"));
                     JOptionPane.showMessageDialog(null,"Total de la resta: "+resta.sustraccion(resta.valor1,resta.valor2));
                 break;
                  case 3:
                     multiplicar.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer valor a multiplicar"));
                     multiplicar.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor a multiplicar"));
                     JOptionPane.showMessageDialog(null,"Total de la multiplicacion: "+multiplicar.multiplicacion(multiplicar.valor1,multiplicar.valor2));
                 break;
                  case 4:
                    dividir.valor1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un primer valor a dividir"));
                    dividir.valor2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo valor a dividir"));
                    JOptionPane.showMessageDialog(null,"Total de la division: "+dividir.division(dividir.valor1,dividir.valor2));
                   
                break;     
                case 5:
                    
                break;     
                default:
                    JOptionPane.showMessageDialog(null,"Opcion no valida ");
                break;
            }
            retornar=Integer.parseInt(JOptionPane.showInputDialog("Desea continuar? \n"
                    + "1.Si \n"
                    + "2.No \n"));

        }while(retornar==1);            
    }
    
}
