/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.operationCalc.mavenproject1;

import java.util.LinkedList;

/**
 *
 * @author luigi
 */
public class StackNum {
    protected LinkedList<Complex> stack;
    
    
    public StackNum(){
        stack = new LinkedList<>();
    }
    
    public void push(Complex c){
        stack.add(c);
    }
    
    public Complex top(){
        return stack.getLast();
    }
    
    public void dup(){
        Complex temp = stack.getLast();
        stack.add(temp);    
    }
    
    public Complex drop(){
        return stack.removeLast();
    }
    
    public void clear(){
        stack.clear();
        
    }
    public void over(){
        stack.add(stack.get(stack.size() - 2));
       
    }
   
    public void swap(){
        Complex e1 = stack.removeLast();
        Complex e2 = stack.removeLast();
        stack.add(e1);
        stack.add(e2);   
    }
    
    @Override
    public String toString(){
        return stack.toString();
    }
    
}
