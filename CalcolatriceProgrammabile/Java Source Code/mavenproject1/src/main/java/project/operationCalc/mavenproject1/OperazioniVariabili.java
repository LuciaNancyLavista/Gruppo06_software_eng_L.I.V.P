/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcolatriceprogrammabile;

import java.util.LinkedHashMap;

/**
 *
 * @author nancy
 */
public class OperazioniVariabili{
    private LinkedHashMap<Character, Complex> vars;
    private StackNum stackNum;

    public OperazioniVariabili(StackNum stack) {
        this.stackNum = stack;
        
        vars = new LinkedHashMap<>();
        
        for(char variabile='a'; variabile<='z'; variabile++)
            vars.put(variabile, null);
    }

    public void maggX(String var) throws EmptyStackException{
        if (stackNum.stack.isEmpty()) 
            throw new EmptyStackException("Errore: Stack vuoto. ");

        Complex x = stackNum.top();
        vars.put(var.charAt(0), x);
    }

    public void minX(String var) throws InsertVariableException{
        //
        if (vars.get(var.charAt(0)) == null) 
            throw new InsertVariableException("Errore: variabile non inizializzata. ");

        Complex x = vars.get(var.charAt(0));
        stackNum.push(x);
    }

    public Complex plusX(String var) throws InsertVariableException, EmptyStackException{
        
        if (vars.get(var.charAt(0)) == null) 
            throw new InsertVariableException("Errore: variabile non inizializzata. ");

        if (stackNum.stack.isEmpty()) 
            throw new EmptyStackException("Errore: Stack vuoto. ");

        Complex value = stackNum.drop();
        Complex x = vars.get(var.charAt(0));
        
        x.setReal(x.getReal() + value.getReal());
        x.setImaginary(x.getImaginary() + value.getImaginary());
        vars.put(var.charAt(0), x);
        
        return x;
    }

    public Complex lessX(String var) throws EmptyStackException, InsertVariableException{
        
        if (vars.get(var.charAt(0)) == null) 
            throw new InsertVariableException("Errore: variabile non inizializzata. ");

        if (stackNum.stack.isEmpty()) 
            throw new EmptyStackException();

        Complex value = stackNum.drop();
        Complex x = vars.get(var.charAt(0));
        
        x.setReal(x.getReal() - value.getReal());
        x.setImaginary(x.getImaginary() - value.getImaginary());
        vars.put(var.charAt(0), x);
        
        return x;
    }
}
