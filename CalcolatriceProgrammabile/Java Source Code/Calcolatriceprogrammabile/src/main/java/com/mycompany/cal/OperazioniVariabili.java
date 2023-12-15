/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cal;

import project.exception.EmptyStackException;
import project.exception.InsertVariableException;
import java.util.LinkedHashMap;

/**
 *
 * @author Lavista Lucia Nancy and Michele Penna
 */
public class OperazioniVariabili{
    //dichiarazione LinkedHashMap con key(char) per riprendere la variabile e value(Complex) 
    //per richiamo dei numeri complessi
    private LinkedHashMap<Character, Complex> vars;
    private StackNum stackNum;

    //Costruttore
    public OperazioniVariabili(StackNum stack) {
        this.stackNum = stack;

        //creazione LinkedHashMap<>()
        vars = new LinkedHashMap<>();

        //inizializzazione variabili
        for(char variabile='a'; variabile<='z'; variabile++)
            vars.put(variabile, null);
    }

    //maggX preleva l’elemento superiore dallo stack(effettuando una top) e 
    //lo salva nella variabile "x"(affettua put in HashMap)
    public void maggX(String var) throws EmptyStackException{
        //controllo se lo stack è vuoto
        if (stackNum.isEmpty()) 
            throw new EmptyStackException("Errore: Stack vuoto. ");

        Complex x = stackNum.top();
        vars.put(var.charAt(0), x);
    }

    //Dopo aver effettuato una maggX, allora
    //minX inserisce il valore della variabile "x" nello stack(effettuando una push)
    public void minX(String var) throws InsertVariableException{
        
        //controllo se la variabile è stata inizializzata
        if (vars.get(var.charAt(0)) == null) 
            throw new InsertVariableException("Errore: variabile non inizializzata. ");

        Complex x = vars.get(var.charAt(0));
        stackNum.push(x);
    }

    //Dopo aver effettuato una maggX, allora
    //plusX aggiunge l’ultimo valore dello stack(effettua top) 
    //a quello della variabile "x"(effettua put)
    public Complex plusX(String var) throws InsertVariableException, EmptyStackException{
        
        //Controllo se la variabile è stata inizializzata
        if (vars.get(var.charAt(0)) == null) 
            throw new InsertVariableException("Errore: variabile non inizializzata. ");
        
        //Controllo se lo stack è vuoto
        if (stackNum.isEmpty()) 
            throw new EmptyStackException("Errore: Stack vuoto. ");

        Complex value = stackNum.top();
        Complex x = vars.get(var.charAt(0));

        //creazione di un nuovo complex da inserire nella variabile "x"
        double nReal = (x.getReal() + value.getReal());
        double nImg = (x.getImaginary() + value.getImaginary());
        Complex nc = new Complex(nReal,nImg);
        vars.put(var.charAt(0), nc);
        
        return nc;
    }

    //Dopo aver effettuato una maggX, allora
    //lessX sottrae il valore dell’ultimo elemento nello stack(effettua top) 
    //a quello della variabile "x"(effettua put)
    public Complex lessX(String var) throws EmptyStackException, InsertVariableException{
        
        //Controllo se la variabile è stata inizializzata
        if (vars.get(var.charAt(0)) == null) 
            throw new InsertVariableException("Errore: variabile non inizializzata. ");
        
        //Controllo se lo stack è vuoto
        if (stackNum.isEmpty()) 
            throw new EmptyStackException();

        Complex value = stackNum.top();
        Complex x = vars.get(var.charAt(0));

        //creazione di un nuovo complex da inserire nella variabile "x"
        double nReal = (x.getReal() - value.getReal());
        double nImg = (x.getImaginary() - value.getImaginary());
        Complex nc = new Complex(nReal,nImg);
        vars.put(var.charAt(0), nc);
        
        return nc;
    }
    
    
}
