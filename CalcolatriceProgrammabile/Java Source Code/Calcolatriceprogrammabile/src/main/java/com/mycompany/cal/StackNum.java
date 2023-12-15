/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cal;

import java.util.LinkedList;

/**
 *
 * @author luigi
 */
public class StackNum {
    //dichiarazione di una LinkedList per lo stack di tipo Complex, così da poter inserire un complesso
    private LinkedList<Complex> stack;
    
    // definizione costruttore
    public StackNum(){
        stack = new LinkedList<>();
    }

    // metodo push per inserire il numero complesso nello stack
    public void push(Complex c){
        stack.addFirst(c);
    }

    // metodo top per acquisire il numero complesso in testa dello stack
    public Complex top(){
        return stack.getFirst();
    }

    // metodo dup per inserire il numero complesso (top) duplicato nello stack
    public void dup(){
        Complex temp = stack.getFirst();
        stack.addFirst(temp);    
    }

    // metodo drop per rimuovere il numero complesso in testa dallo stack
    public Complex drop(){
        return stack.removeFirst();
    }

    // metodo clear per pulire lo stack
    public void clear(){
        stack.clear();    
    }

    // metodo over per duplicare il penultimo elemento dello stack e inserirlo in testa
    public void over() throws Exception{
        
        if(stack.size() < 2)
            throw new Exception();
        
        stack.addFirst(stack.get(1));
    }

    // metodo swap per scambiare gli ultimi due numeri inseriti nello stack
    public void swap() throws Exception{
        
        if(stack.size() < 2)
            throw new Exception();
        
        // prima si eliminano dallo stack
        Complex e1 = stack.removeFirst();
        Complex e2 = stack.removeFirst();

        // posizionamento nello stack
        stack.addFirst(e1);
        stack.addFirst(e2);   
    }

    // metodo isEmpty per verifica se lo stack è vuoto
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    //metodo stackSize per ottenere la dimensione dello stack
    public int stackSize(){
        return stack.size();
    }

    // metodo toString per la stampa dello stack
    @Override
    public String toString(){
        return stack.toString();
    }
    
}
