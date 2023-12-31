/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cal;

import project.exception.*;

/**
 *
 * @author Gabriele Imparato
 */
public class InserisciOperazioni {

    // Implementazione metodo Addition: somma di due numeri complessi
    public void add(StackNum s) throws EmptyStackException{

	// controllo se sono stati inseriti almeno 2 numeri 
        // richiamando l'eccezione sullo stack
	if (s.stackSize()< 2) 
            throw new EmptyStackException("Inserire almeno due numeri nello stack. ");

	// prelevamento dallo stack
        Complex c1 = s.drop();
        Complex c2 = s.drop();
	    
	// divido in parte reale ed immaginaria così da poter effettuare la somma 
        double newReal = c1.getReal() + c2.getReal();
        double newImg = c1.getImaginary() + c2.getImaginary();
	    
	//inserimento nello stack del risultato
	s.push(new Complex(newReal, newImg));
    }

    // Implementazione metodo Substraction: sottrazione tra due numeri complessi
    public void sub(StackNum s) throws EmptyStackException{

	// controllo se sono stati inseriti almeno 2 numeri richiamando l'eccezione sullo stack
	if (s.stackSize() < 2) 
            throw new EmptyStackException("Inserire almeno due numeri nello stack. ");

	// prelevamento dallo stack
        Complex c2 = s.drop();
        Complex c1 = s.drop();

	// divido in parte reale ed immaginaria così da poter effettuare la sottrazione 
        double newReal = c1.getReal() - c2.getReal();
	double newImg = c1.getImaginary() - c2.getImaginary();

	//inserimento nello stack del risultato
        s.push(new Complex(newReal,newImg));
    }

    // Implementazione metodo Multiplication: moltiplicazione di due numeri complessi
    public void mult(StackNum s) throws EmptyStackException{

	// controllo se sono stati inseriti almeno 2 numeri richiamando l'eccezione sullo stack
	if (s.stackSize()< 2) 
            throw new EmptyStackException("Inserire almeno due numeri nello stack. ");

	// prelevamento dallo stack
        Complex c1 = s.drop();
        Complex c2 = s.drop();

	// divido in parte reale ed immaginaria così da poter effettuare la moltiplicazione 
	double newReal = c1.getReal()*c2.getReal() - c1.getImaginary()*c2.getImaginary();
    	double newImg = c1.getReal()*c2.getImaginary() + c1.getImaginary()*c2.getReal();

	//inserimento nello stack del risultato
	s.push(new Complex(newReal, newImg));	
    }

    // Implementazione metodo Division: divisione tra due numeri complessi
    public void div(StackNum s) throws EmptyStackException,OpeArithmeticException{

	// controllo se sono stati inseriti almeno 2 numeri richiamando l'eccezione sullo stack
	if (s.stackSize() < 2) 
            throw new EmptyStackException("Inserire almeno due numeri nello stack. ");
        
	// prelevamento dallo stack
        Complex c2 = s.drop();
        Complex c1 = s.drop();

	// se il divisore è uguale a 0 allora lancio l'eccezione aritmetica e reinserisco i valori
        //droppati nello stack
	if (c2.getImaginary() == 0 && c2.getReal() == 0){
            s.push(c1);
            s.push(c2);
            throw new OpeArithmeticException("Errore: Divisione per zero. ");
        }  
        
	// divido in parte reale ed immaginaria così da poter effettuare la divisione 
	double zreal = 0;
	double zimag = 0;
	if(c2.getReal() != 0)
		zreal = Math.pow(c2.getReal(),2);
	if(c2.getImaginary() != 0)
		zimag = Math.pow(c2.getImaginary(),2);
        
	double ac = c1.getReal()*c2.getReal();
	double bd = c1.getImaginary()*c2.getImaginary();
	double bc = c1.getImaginary()*c2.getReal();
	double ad = c1.getReal()*c2.getImaginary();

	double newReal = (ac+bd)/(zreal+zimag);
	double newImag = (bc-ad)/(zreal+zimag);

	// inserisco il risultato nello stack
	s.push(new Complex(newReal,newImag));
    }	

    // Implementazione metodo Square Root: radice quadrata di un numero complesso
    public void sqrt(StackNum s) throws EmptyStackException{
        if(s.isEmpty())
            throw new EmptyStackException();
        Complex c = s.drop();
        double newReal = 0;
        double newImg = 0;
        double a = c.getReal();
        double b = c.getImaginary();
        
        if(b != 0){
            double module = Math.sqrt(a*a + b*b);
            newReal = Math.sqrt((module+a)/2);
            newImg =Math.signum(b)*Math.sqrt((module-a)/2);
        }else if(b == 0 && a < 0){
            newReal = 0;
            newImg = Math.sqrt(Math.abs(a));
        }else{
            newReal = Math.sqrt(a);
            newImg = 0;
        }
        
        s.push(new Complex(newReal,newImg));
        s.push(new Complex(-newReal, -newImg));
    }

    // Implementazione metodo Inversion Sign: inversione del segno di un numero complesso
    public void invSign(StackNum s) throws EmptyStackException{

	// controllo se lo stack è vuoto	
        if (s.isEmpty()) 
	    throw new EmptyStackException("Stack vuoto: serve almeno un numero. ");

	// prelevamento dallo stack
        Complex c = s.drop();

	// scrittura del risultato nello stack
        s.push(new Complex(-1.0*c.getReal(),-1.0*c.getImaginary()));
    }

}
