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

    // Implementazione metodo Addition: somma di due numeri complessi
    public void add(StackNum s){

	// controllo se sono stati inseriti almeno 2 numeri richiamando l'eccezione sullo stack
	if (s.stack.size() < 2) 
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
    public void sub(StackNum s){

	// controllo se sono stati inseriti almeno 2 numeri richiamando l'eccezione sullo stack
	if (s.stack.size() < 2) 
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
    public void mult(StackNum s){

	// controllo se sono stati inseriti almeno 2 numeri richiamando l'eccezione sullo stack
	if (s.stack.size() < 2) 
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
    public void div(StackNum s){

	// controllo se sono stati inseriti almeno 2 numeri richiamando l'eccezione sullo stack
	if (s.stack.size() < 2) 
            throw new EmptyStackException("Inserire almeno due numeri nello stack. ");

	// prelevamento dallo stack
        Complex c2 = s.drop();
        Complex c1 = s.drop();

	// se la parte immaginare del divisore è uguale a 0 allora lancio l'eccezione aritmetica
	if (c2.getImaginary() == 0) 
            throw new ArithmeticException("Errore: Divisione per zero. ");
	    
	// divido in parte reale ed immaginaria così da poter effettuare la divisione 
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

	// inserisco il risultato nello stack
	s.push(new Complex(newReal,newImag));
    }	

	// Implementazione metodo Square Root: radice quadrata di un numero complesso
    public void sqrt(StackNum s){

	// controllo se lo stack è vuoto (ci serve solo un numero per sqrt) lanciando l'eccezione che riguarda lo stack
	if (s.stack.isEmpty()) 
            throw new EmptyStackException("Stack vuoto: serve almeno un numero. ");

	// prelevamento dallo stack
        Complex c = s.drop();

	// assegnazione di reale ed immaginario per poter effettuare la radice quadrata
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
	    // scrittura nello stack, sono due risultati visto che la radice quadrata ritorna due soluzioni
	    s.push(new Complex(newReal, newImg));
            s.push(new Complex(newReal, newImg));
            
    }

	// Implementazione metodo Inversion Sign: inversione del segno di un numero complesso
    public void invSign(StackNum s){

	// controllo se lo stack è vuoto (visto che ci serve solo un numero per questa operazione) lanciando un'eccezione sullo stack
	if (s.stack.isEmpty()) 
	    throw new EmptyStackException("Stack vuoto: serve almeno un numero. ");

	// prelevamento dallo stack
        Complex c = s.drop();

	// scrittura del risultato nello stack
        s.push(new Complex(-1.0*c.getReal(),-1.0*c.getImaginary()));
    }

}
