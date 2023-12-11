/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package project.exception;

/**
 *
 * @author nancy
 */
public class WrongNumberException extends Exception{

    /**
     * Creates a new instance of <code>WrongNumberException</code> without
     * detail message.
     */
    public WrongNumberException() {
    }

    /**
     * Constructs an instance of <code>WrongNumberException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public WrongNumberException(String msg) {
        super(msg);
    }
}
