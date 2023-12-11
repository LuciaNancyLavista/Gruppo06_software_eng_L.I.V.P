/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cal;

/**
 *
 * @author Gabriele Imparato
 */
public class InserisciOperazioni {

    // class methods
    public void add(StackNum s){
        Complex c1 = s.drop();
        Complex c2 = s.drop();
        double newReal = c1.getReal() + c2.getReal();
        double newImg = c1.getImaginary() + c2.getImaginary();
	    s.push(new Complex(newReal, newImg));
    }

    public void sub(StackNum s){
        Complex c2 = s.drop();
        Complex c1 = s.drop();
        double newReal = c1.getReal() - c2.getReal();
	double newImg = c1.getImaginary() - c2.getImaginary();
        s.push(new Complex(newReal,newImg));
    }

    public void mult(StackNum s){
        Complex c1 = s.drop();
        Complex c2 = s.drop();
	    double newReal = c1.getReal()*c2.getReal() - c1.getImaginary()*c2.getImaginary();
	    double newImg = c1.getReal()*c2.getImaginary() + c1.getImaginary()*c2.getReal();
	    s.push(new Complex(newReal, newImg));	
    }

    
    public void div(StackNum s){
        Complex c2 = s.drop();
        Complex c1 = s.drop();
	
	
	double zreal = 0;
	double zimag = 0;
	
	if(c2.getReal() != 0)
		zreal = Math.pow(c2.getReal(),2);
	if(c2.getImaginary() != 0)
		zimag = Math.pow(c2.getImaginary(),2);
        

	double ac = c1.getReal()*c2.getReal();
	double bd = c1.getImaginary()*c2.getImaginary();
	double bc = c1.getReal()*c2.getReal();
	double ad = c1.getImaginary()*c2.getImaginary();

	double newReal = (ac+bd)/(zreal+zimag);
	double newImag = (bc-ad)/(zreal+zimag);

	s.push(new Complex(newReal,newImag));
    }	

    public void sqrt(StackNum s){
        Complex c = s.drop();
	double newReal;
        double newImg;
        if(c.getImaginary() != 0){
            if(c.getReal() < 0){
                newImg = Math.sqrt(Math.abs(c.getReal()));
		        newReal = 0;
		    }else{
                    double module = Math.sqrt((c.getReal()*c.getReal()) + (c.getImaginary()*c.getImaginary()));
                    newReal = Math.sqrt(Math.sqrt(module+c.getReal())/2);
                    newImg =(c.getImaginary()/Math.abs(c.getImaginary()))*
					   Math.sqrt((module-c.getReal())/2);
	        }
        }else{
            newReal = Math.sqrt(c.getReal());
            newImg = 0;
        }
	    s.push(new Complex(newReal, newImg));
            s.push(new Complex(newReal, newImg));
            
    }

    public void invSign(StackNum s){
        Complex c = s.drop();
        s.push(new Complex(-1.0*c.getReal(),-1.0*c.getImaginary()));
    }

}
