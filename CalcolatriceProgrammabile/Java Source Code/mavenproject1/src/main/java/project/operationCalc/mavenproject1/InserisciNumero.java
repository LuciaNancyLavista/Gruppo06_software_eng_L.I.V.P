/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.operationCalc.mavenproject1;

/**
 *
 * @author Gabriele Imparato
 */
public class InserisciNumero {

    public void inserisci(String var, StackNum s){
        double newReal;
        double newImg;

        string[] parameters = var.split(" ");
        newReal = Double.parseDouble(parameters[1]);
        newImg  = Double.parseDouble(parameters[2]);

        s.push(new Complex(newReal, newImg));
    }

}
