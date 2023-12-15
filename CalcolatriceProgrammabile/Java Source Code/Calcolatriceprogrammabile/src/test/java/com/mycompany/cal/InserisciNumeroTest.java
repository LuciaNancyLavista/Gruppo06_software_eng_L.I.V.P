/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import project.exception.*;

/**
 *
 * @author luigi
 */
public class InserisciNumeroTest {
    
    public InserisciNumeroTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of inserisci method, of class InserisciNumero.
     */
    @Test
    public void testInserisci1_1() throws WrongNumberException {
        System.out.println("Test testInserisci1.1 con parte reale e immaginaria positive.");
        System.out.println("-> in: \"13.21 90.52\" - out: \"13.21 + 90.52i\"\n");
        
        String var = "13.21 90.52";
        StackNum s = new StackNum();
        InserisciNumero instance=new InserisciNumero();
        instance.inserisci(var,s);
        String result= new Complex(13.21,90.52).toString();
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(result,s.top().toString());
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testInserisci1_2() throws WrongNumberException {
        System.out.println("Test testInserisci1.2 con parte reale positiva e parte immaginaria nulla.");
        System.out.println("-> in: \"12.21 0\" - out: \"12.21\"\n");
        
        String var = "12.21 0";
        StackNum s = new StackNum();
        InserisciNumero instance=new InserisciNumero();
        instance.inserisci(var,s);
        String c = new Complex(12.21,0).toString();
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(c, s.top().toString());
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInserisci1_3() throws WrongNumberException {
        System.out.println("Test testInserisci1.3 con parte reale negativa e parte immaginaria nulla.");
        System.out.println("-> in: \"-31.12 0\" - out: \"-31.12\"\n");
        
        String var = "-31.12 0";
        StackNum s = new StackNum();
        InserisciNumero instance=new InserisciNumero();
        instance.inserisci(var,s);
        String c = new Complex(-31.12,0).toString();
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(c, s.top().toString());
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInserisci1_4() throws WrongNumberException {
        System.out.println("Test testInserisci1.4 con parte reale nulla e parte immaginaria positiva.");
        System.out.println("-> in: \"0 19.45\" - out: \" + 19.45i\"\n");
        
        String var = "0 19.45";
        StackNum s = new StackNum();
        InserisciNumero instance=new InserisciNumero();
        instance.inserisci(var,s);
        String c = new Complex(0,19.45).toString();
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(c, s.top().toString());
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInserisci1_5() throws WrongNumberException {
        System.out.println("Test testInserisci1.5 con parte reale nulla e parte immaginaria negativa.");
        System.out.println("-> in: \"0 -112.456\" - out: \" - 112.456i\"\n");
        
        String var = "0 -112.456";
        StackNum s = new StackNum();
        InserisciNumero instance=new InserisciNumero();
        instance.inserisci(var,s);
        String c = new Complex(0,-112.456).toString();
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(c, s.top().toString());
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInserisci1_6() throws WrongNumberException {
        System.out.println("Test testInserisci1.6 con parte reale e parte immaginaria negative.");
        System.out.println("-> in: \"-343 -112.456\" - out: \"-343 - 112.456i\"\n");
        
        String var = "-343 -112.456";
        StackNum s = new StackNum();
        InserisciNumero instance=new InserisciNumero();
        instance.inserisci(var,s);
        String c = new Complex(-343,-112.456).toString();
        
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(c, s.top().toString());
        //fail("The test case is a prototype.");
    }
    

    @Test
    public void testInserisci1_7() {
        System.out.println("Test testInserisci1.7 con inserimento da tastiera di 3 valori invece che 2.");
        System.out.println("-> in: \"1 1 1\" - out: \"Numero parametri errati\"\n");
        
        String var = "1 1 1";
        StackNum s = new StackNum();
        InserisciNumero instance=new InserisciNumero();
        
        // TODO review the generated test code and remove the default call to fail.
        assertThrows(WrongNumberException.class,()-> instance.inserisci(var,s));
    }
    
}
