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
 * @author Michele Penna
 */
public class InserisciOperazioniTest {
    
    public InserisciOperazioniTest() {
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
     * Test of add method, of class InserisciOperazioni.
     */
    @Test
    public void testAdd1_1() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testAdd1.1 con due numeri complessi a parte reale e immaginaria positive.");
        System.out.println("-> in: \"16.12 58.123\",\"39.471 99.09\" - out: \"55.591 + 157.213i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="16.12 58.123";
        String var2="39.471 99.09";
        double delta=1e-3;
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.add(s);
        
        Complex c = new Complex(55.591,157.213);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testAdd1_2() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testAdd1.2 con primo numero complesso a parte immaginaria negativa e secondo numero complesso a parte reale negativa.");
        System.out.println("-> in: \"16.12 -58.123\",\"-39.471 99.09\" - out: \"-23.351 + 40.967i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="16.12 -58.123";
        String var2="-39.471 99.09";
    
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.add(s);
        
        double delta=1e-3;
        Complex c = new Complex(-23.351,40.967);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testAdd1_3() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testAdd1.3 con primo numero complesso negativo e secondo numero complesso pari a 0");
        System.out.println("-> in: \"-22.2 -5.42888\",\"0 0\" - out: \"-22.2 -5.42888i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="-22.2 -5.42888";
        String var2="0 0";
        
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.add(s);
        
        double delta=1e-3;
        Complex c = new Complex(-22.2,-5.429);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of sub method, of class InserisciOperazioni.
     */
    @Test
    public void testSub1_1() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSub1.1 con due complessi positivi");
        System.out.println("-> in: \"100.99 39.47\",\"53.19 36.47\" - out: \"47.8 + 3i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="100.99 39.47";
        String var2="53.19 36.47";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.sub(s);
        
        double delta=1e-3;
        Complex c = new Complex(47.8,3);
        assertEquals(c.getReal(), s.top().getReal());
        assertEquals(c.getImaginary(), s.top().getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSub1_2() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSub1.2 con primo numero complesso a parte immaginaria negativa e secondo numero complesso a parte reale negativa.");
        System.out.println("-> in: \"100.99 -39.47\",\"-53.19 36.47\" - out: \"154.18 - 75.94i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="100.99 -39.47";
        String var2="-53.19 36.47";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.sub(s);
        
        double delta=1e-3;
        Complex c = new Complex(154.18,-75.94);
        assertEquals(c.getReal(), s.top().getReal());
        assertEquals(c.getImaginary(), s.top().getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSub1_3() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSub1.3 con primo numero complesso pari a 0.");
        System.out.println("-> in: \"0 0\",\"-83.69 82.47\" - out: \"83.69 - 82.47i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="0 0";
        String var2="-83.69 82.47";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.sub(s);
        
        double delta=1e-3;
        Complex c = new Complex(83.69,-82.47);
        assertEquals(c.getReal(), s.top().getReal());
        assertEquals(c.getImaginary(), s.top().getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mult method, of class InserisciOperazioni.
     */
    @Test
    public void testMult1_1() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testMult1.1 con due complessi positivi.");
        System.out.println("-> in: \"29.24 21.2\",\"12.002 3.052\" - out: \"286.236 + 343.683i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="29.24 21.2";
        String var2="12.002 3.052";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.mult(s);
        
        double delta=1e-3;
        Complex c = new Complex(286.236,343.683);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMult1_2() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testMult1.2 con un complesso positivo e un complesso negativo.");
        System.out.println("-> in: \"313.12 11\",\"-13 -2.543\" - out: \"-4042.587 - 939.264i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="313.12 11";
        String var2="-13 -2.543";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.mult(s);
        
        double delta=1e-3;
        Complex c = new Complex(-4042.587,-939.264);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMult1_3() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testMult1.3 tra due complessi coniugati.");
        System.out.println("-> in: \"24.125 120.6\",\"24.125 -120.6\" - out: \"15126.375\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="24.125 120.6";
        String var2="24.125 -120.6";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.mult(s);
        
        double delta=1e-3;
        Complex c = new Complex(15126.375,0);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMult1_4() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testMult1.4 tra un numero complesso non nullo e un numero complesso pari a 0.");
        System.out.println("-> in: \"24.125 120.6\",\"0 0\" - out: \"0\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="24.125 120.6";
        String var2="0 0";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.mult(s);
        
        Complex c = new Complex(0,0);
        assertEquals(c.getReal(), s.top().getReal());
        assertEquals(c.getImaginary(), s.top().getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMult1_5() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testMult1.5 tra un numero complesso con parte reale nulla e un numero complesso con parti reale e immaginarie non nulle.");
        System.out.println("-> in: \"0 -120.6\",\"-23.12 31.12\" - out: \"3753.072 + 2788.272i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="0 -120.6";
        String var2="-23.12 31.12";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.mult(s);
        
        Complex c = new Complex(3753.072,2788.272);
        assertEquals(c.getReal(), s.top().getReal());
        assertEquals(c.getImaginary(), s.top().getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testMult1_6() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testMult1.6 tra un numero complesso con parti reale e immaginarie non nulle e un numero complesso con parte immaginaria nulla.");
        System.out.println("-> in: \"25 10\",\"20 0\" - out: \"500 + 200i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="25 10";
        String var2="20 0";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.mult(s);
        
        Complex c = new Complex(500,200);
        assertEquals(c.getReal(), s.top().getReal());
        assertEquals(c.getImaginary(), s.top().getImaginary());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of div method, of class InserisciOperazioni.
     */
    
    @Test
    public void testDiv1_1() throws EmptyStackException, OpeArithmeticException, WrongNumberException {
        System.out.println("Test testDiv1.1 tra due complessi positivi.");
        System.out.println("-> in: \"234.567 123.987\",\"110.23 56.476\" - out: \"2.142 + 0.027i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="234.567 123.987";
        String var2="110.23 56.476";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.div(s);
        
        double delta=1e-3;
        Complex c = new Complex(2.142,0.027);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDiv1_2() throws EmptyStackException, OpeArithmeticException, WrongNumberException {
        System.out.println("Test testDiv1.2 tra due complessi negativi.");
        System.out.println("-> in: \"-13.12 -31.103\",\"-2.25 -45.21\" - out: \"0.7 - 0.255i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="-13.12 -31.103";
        String var2="-2.25 -45.21";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.div(s);
        
        double delta=1e-3;
        Complex c = new Complex(0.7,-0.255);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDiv1_3() throws EmptyStackException, OpeArithmeticException, WrongNumberException {
        System.out.println("Test testDiv1.3 tra un complesso positivo e un complesso negativo.");
        System.out.println("-> in: \"13.12 31.103\",\"-2.25 -45.21\" - out: \"-0.7 + 0.255i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="13.12 31.103";
        String var2="-2.25 -45.21";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.div(s);
        
        double delta=1e-3;
        Complex c = new Complex(-0.7,0.255);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDiv1_4() throws EmptyStackException, OpeArithmeticException, WrongNumberException {
        System.out.println("Test testDiv1.4 tra un complesso pari a 0 e un complesso non nullo.");
        System.out.println("-> in: \"0 0\",\"-2.25 -45.21\" - out: \"0\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="0 0";
        String var2="-2.25 -45.21";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.div(s);
        
        double delta=1e-3;
        Complex c = new Complex(0,0);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDiv1_5() throws EmptyStackException, OpeArithmeticException, WrongNumberException {
        System.out.println("Test testDiv1.5 tra un complesso non nullo e un complesso con parte reale nulla.");
        System.out.println("-> in: \"13.12 -21.45\",\"0 -45.21\" - out: \"0.474 + 0.29i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="13.12 -21.45";
        String var2="0 -45.21";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);
        instance.div(s);
        
        double delta=1e-3;
        Complex c = new Complex(0.474,0.29);
        assertEquals(c.getReal(), s.top().getReal(),delta);
        assertEquals(c.getImaginary(), s.top().getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testDiv1_6() throws EmptyStackException, OpeArithmeticException, WrongNumberException {
        System.out.println("Test testDiv1.6 tra un complesso non nullo e un complesso pari a 0.");
        System.out.println("-> in: \"13.16 -134.12\",\"0 0\" - out: \"Errore: Divisione per zero.\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var1="13.16 -134.12";
        String var2="0 0";
        numero.inserisci(var1, s);
        numero.inserisci(var2, s);

        assertThrows(OpeArithmeticException.class,() -> instance.div(s));
                
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sqrt method, of class InserisciOperazioni.
     */
    @Test
    public void testSqrt1_1() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSqrt1.1 di un complesso positivo.");
        System.out.println("-> in: \"15.15 23.14\" - out: \"-4.626 - 2.5i\",\"4.626 + 2.5i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="15.15 23.14";
        numero.inserisci(var, s);
        instance.sqrt(s);
        
        double delta=1e-3;
        Complex c1 = new Complex(-4.626,-2.5);
        Complex c2 = new Complex(+4.626,+2.5);
        
        
        Complex x=s.drop();
        Complex y=s.drop();
        
        assertEquals(c1.getReal(), x.getReal(),delta);
        assertEquals(c1.getImaginary(), x.getImaginary(),delta);
        
        assertEquals(c2.getReal(), y.getReal(),delta);
        assertEquals(c2.getImaginary(), y.getImaginary(),delta);
     
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSqrt1_2() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSqrt1.2 di un complesso negativo.");
        System.out.println("-> in: \"-15.15 -23.14\" - out: \"-2.5 + 4.626i\",\"2.5 - 4.626i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="-15.15 -23.14";
        numero.inserisci(var, s);
        instance.sqrt(s);
        
        double delta=1e-3;
        Complex c1 = new Complex(-2.5,4.626);
        Complex c2 = new Complex(2.5,-4.6261);
       
        Complex x=s.drop();
        Complex y=s.drop();
        
        assertEquals(c1.getReal(), x.getReal(),delta);
        assertEquals(c1.getImaginary(), x.getImaginary(),delta);
        assertEquals(c2.getReal(), y.getReal(),delta);
        assertEquals(c2.getImaginary(), y.getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSqrt1_3() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSqrt1.3 di un complesso a parte reale positiva e parte immaginaria nulla.");
        System.out.println("-> in: \"625.125 0\" - out: \"-25.002\",\"+25.002\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="625.125 0";
        numero.inserisci(var, s);
        instance.sqrt(s);
        
        Complex c1 = new Complex(-25.002,0);
        Complex c2 = new Complex(25.002,0);
        double delta = 1e-3; //lo uso per considerare 0 e -0 identici
        
        Complex x=s.drop();
        Complex y=s.drop();
        
        assertEquals(c1.getReal(), x.getReal(),delta);
        assertEquals(c1.getImaginary(), x.getImaginary(),delta);
        assertEquals(c2.getReal(), y.getReal(),delta);
        assertEquals(c2.getImaginary(), y.getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSqrt1_4() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSqrt1.4 di un complesso a parte reale negativa e parte immaginaria nulla.");
        System.out.println("-> in: \"-625.125 0\" - out: \"0 - 25.002i\",\"0 + 25.002i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="-625.125 0";
        numero.inserisci(var, s);
        instance.sqrt(s);
        
        Complex c1 = new Complex(0,-25.002);
        Complex c2 = new Complex(0,25.002);
        double delta = 1e-3; //lo uso per considerare 0 e -0 identici
        
        Complex x=s.drop();
        Complex y=s.drop();
        
        assertEquals(c1.getReal(), x.getReal(),delta);
        assertEquals(c1.getImaginary(), x.getImaginary(),delta);
        assertEquals(c2.getReal(), y.getReal(),delta);
        assertEquals(c2.getImaginary(), y.getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testSqrt1_5() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSqrt1.5 di un complesso a parte reale nulla e parte immaginaria positiva.");
        System.out.println("-> in: \"0 144.985\" - out: \"-8.514 - 8.514i\",\"8.514 + 8.514i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="0 144.985";
        numero.inserisci(var, s);
        instance.sqrt(s);
        
        double delta=1e-3;
        Complex c1 = new Complex(-8.514,-8.514);
        Complex c2 = new Complex(8.514,8.514);
       
        Complex x=s.drop();
        Complex y=s.drop();
        
        assertEquals(c1.getReal(), x.getReal(),delta);
        assertEquals(c1.getImaginary(), x.getImaginary(),delta);
        assertEquals(c2.getReal(), y.getReal(),delta);
        assertEquals(c2.getImaginary(), y.getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testSqrt1_6() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSqrt1.6 di un complesso a parte reale nulla e parte immaginaria negativa.");
        System.out.println("-> in: \"0 -144.985\" - out: \"-8.514 + 8.514i\",\"8.514 - 8.514i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="0 144.985";
        numero.inserisci(var, s);
        instance.sqrt(s);
        
        double delta=1e-3;
        Complex c1 = new Complex(-8.514,-8.514);
        Complex c2 = new Complex(8.514,8.514);
       
        Complex x=s.drop();
        Complex y=s.drop();
        
        assertEquals(c1.getReal(), x.getReal(),delta);
        assertEquals(c1.getImaginary(), x.getImaginary(),delta);
        assertEquals(c2.getReal(), y.getReal(),delta);
        assertEquals(c2.getImaginary(), y.getImaginary(),delta);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testSqrt1_7() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testSqrt1.7 di un complesso nullo.");
        System.out.println("-> in: \"0\" - out: \"0\",\"0\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="0 0";
        numero.inserisci(var, s);
        instance.sqrt(s);
        
        Complex c1 = new Complex(0,0);
        Complex c2 = new Complex(0,0);
    
        Complex x=s.drop();
        Complex y=s.drop();
        double delta = 1e-9; //lo uso per considerare 0 e -0 identici
        
        assertEquals(c1.getReal(),x.getReal(),delta);
        assertEquals(c1.getImaginary(),x.getImaginary(),delta);
        
        assertEquals(c2.getReal(),y.getReal());
        assertEquals(c2.getImaginary(),y.getImaginary());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of invSign method, of class InserisciOperazioni.
     */
    @Test
    public void testInvSign1_1() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testInvSign1.1 di un complesso con parti reale e immaginaria positive.");
        System.out.println("-> in: \"134.134 987.987\" - out: \"-134.134 - 987.987i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="134.134 987.987";
        numero.inserisci(var, s);
        instance.invSign(s);
        
        Complex c1 = new Complex(-134.134,-987.987);
  
        
     
        assertEquals(c1.getReal(),s.top().getReal());
        assertEquals(c1.getImaginary(),s.top().getImaginary());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInvSign1_2() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testInvSign1.2 di un complesso con parte reale negativa e parte immaginaria positiva.");
        System.out.println("-> in: \"-134.134 987.987\" - out: \"134.134 - 987.987i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="-134.134 987.987";
        numero.inserisci(var, s);
        instance.invSign(s);
        
        Complex c1 = new Complex(134.134,-987.987);
  
        
     
        assertEquals(c1.getReal(),s.top().getReal());
        assertEquals(c1.getImaginary(),s.top().getImaginary());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInvSign1_3() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testInvSign1.3 di un complesso con parte reale positiva e parte immaginaria negativa.");
        System.out.println("-> in: \"134.134 -987.987\" - out: \"-134.134 + 987.987i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="134.134 -987.987";
        numero.inserisci(var, s);
        instance.invSign(s);
        
        Complex c1 = new Complex(-134.134,987.987);
  
        
     
        assertEquals(c1.getReal(),s.top().getReal());
        assertEquals(c1.getImaginary(),s.top().getImaginary());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testInvSign1_4() throws EmptyStackException, WrongNumberException {
        System.out.println("Test testInvSign1.4 di un complesso negativo.");
        System.out.println("-> in: \"-134.134 -987.987\" - out: \"134.134 + 987.987i\"\n");
        
        StackNum s = new StackNum();
        InserisciOperazioni instance = new InserisciOperazioni();
        InserisciNumero numero=new InserisciNumero();
        String var="-134.134 -987.987";
        numero.inserisci(var, s);
        instance.invSign(s);
        
        Complex c1 = new Complex(134.134,987.987);
  
        
     
        assertEquals(c1.getReal(),s.top().getReal());
        assertEquals(c1.getImaginary(),s.top().getImaginary());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
