package project.operationCalc.mavenproject1;
import java.lang.Math;

/**
 *
 * @author Gabriele Imparato
 */

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // getter methods
    public double getReal(){
        return this.real;
    }

    public double getImaginary(){
        return this.imaginary;
    }
    
    // setter methods
    public void setReal(double real){
        this.real = real;
    }

    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }

    // Override methods
    @Override
    public String toString(){
	boolean img = this.imaginary != 0;
	String opr = (this.imaginary >0 && img ? "+" : " - ");
	return (this.real != 0 ? this.real : "") + opr + 
	       (this.imaginary != 0 ? "i" + Math.abs(this.imaginary): "");
    }

}