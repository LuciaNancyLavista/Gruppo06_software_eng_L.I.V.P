/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.operationCalc.mavenproject1;

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
        Complex c1 = s.drop();
        Complex c2 = s.drop();
        double newReal = c1.getReal() - c2.getReal();
	    double newImg = c1.getImaginary() - c2.getImaginary();
        s.push(new Complex(newReal,newImg));
    }

    public void mult(StackNum s){
        Complex c1 = s.drop();
        Complex c2 = s.drop();
	    double newReal = c1.getReal()*c2.getReal() + c1.getImaginary()*c2.getImaginary();
	    double newImg = c1.getReal()*c2.getImaginary() + c1.getImaginary()*c2.getReal();
	    s.push(new Complex(newReal, newImg));	
    }

    public void div(StackNum s){
        Complex c1 = s.drop();
        Complex c2 = s.drop();
        double newReal;
        double newImg;
            if(c2.getReal() != 0 && c2.getImaginary() != 0){
                double divReal = (c2.getReal() * c1.getReal() + c2.getImaginary() * c1.getImaginary()) / (c1.getReal() * c1.getReal() + c1.getImaginary() * c1.getImaginary());
                double divImag = (c2.getImaginary() * c1.getReal() - c2.getReal() * c1.getImaginary()) / (c1.getReal() * c1.getReal() + c1.getImaginary() * c1.getImaginary());
                Complex result = new Complex(divReal, divImag);
                s.push(result);
            }else{
		        throw new ArithmeticException();
            }
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
    }

    public void invSign(StackNum s){
        Complex c = s.drop();
        s.push(new Complex(-c.getReal(),-c.getImaginary()));
    }

}
