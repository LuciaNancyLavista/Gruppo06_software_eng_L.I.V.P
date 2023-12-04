/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project.operationCalc.mavenproject1;

/**
 *
 * @author luigi
 */
public class TestStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackNum s = new StackNum();
        
        System.out.println("Test Push");
        for(int i =0;i<10;i++){
            s.push(new Complex(i,i-1));
        }
        s.push(new Complex(0,11));
        System.out.println(s);
        
        System.out.println("Test drop");
        Complex temp = s.drop();
        System.out.println("Elemento rimosso: " + temp);
        System.out.println(s);
        
        System.out.println("Test over");
        s.over();
        System.out.println(s);
        
        System.out.println("Test swap");
        s.swap();
        System.out.println(s);
        
        System.out.println("Test dup");
        s.dup();
        System.out.println(s);
        
        System.out.println("Test Clear");
        s.clear();
        System.out.println(s);
    }
    
}
