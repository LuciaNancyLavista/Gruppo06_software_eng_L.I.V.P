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
 * @author Lucia Nancy Lavista
 */
public class StackNumTest {
    
    public StackNumTest() {
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
     * Test of push method, of class StackNum.
     */
    @Test
    public void testPush1() throws EmptyStackException {
        
        System.out.println("Test Push - 1 con due complessi positivi -> in: '21 10' - out: '21 + 10i'");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Costruzione di un numero complesso 
        Complex complexNumber = new Complex(21, 10);

        // Chiamata al metodo push per inserire il numero complesso nello stack
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento inserito in cima allo stack sia corretto
        String expectedTop = "21 + 10i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testPush2() throws EmptyStackException {
        
        System.out.println("Test Push - 2 con due complessi positivi double -> in: '11.1 1.256' - out: '11,1 + 1,256i'");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Costruzione di un numero complesso 
        Complex complexNumber = new Complex(11.1, 1.256);

        // Chiamata al metodo push per inserire il numero complesso nello stack
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento inserito in cima allo stack sia corretto
        String expectedTop = "11,1 + 1,256i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testPush3() throws EmptyStackException {
        
        System.out.println("Test Push - 3 con due complessi negativi -> in: '-101 -156' - out: '-101 - 156i' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Costruzione di un numero complesso 
        Complex complexNumber = new Complex(-101, -156);

        // Chiamata al metodo push per inserire il numero complesso nello stack
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento inserito in cima allo stack sia corretto
        String expectedTop = "-101 - 156i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }

    @Test
    public void testPush4() throws EmptyStackException {
        
        System.out.println("Test Push - 4 con due complessi nulli -> in: '0 0' - out: '0.0' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Costruzione di un numero complesso 
        Complex complexNumber = new Complex(0, 0);

        // Chiamata al metodo push per inserire il numero complesso nello stack
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento inserito in cima allo stack sia corretto
        String expectedTop = "0.0";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testPush5() throws EmptyStackException {
        
        System.out.println("Test Push - 5 con due complessi di cui uno zero -> in: '0 51.69' - out: '1i' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Costruzione di un numero complesso 
        Complex complexNumber = new Complex(0, 51.69);

        // Chiamata al metodo push per inserire il numero complesso nello stack
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento inserito in cima allo stack sia corretto
        String expectedTop = "51,69i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    
    @Test
    public void testPush6() {
        
        System.out.println("Test Push - 6 con stack vuoto -> in: ' ' - out: ' ' ");
        
        // Creazione di uno stack 
        StackNum stack = new StackNum();
        
        // Chiamata al metodo push senza input, quindi senza l'effettivo richiamo della funzione push
        // Oracolo: Verifica che lo stack sia vuoto
        boolean isEmpty = stack.isEmpty();
        // Assert: Verifica che lo stack sia vuoto
        assertTrue(isEmpty);
    }
    
    @Test
    public void testTop1() throws EmptyStackException {
        
        System.out.println("Test Top - 1 con due complessi positivi -> in: '291 13.2' - out: '291 + 13i' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Inserimento di un numero complesso (1 + i) nello stack
        Complex complexNumber = new Complex(291, 13);
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento in cima allo stack sia corretto
        String expectedTop = "291 + 13i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testTop2() throws EmptyStackException {
        
        System.out.println("Test Top - 2 con due complessi decimali positivi -> in: '1.763 81' - out: '1,763 + 81i' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Inserimento di un numero complesso (1 + i) nello stack
        Complex complexNumber = new Complex(1.763, 81);
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento in cima allo stack sia corretto
        String expectedTop = "1,763 + 81i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testTop3() throws EmptyStackException {
        
        System.out.println("Test Top - 3  con due complessi negativi -> in: '-1 -100' - out: '-1 - 100i' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Inserimento di un numero complesso (1 + i) nello stack
        Complex complexNumber = new Complex(-1, -100);
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento in cima allo stack sia corretto
        String expectedTop = "-1 - 100i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testTop4() throws EmptyStackException {
        
        System.out.println("Test Top - 4 con due complessi positivi di cui uno zero -> in: '0 12,943' - out: '12,943i' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Inserimento di un numero complesso (1 + i) nello stack
        Complex complexNumber = new Complex(0, 12.943);
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento in cima allo stack sia corretto
        String expectedTop = "12,943i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testTop5() throws EmptyStackException {
        
        System.out.println("Test Top - 5 con due zeri -> in: '0 0' - out: '0.0' ");
        
        // Creazione di uno stack
        StackNum stack = new StackNum();

        // Input: Inserimento di un numero complesso (1 + i) nello stack
        Complex complexNumber = new Complex(0, 0);
        stack.push(complexNumber);

        // Oracolo: Verifica che l'elemento in cima allo stack sia corretto
        String expectedTop = "0.0";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testDrop1() throws EmptyStackException {
        
        System.out.println("Test Drop - 1 con due complessi positivi -> in: '1 19' - out: '1 + 19i' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(1, 19);
        stack.push(complexNumber);

        // Chiamata al metodo drop
        Complex droppedElement = stack.drop();

        // Oracolo: Verifica che l'elemento eliminato sia corretto
        String expectedDroppedElement = "1 + 19i";
        String actualDroppedElement = droppedElement.toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedDroppedElement, actualDroppedElement);

        // Verifica che lo stack sia vuoto dopo la chiamata a drop
        boolean isEmpty = stack.isEmpty();
        assertEquals(true, isEmpty);
    }
    
    @Test
    public void testDrop2() throws EmptyStackException {
        
        System.out.println("Test Drop - 2 con due complessi decimali un negativo e uno positivo -> in: '-0.6 1.453' - out: '-0,6 + 1,453i' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(-0.6, 1.453);
        stack.push(complexNumber);

        // Chiamata al metodo drop
        Complex droppedElement = stack.drop();

        // Oracolo: Verifica che l'elemento eliminato sia corretto
        String expectedDroppedElement = "-0,6 + 1,453i";
        String actualDroppedElement = droppedElement.toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedDroppedElement, actualDroppedElement);

        // Verifica che lo stack sia vuoto dopo la chiamata a drop
        boolean isEmpty = stack.isEmpty();
        assertEquals(true, isEmpty);
    }
    
    @Test
    public void testDrop3() throws EmptyStackException {
        
        System.out.println("Test Drop - 3 con due complessi uno decimale e uno zero -> in: '16.20 0' - out: 16,20' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(16.20, 0);
        stack.push(complexNumber);

        // Chiamata al metodo drop
        Complex droppedElement = stack.drop();

        // Oracolo: Verifica che l'elemento eliminato sia corretto
        String expectedDroppedElement = "16,2";
        String actualDroppedElement = droppedElement.toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedDroppedElement, actualDroppedElement);

        // Verifica che lo stack sia vuoto dopo la chiamata a drop
        boolean isEmpty = stack.isEmpty();
        assertEquals(true, isEmpty);
    }
    
    @Test
    public void testDrop4() throws EmptyStackException {
        
        System.out.println("Test Drop - 4  con due complessi pari a zero -> in: '0 0' - out: '0.0' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 0);
        stack.push(complexNumber);

        // Chiamata al metodo drop
        Complex droppedElement = stack.drop();

        // Oracolo: Verifica che l'elemento eliminato sia corretto
        String expectedDroppedElement = "0.0";
        String actualDroppedElement = droppedElement.toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedDroppedElement, actualDroppedElement);

        // Verifica che lo stack sia vuoto dopo la chiamata a drop
        boolean isEmpty = stack.isEmpty();
        assertEquals(true, isEmpty);
    }
    
    @Test
    public void testDuplication1() throws EmptyStackException {
        
        System.out.println("Test Dup - 1 con due complessi positivi -> in: '1 63' - out: '1 + 63i' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(1, 63);
        stack.push(complexNumber);

        // Chiamata al metodo dup
        stack.dup();
        
        // Oracolo: Verifica che l'elemento duplicato sia corretto
        String expectedTop = "1 + 63i";
        String firstTop = stack.drop().toString();
        String secondTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, firstTop);
        assertEquals(expectedTop, secondTop);
    }
    
    @Test
    public void testDuplication2() throws EmptyStackException {
        
        System.out.println("Test Dup - 2 con due complessi uno positivo decimale e uno negativo -> in: '1.33 -6' - out: '1,33 - 6i' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(1.33, -6);
        stack.push(complexNumber);

        // Chiamata al metodo dup
        stack.dup();

        // Oracolo: Verifica che l'elemento duplicato sia corretto
        String expectedTop = "1,33 - 6i";
        String firstTop = stack.drop().toString();
        String secondTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, firstTop);
        assertEquals(expectedTop, secondTop);
    }
    
    @Test
    public void testDuplication3() throws EmptyStackException {
        
        System.out.println("Test Dup - 3 con due complessi uno negativo decimale e uno positivo -> in: '-17.36 1' - out: '-17,36 + 1i' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(-17.36, 1);
        stack.push(complexNumber);

        // Chiamata al metodo dup
        stack.dup();

        // Oracolo: Verifica che l'elemento duplicato sia corretto
        String expectedTop = "-17,36 + 1i";
        String firstTop = stack.drop().toString();
        String secondTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, firstTop);
        assertEquals(expectedTop, secondTop);
    }
    
    @Test
    public void testDuplication4() throws EmptyStackException {
        
        System.out.println("Test Dup - 4 con un numero complessom decimale e uno zero -> in: '4.390 0' - out: '4,390' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(4.390, 0);
        stack.push(complexNumber);

        // Chiamata al metodo dup
        stack.dup();

        // Oracolo: Verifica che l'elemento duplicato sia corretto
        String expectedTop = "4,39";
        String firstTop = stack.drop().toString();
        String secondTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, firstTop);
        assertEquals(expectedTop, secondTop);
    }
    
    @Test
    public void testDuplication5() throws EmptyStackException {
        
        System.out.println("Test Dup - 5 con due zeri -> in: '0 0' - out: '0.0' ");
        
        // Creazione di uno stack con un elemento
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 0);
        stack.push(complexNumber);

        // Chiamata al metodo dup
        stack.dup();

        // Oracolo: Verifica che l'elemento duplicato sia corretto
        String expectedTop = "0.0";
        String firstTop = stack.drop().toString();
        String secondTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, firstTop);
        assertEquals(expectedTop, secondTop);
    }
    
    @Test
    public void testClear1() throws EmptyStackException {
        
        System.out.println("Test Clear - 1 con due complessi positivi -> in: '25 2' - out: ' ' ");
        
        // Creazione di uno stack con un elemento 
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(25, 2);
        stack.push(complexNumber);

        // Chiamata al metodo clear
        stack.clear();
    }
    
    @Test
    public void testClear2() throws EmptyStackException {
        
        System.out.println("Test Clear - 2 con due complessi negativi di cui uno decimale -> in: '-51 -1.12' - out: ' ' ");
        
        // Creazione di uno stack con un elemento 
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(-51, -1.12);
        stack.push(complexNumber);

        // Chiamata al metodo clear
        stack.clear();
    }
    
    @Test
    public void testClear3() throws EmptyStackException {
        
        System.out.println("Test Clear - 3 con due complessi pari a zero -> in: '0 0' - out: ' ' ");
        
        // Creazione di uno stack con un elemento 
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 0);
        stack.push(complexNumber);

        // Chiamata al metodo clear
        stack.clear();

    }
    
    @Test
    public void testClear4() throws EmptyStackException {
        
        System.out.println("Test Clear - 4 con due complessi positivi di cui uno zero -> in: '0 16' - out: ' ' ");
        
        // Creazione di uno stack con un elemento 
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 16);
        stack.push(complexNumber);

        // Chiamata al metodo clear
        stack.clear();

    }
    
    @Test
    public void testOver1() throws Exception {
        
        System.out.println("Test Over - 1 coppia di due complessi positivi -> in: '1 1' '2 2' - out: '2 + 2i' '1 + 1i' ");
        
        // Creazione di uno stack con due elementi
        StackNum stack = new StackNum();
        Complex complexNumber1 = new Complex(1, 1);
        Complex complexNumber2 = new Complex(2, 2);
        stack.push(complexNumber1);
        stack.push(complexNumber2);

        // Chiamata al metodo over
        stack.over();

        // Oracolo: Verifica che il penultimo elemento sia duplicato in cima allo stack
        String expectedTop = "1 + 1i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testOver2() throws Exception {
        
        System.out.println("Test Over - 2 una coppia di due complessi positivi -> in: '1 1.6' - out_stack: '1 + 1,6i' - exception ");
        
        // Creazione di uno stack con un solo elemento  
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(1, 1.6);
        stack.push(complexNumber);

        // Chiamata al metodo over con meno di due elementi nello stack
        assertThrows(Exception.class, () -> stack.over());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
    @Test
    public void testOver3() throws Exception {
        
        System.out.println("Test Over - 3 nessun inserimento -> in: ' ' - exception ");
        
        // Creazione di uno stack vuoto 
        StackNum stack = new StackNum();

        // Chiamata al metodo over su uno stack vuoto
        assertThrows(Exception.class, () -> stack.over());
        // Se la chiamata non lancia un'eccezione, il test fallisce
        
    }
    
    @Test
    public void testOver4() throws Exception {
        
        System.out.println("Test Over - 4 con coppia di due complessi sia positivi che negativi -> in: '-1 1.5' '2 -2.2' - out: '2 - 2,2i' '-1 + 1,5i' ");
        
        // Creazione di uno stack con due elementi
        StackNum stack = new StackNum();
        Complex complexNumber1 = new Complex(-1, 1.5);
        Complex complexNumber2 = new Complex(2, -2.2);
        stack.push(complexNumber1);
        stack.push(complexNumber2);

        // Chiamata al metodo over
        stack.over();

        // Oracolo: Verifica che il penultimo elemento sia duplicato in cima allo stack
        String expectedTop = "-1 + 1,5i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testOver5() throws Exception {
        
        System.out.println("Test Over - 5 con coppia di due complessi positivi di cui una coppia pari a zero -> in: '0 0' '82.94 -2' - out: '82,94 - 2i' '0.0' ");
        
        // Creazione di uno stack con due elementi
        StackNum stack = new StackNum();
        Complex complexNumber1 = new Complex(0, 0);
        Complex complexNumber2 = new Complex(82.94, -2);
        stack.push(complexNumber1);
        stack.push(complexNumber2);

        // Chiamata al metodo over
        stack.over();

        // Oracolo: Verifica che il penultimo elemento sia duplicato in cima allo stack
        String expectedTop = "0.0";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testOver6() throws Exception {
        
        System.out.println("Test Over - 6 con una coppia di due complessi positivi di cui uno zero -> in: '0 1.6' - out: '1,6i' - exception ");
        
        // Creazione di uno stack con un solo elemento  ****
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 1.6);
        stack.push(complexNumber);

        // Chiamata al metodo over con meno di due elementi nello stack
        assertThrows(Exception.class, () -> stack.over());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
    @Test
    public void testOver7() throws Exception {
        
        System.out.println("Test Over - 7 con una coppia di complessi pari a zero -> in: '0 0' - out: '0.0' - exception ");
        
        // Creazione di uno stack con un solo elemento  ****
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 0);
        stack.push(complexNumber);

        // Chiamata al metodo over con meno di due elementi nello stack
        assertThrows(Exception.class, () -> stack.over());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
    @Test
    public void testSwap1() throws Exception {
        
        System.out.println("Test Swap - 1 con coppia di due complessi positivi -> in: '1.0 71' '22 2.74' - out: '22 + 2,74i' '1 + 71i' ");
        
        // Creazione di uno stack con due elementi
        StackNum stack = new StackNum();
        
        Complex complexNumber1 = new Complex(1.0, 71);
        Complex complexNumber2 = new Complex(22, 2.74);
        
        stack.push(complexNumber1);
        stack.push(complexNumber2);

        // Chiamata al metodo swap
        stack.swap();

        // Oracolo: Verifica che l'ultimo e il penultimo elemento siano scambiati
        String expectedTop = "1 + 71i";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testSwap2() throws Exception {
        
        System.out.println("Test Swap - 2 con una coppia di due complessi positivi-> in: '1 1' - out: '1 + 1i' - exception ");
        
        // Creazione di uno stack con un solo elemento  
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(1, 1);
        stack.push(complexNumber);

        // Chiamata al metodo swap con meno di due elementi nello stack
        assertThrows(Exception.class, () -> stack.swap());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
    @Test
    public void testSwap3() throws Exception {
        
        System.out.println("Test Swap - 3 con stack vuoto -> in: ' ' - exception ");
        
        // Creazione di uno stack vuoto
        StackNum stack = new StackNum();

        // Chiamata al metodo swap su uno stack vuoto
        assertThrows(Exception.class, () -> stack.over());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
    @Test
    public void testSwap4() throws Exception {
        
        System.out.println("Test Swap - 4  con coppia di due complessi positivi di cui una coppia pari a zero-> in: '0 0' '2 2.6' - out: '2 + 2,6i' '0.0' ");
        
        // Creazione di uno stack con due elementi
        StackNum stack = new StackNum();
        
        Complex complexNumber1 = new Complex(0, 0);
        Complex complexNumber2 = new Complex(2, 2.6);
        
        stack.push(complexNumber1);
        stack.push(complexNumber2);

        // Chiamata al metodo swap
        stack.swap();

        // Oracolo: Verifica che l'ultimo e il penultimo elemento siano scambiati
        String expectedTop = "0.0";
        String actualTop = stack.top().toString();

        // Assert: Verifica che il risultato sia quello atteso
        assertEquals(expectedTop, actualTop);
    }
    
    @Test
    public void testSwap5() throws Exception {
        
        System.out.println("Test Swap - 5 con una coppia di due complessi con un negativo -> in: '-1 1.3' - out: '-1 + 1,3i' - exception ");
        
        // Creazione di uno stack con un solo elemento  
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(-1, 1.3);
        stack.push(complexNumber);

        // Chiamata al metodo swap con meno di due elementi nello stack
        assertThrows(Exception.class, () -> stack.swap());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
    @Test
    public void testSwap6() throws Exception {
        
        System.out.println("Test Swap - 6 con una coppia di due complessi positivi di cui uno zero -> in: '0 1.654' - out: '1,654i' - exception ");
        
        // Creazione di uno stack con un solo elemento  
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 1.654);
        stack.push(complexNumber);

        // Chiamata al metodo swap con meno di due elementi nello stack
        assertThrows(Exception.class, () -> stack.swap());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
    @Test
    public void testSwap7() throws Exception {
        
        System.out.println("Test Swap - 7 con una coppia di due complessi pari a zero -> in: '0 0' - out: '0.0' - exception ");
        
        // Creazione di uno stack con un solo elemento  
        StackNum stack = new StackNum();
        Complex complexNumber = new Complex(0, 0);
        stack.push(complexNumber);

        // Chiamata al metodo swap con meno di due elementi nello stack
        assertThrows(Exception.class, () -> stack.swap());
        // Se la chiamata non lancia un'eccezione, il test fallisce
    }
    
}
