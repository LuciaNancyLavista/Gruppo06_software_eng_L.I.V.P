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
    private LinkedList<Integer> stack;
    
    
    public StackNum(){
        stack = new LinkedList<>();
    }
    
    public void push(int c){
        stack.add(c);
    }
    
    public int top(){
        return stack.getLast();
    }
    
    public void dup(){
        int temp = stack.getLast();
        stack.add(temp);    
    }
    
    public int drop(){
        return stack.removeLast();
    }
    
    public void clear(){
        stack.clear();
        
    }
    public void over(){
        stack.add(stack.get(stack.size() - 2));
       
    }
   
    public void swap(){
        int e1 = stack.removeLast();
        int e2 = stack.removeLast();
        stack.add(e1);
        stack.add(e2);   
    }
    
    @Override
    public String toString(){
        return stack.toString();
    }
    
}
