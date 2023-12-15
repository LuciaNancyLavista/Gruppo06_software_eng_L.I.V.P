/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cal;
import project.exception.*;

/**
 *
 * @author Gabriele Imparato
 */
public class InserisciNumero {

    // metodo inserisci per analizzare il numero che si è scritto nel text field della calcolatrice
    public void inserisci(String var, StackNum s) throws WrongNumberException{
        double newReal;
        double newImg;
        int cont=0;

        for(int i =0;i<var.length();i++){
            if(var.charAt(i) == ' ')
                cont++;
        }
        if(cont > 1)
            throw new WrongNumberException("Numero parametri errati");
            
        // suddivisione in reale e immaginario, i quali si distinguono da uno spazio insirito tra i due
        String[] parameters = var.split(" ");
        newReal = Double.parseDouble(parameters[0]);
        newImg  = Double.parseDouble(parameters[1]);

        // inserimento del numero complesso nello stack
        s.push(new Complex(newReal, newImg));
    }

}
