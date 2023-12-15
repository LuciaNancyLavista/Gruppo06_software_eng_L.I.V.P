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

/**
 *
 * @author Michele
 */
public class ComplexTest {
    
    public ComplexTest() {
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
     * Test of getReal method, of class Complex.
     */
    @Test
    public void testGetReal1_1() {
        //Test getReal con valore reale positivo
        System.out.println("Test getReal_1.1 con valore reale positivo.");
        System.out.println("-> in: \"91.12 + 107.76i\" - out: \"91.12\"\n");
        
        Complex instance = new Complex(91.12,107.76);
        double expResult = 91.12;
        
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetReal1_2() {
        //test getReal con valore reale negativo
        System.out.println("Test getReal_1.2 con valore reale negativo.");
        System.out.println("-> in: \"-13.5 + 96.78i\" - out: \"-13.5\"\n");
        
        Complex instance = new Complex(-13.5,96.78);
        double expResult = -13.5;
        
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetReal_3() {
        //Test getReal con valore reale pari a 0
        System.out.println("Test getReal_1.3 con valore reale pari a 0.");
        System.out.println("-> in: \"0 + 96.78i\" - out: \"-13.5\"\n");
        
        Complex instance = new Complex(0,-34.13);
        double expResult = 0;
        
        double result = instance.getReal();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getImaginary method, of class Complex.
     */
    @Test
    public void testGetImaginary1_1() {
        //Test getImaginary con valore immaginario positivo
        System.out.println("Test getImaginary_1.1 con valore immaginario positivo.");
        System.out.println("-> in: \"-12 + 54.34i\" - out: \"54.34\"\n");
        
        Complex instance = new Complex(-12,54.34);;
        double expResult = 54.34;
        
        double result = instance.getImaginary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetImaginary1_2() {
        //Test getImaginary con valore immaginario negativo
        System.out.println("Test getImaginary_1.2 con valore immaginario negativo.");
        System.out.println("-> in: \"56.32 -27.62i\" - out: \"-27.62\"\n");
        
        Complex instance = new Complex(56.32,-27.62);;
        double expResult = -27.62;
        
        double result = instance.getImaginary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetImaginary1_3() {
        //Test getImaginary con valore immaginario pari a zero
        System.out.println("Test getImaginary_1.3 con valore immaginario pari a zero.");
        System.out.println("-> in: \"12 + 0i\" - out: \"0\"\n");
        
        Complex instance = new Complex(12,0);
        double expResult = 0;
        
        double result = instance.getImaginary();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setReal method, of class Complex.
     */
    @Test
    public void testSetReal1_1() {
        //Test setReal con valore reale pari a zero
        System.out.println("Test setReal_1 con valore reale pari a 0.");
        System.out.println("-> in: \"3 + 19i\",\"0\" - out: \"0 + 19i\"\n");
        double real = 0.0;
        Complex instance = new Complex(3,19);
        instance.setReal(real);
        
        assertEquals(real,instance.getReal());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetReal1_2() {
        //Test setReal con valore reale negativo
        System.out.println("Test setReal1_2 con valore reale negativo");
        System.out.println("-> in: \"-3 + 9.67i\",\"-47.5\" - out: \"-47.5 + 9.67i\"\n");
        
        double real = -47.5;
        Complex instance = new Complex(-3,9.67);
        instance.setReal(real);
        
        assertEquals(real,instance.getReal());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetReal1_3() {
        //Test setReal con valore reale positivo
        System.out.println("Test setReal1_3 con valore reale positivo");
        System.out.println("-> in: \"-3 + 9.67i\",\"54.5\" - out: \"54.5 + 9.67i\"\n");
        
        double real = 54.5;
        Complex instance = new Complex(-3,9.67);
        instance.setReal(real);
        
        assertEquals(real,instance.getReal());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setImaginary method, of class Complex.
     */
    @Test
    public void testSetImaginary1_1() {
        //Test setImaginary con valore immaginario pari a 0
        System.out.println("Test setImaginary_1.1 con valore immaginario pari a 0.");
        System.out.println("-> in: \"23.2 - 12.4i\",\"0\" - out: \"-47.5\"\n");
        
        double imaginary = 0.0;
        Complex instance = new Complex(23.2,-12.4);
        instance.setImaginary(imaginary);
        
        assertEquals(imaginary,instance.getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetImaginary1_2() {
        //Test setImaginary con valore immaginario negativo
        System.out.println("Test setImaginary_1.2 con valore immaginario negativo");
        System.out.println("-> in: \"23.2 + 45.689i\",\"-22.11\" - out: \"23.2 - 22.11i\"\n");
        
        double imaginary = -22.11;
        Complex instance = new Complex(23.2,45.689);
        
        instance.setImaginary(imaginary);
        assertEquals(imaginary,instance.getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSetImaginary1_3() {
        //Test setImaginary con valore immaginario positivo
        System.out.println("Test setImaginary_1.3 con valore immaginario positivo");
        System.out.println("-> in: \"23.2 + 45.689i\",\"122.11\" - out: \"23.2 - 122.11i\"\n");
        
        double imaginary = 122.11;
        Complex instance = new Complex(23.2,45.689);
        
        instance.setImaginary(imaginary);
        assertEquals(imaginary,instance.getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Complex.
     */
    @Test
    public void testToString1_1() {
        //Test toString con numero complesso con parte reale e immaginaria pari a 0.
        System.out.println("Test toString_1.1 con numero complesso con parte reale e immaginaria pari a 0.");
        System.out.println("-> in: \"0 0\" - out: \"0\"\n");
        
        Complex instance = new Complex(0.0,0.0);
        String expResult = "0.0";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString1_2() {
        //Test toString con numero complesso con parte reale nulla e immaginaria positiva
        System.out.println("Test toString_1.2 con parte reale nulla e immaginaria positiva.");
        System.out.println("-> in: \"0.0 12.43\" - out: \"12,43i\"\n");
        
        Complex instance = new Complex(0.0,12.43);
        String expResult = "12,43i";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString1_3() {
        //Test toString con numero complesso con parte reale nulla e immaginaria negativa
        System.out.println("Test toString_1.3 con parte reale nulla e immaginaria negativa.");
        System.out.println("-> in: \"0.0 -78\" - out: \" - 78i\"\n");
        
        Complex instance = new Complex(0.0,-78);
        String expResult = " - 78i";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString1_4() {
        //Test toString con numero complesso con parte reale positiva e immaginaria nulla
        System.out.println("Test toString_1.4 con parte reale positiva e immaginaria nulla.");
        System.out.println("-> in: \"56.21 0\" - out: \"56,21\"\n");
        
        Complex instance = new Complex(56.21,0);
        String expResult = "56,21";
        
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString1_5() {
        //Test toString con numero complesso con parte reale negativa e immaginaria nulla
        System.out.println("Test toString_1.5 con parte reale negativa e immaginaria nulla.");
        System.out.println("-> in: \"-47 0\" - out: \"-47\"\n");
        
        Complex instance = new Complex(-47,0);
        String expResult = "-47";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString1_6() {
        //Test toString con numero complesso con parte reale positiva e immaginaria positiva
        System.out.println("Test toString_1.6 con parte reale positiva e immaginaria positiva.");
        System.out.println("-> in: \"29.12 63.20\" - out: \"29,12 + 63,2i\"\n");
        
        Complex instance = new Complex(29.12,63.20);
        String expResult = "29,12 + 63,2i";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString1_7() {
        //Test toString con numero complesso con parte reale e immaginaria positive con più di tre cifre decimali, senza approssimazione
        System.out.println("Test toString_1.7 con parte reale e immaginaria positive con più di tre cifre decimali,senza approssimazione.");
        System.out.println("-> in: \"29.1234567 63.20123456\" - out: \"29,123 + 63,201i\"\n");
        
        Complex instance = new Complex(29.1234567,63.20123456);
        String expResult = "29,123 + 63,201i";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testToString1_8() {
        //Test toString con numero complesso con parte reale e immaginaria positive con più di tre cifre decimali, con approssimazione
        System.out.println("Test toString_1.8 con parte reale e immaginaria positive con più di tre cifre decimali, con approssimazione.");
        System.out.println("-> in: \"49.9999 63.40099\" - out: \"50 + 63,401i\"\n");

        Complex instance = new Complex(49.9999,63.40099);
        String expResult = "50 + 63,401i";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testToString1_9() {
        //Test toString con numero complesso con parte reale e immaginaria negative con più di tre cifre decimali, con approssimazione
        System.out.println("Test toString_1.9 con parte reale e immaginaria negative con più di tre cifre decimali, con approssimazione.");
        System.out.println("-> in: \"-49.9999 -63.40099\" - out: \"-50 - 63,401i\"\n");
        
        Complex instance = new Complex(-49.9999,-63.40099);
        String expResult = "-50 - 63,401i";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testToString1_10() {
        //Test toString con numero complesso con parte reale positiva e immaginaria negativa
        System.out.println("Test toString_1.10 con parte reale positiva e immaginaria negativa.");
        System.out.println("-> in: \"13 -4.2\" - out: \"13 - 4,2i\"\n");
        
        Complex instance = new Complex(13,-4.2);
        String expResult = "13 - 4,2i";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
