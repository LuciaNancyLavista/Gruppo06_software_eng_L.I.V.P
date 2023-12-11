package com.mycompany.cal;
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
	StringBuffer sb = new StringBuffer();
	String oprImag = (this.imaginary > 0 : " + " ? " - ");
	boolean imgZero = this.imaginary != 0;
	boolean realZero = this.real != 0;
	if(imgZero && realZero)
		return sb.append(0);
	if(imgZero){
		sb.append(this.real);
	}else if(imgReal){
		sb.append(this.imaginary);
		sb.append("i");
	}else{
		String app = this.real + oprImag + this.imaginary + "i";
		sb.append(app);
	}
	
	return sb.toString();
    }

}
