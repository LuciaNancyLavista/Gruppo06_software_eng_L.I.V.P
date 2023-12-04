/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package project.operationCalc.mavenproject1.exception;

/**
 *
 * @author nancy
 */
public class ArithmeticException extends Exception{

    /**
     * Creates a new instance of <code>ArithmeticException</code> without detail
     * message.
     */
    public ArithmeticException() {
    }

    /**
     * Constructs an instance of <code>ArithmeticException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ArithmeticException(String msg) {
        super(msg);
    }
}