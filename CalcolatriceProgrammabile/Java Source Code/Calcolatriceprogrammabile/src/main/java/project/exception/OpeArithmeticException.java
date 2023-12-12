/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package project.exception;

/**
 *
 * @author nancy
 */
public class OpeArithmeticException extends Exception{

    /**
     * Creates a new instance of <code>ArithmeticException</code> without detail
     * message.
     */
    public OpeArithmeticException() {
    }

    /**
     * Constructs an instance of <code>ArithmeticException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OpeArithmeticException(String msg) {
        super(msg);
    }
}
