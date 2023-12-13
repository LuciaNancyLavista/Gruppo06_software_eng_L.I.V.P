package com.mycompany.cal;
import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *
 * @author Gabriele Imparato
 */

public class Complex {
    private double real;
    private double imaginary;

	// costruttore della classe Complex
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
	// creazioen metodo toString per richiamano successivo a video della calcolatrice
    @Override
    public String toString(){
        String format = "#.###";
        NumberFormat formatter = new DecimalFormat(format);
	StringBuffer sb = new StringBuffer();
	String oprImag = (this.imaginary > 0 ? " + " : " - ");
	boolean imgZero = this.imaginary == 0;
	boolean realZero = this.real == 0;
        String f1 = formatter.format(this.real);
        String f2 = formatter.format(Math.abs(this.imaginary));
	    // visione a video come double
	if(imgZero && realZero)
		sb.append("0.0");
        else if(imgZero){
		sb.append(f1);
	}else if(realZero){
                sb.append((this.imaginary > 0 ? "" : oprImag));
		sb.append(f2);
		sb.append("i");
	}else{
		String app = f1 + oprImag + f2 + "i";
		sb.append(app);
	}
	
	return sb.toString();
    }

}
