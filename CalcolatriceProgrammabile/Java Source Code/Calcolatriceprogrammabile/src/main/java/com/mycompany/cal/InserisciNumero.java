/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cal;

/**
 *
 * @author Gabriele Imparato
 */
public class InserisciNumero {

    public void inserisci(String var, StackNum s){
        double newReal;
        double newImg;

        String[] parameters = var.split(" ");
        newReal = Double.parseDouble(parameters[0]);
        newImg  = Double.parseDouble(parameters[1]);

        s.push(new Complex(newReal, newImg));
    }

}
