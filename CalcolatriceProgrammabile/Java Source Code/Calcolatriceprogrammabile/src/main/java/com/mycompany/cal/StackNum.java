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
    private LinkedList<Complex> stack;
    
    
    public StackNum(){
        stack = new LinkedList<>();
    }
    
    public void push(Complex c){
        stack.addFirst(c);
    }
    
    public Complex top(){
        return stack.getFirst();
    }
    
    public void dup(){
        Complex temp = stack.getFirst();
        stack.addFirst(temp);    
    }
    
    public Complex drop(){
        return stack.removeFirst();
    }
    
    public void clear(){
        stack.clear();
        
    }
    public void over(){
        stack.addFirst(stack.get(1));
       
    }
   
    public void swap(){
        Complex e1 = stack.removeFirst();
        Complex e2 = stack.removeFirst();
        stack.addFirst(e1);
        stack.addFirst(e2);   
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    
    @Override
    public String toString(){
        return stack.toString();
    }
    
}
