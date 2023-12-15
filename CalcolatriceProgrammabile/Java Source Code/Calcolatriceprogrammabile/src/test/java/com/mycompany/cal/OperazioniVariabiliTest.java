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
public class OperazioniVariabiliTest {

    public OperazioniVariabiliTest() {
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
     * Test of maggX method, of class OperazioniVariabili.
     */
    
    @Test
    public void testMaggX1() throws EmptyStackException, InsertVariableException {
        System.out.println("Test MaggX1.1: stack inizializzato con al più un valore. Numero complesso positivo e intero. ");
        System.out.println("x = 23 + 67i\n");
        // Inizializza lo stack con un valore
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        Complex initialValue = new Complex(23, 67);
        stack.push(initialValue);

        // Effettua la maggX con la variabile "x"
        operazioni.maggX("x");

        operazioni.minX("x");
        // Verifica che la variabile "x" nella LinkedHashMap contenga il valore corretto
        Complex result = stack.top();
        
        assertNotNull(result);
        assertEquals(initialValue, result);
    }
    
    @Test
    public void testMaggX1_2() throws EmptyStackException, InsertVariableException {
        System.out.println("Test MaggX1.2: stack inizializzato con al più un valore. Numero complesso negativo ");
        System.out.println("x = -45 - 56,89i\n");
        // Inizializza lo stack con un valore
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        Complex initialValue = new Complex(-45, -56.89);
        stack.push(initialValue);

        // Effettua la maggX con la variabile "x"
        operazioni.maggX("x");

        operazioni.minX("x");
        // Verifica che la variabile "x" nella LinkedHashMap contenga il valore corretto
        Complex result = stack.top();
        
        assertNotNull(result);
        assertEquals(initialValue, result);
    }
    
    @Test
    public void testMaggX1_3() throws EmptyStackException, InsertVariableException {
        System.out.println("Test MaggX1.3: stack inizializzato con al più un valore. Numero complesso double ");
        System.out.println("x = 14.8 + 34.9i\n");
        // Inizializza lo stack con un valore
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        Complex initialValue = new Complex(14.8, 34.9);
        stack.push(initialValue);

        // Effettua la maggX con la variabile "x"
        operazioni.maggX("x");

        operazioni.minX("x");
        // Verifica che la variabile "x" nella LinkedHashMap contenga il valore corretto
        Complex result = stack.top();
        
        assertNotNull(result);
        assertEquals(initialValue, result);
    }
    
    @Test
    public void testMaggX1_4() throws EmptyStackException, InsertVariableException {
        System.out.println("Test MaggX1.4: stack inizializzato con al più un valore. Numero reale negativo");
        System.out.println("x = -1,2\n");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza lo stack con un valore
        Complex initialValue = new Complex(0, -1.2);
        stack.push(initialValue);

        // Effettua la maggX con la variabile "x"
        operazioni.maggX("x");

        operazioni.minX("x");
        // Verifica che la variabile "x" nella LinkedHashMap contenga il valore corretto
        Complex result = stack.top();
        
        assertNotNull(result);
        assertEquals(initialValue, result);
    }
    
    @Test
    public void testMaggX1_5() throws EmptyStackException, InsertVariableException {
        System.out.println("Test MaggX1.5: Numero complesso a 0");
        System.out.println("x = 0.0\n");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza lo stack con un valore
        Complex initialValue = new Complex(0, 0);
        stack.push(initialValue);

        // Effettua la maggX con la variabile "x"
        operazioni.maggX("x");

        operazioni.minX("x");
        // Verifica che la variabile "x" nella LinkedHashMap contenga il valore corretto
        Complex result = stack.top();
        
        assertNotNull(result);
        assertEquals(initialValue, result);
    }
    
     @Test
    public void testMaggX1_6() {
        System.out.println("Test MaggX1.6: stack vuoto. ");
        System.out.println("Errore: Stack Vuoto\n");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Verifica che lo stack sia vuoto inizialmente
        assertTrue(stack.isEmpty());

        // Tentativo di eseguire la maggX su uno stack vuoto
        assertThrows(EmptyStackException.class, () -> operazioni.maggX("x"));
        // Se si raggiunge questo punto, il test ha fallito
    }
    
    
    @Test // valore associato alla variabile x inizializzato all'interno della LinkedHashMap.
    public void testMinX1() throws InsertVariableException, EmptyStackException {
        System.out.println("Test MinX1.1: Variabile intera e positiva");
        System.out.println("x = 23 + 89i -> var.minX(x) -> [23 + 89i]\n");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap
        Complex xValue = new Complex(23, 89);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Effettua la minX con la variabile "x"
        operazioni.minX("x");

        // Verifica che lo stack contenga il valore corretto
        Complex result = stack.top();
        assertNotNull(result);

        // Verifica che il valore sia "1.0 + 1.0i"
        Complex newC = new Complex(23.0, 89.0);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());
        
    }
    
    @Test
    public void testMinX1_2() throws InsertVariableException, EmptyStackException {
        System.out.println("Test MinX1.2: Variabile con parte reale negativa e parte immaginaria double");
        System.out.println("x = -10 + 1,2i -> var.minX(x) -> [-10 + 1,2i]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap
        Complex xValue = new Complex(-10, 1.2);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Effettua la minX con la variabile "x"
        operazioni.minX("x");

        // Verifica che lo stack contenga il valore corretto
        Complex result = stack.top();
        assertNotNull(result);

        // Verifica che il valore sia "-1.0 + 1.2i"
        Complex newC = new Complex(-10.0, 1.2);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());
        
    }
    
    @Test
    public void testMinX1_3() throws InsertVariableException, EmptyStackException {
        System.out.println("Test MinX1.3: variabile con parte reale double e parte immaginaria negativa");
        System.out.println("x = 34,45 - 78i -> var.minX(x) -> [34,45 - 78i]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap
        Complex xValue = new Complex(34.45, -78);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Effettua la minX con la variabile "x"
        operazioni.minX("x");

        // Verifica che lo stack contenga il valore corretto
        Complex result = stack.top();
        assertNotNull(result);

        // Verifica che il valore sia "1.3 - 1.0i"
        Complex newC = new Complex(34.45, -78.0);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());
        
    }
    
    @Test
    public void testMinX1_4() throws InsertVariableException, EmptyStackException {
        System.out.println("Test MinX1.4: Variabili con parte reale 0 e parte immaginaria double");
        System.out.println("x = 3,90i -> var.minX(x) -> [3,90i]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap
        Complex xValue = new Complex(0, 3.90);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Effettua la minX con la variabile "x"
        operazioni.minX("x");

        // Verifica che lo stack contenga il valore corretto
        Complex result = stack.top();
        assertNotNull(result);

        // Verifica che il valore sia "0.0 + 1.3i"
        Complex newC = new Complex(0.0, 3.90);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());
        
    }
    
    @Test
    public void testMinX1_5() throws InsertVariableException, EmptyStackException {
        System.out.println("Test MinX1.5: Variabile con parte immaginaria nulla");
        System.out.println("x = 356 -> var.minX(x) -> [356]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap
        Complex xValue = new Complex(356, 0);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Effettua la minX con la variabile "x"
        operazioni.minX("x");

        // Verifica che lo stack contenga il valore corretto
        Complex result = stack.top();
        assertNotNull(result);

        // Verifica che il valore sia "1.0 + 0.0i"
        Complex newC = new Complex(356.0, 0.0);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());
        
    }
    
    @Test
    public void testMinX1_6() throws InsertVariableException, EmptyStackException {
        System.out.println("Test MinX1.6: Variabile pari a 0 ");
        System.out.println("x = 0.0 -> var.minX(x) -> [0,0]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap
        Complex xValue = new Complex(0, 0);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Effettua la minX con la variabile "x"
        operazioni.minX("x");

        // Verifica che lo stack contenga il valore corretto
        Complex result = stack.top();
        assertNotNull(result);

        // Verifica che il valore sia "0.0 + 0.0i"
        Complex newC = new Complex(0.0, 0.0);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());
        
    }
    
    @Test 
    public void testMinX1_7() {
        System.out.println("Test MinX1.7: Variabile non inizializzata");
        System.out.println("Errore: variabile non inizializzata\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Effettua la minX con la variabile "x" non inizializzata
        assertThrows(InsertVariableException.class, () -> operazioni.minX("x"));
        // Se si raggiunge questo punto, il test ha fallito
    }

    @Test
    public void testPlusX1() throws InsertVariableException, EmptyStackException {
        
        System.out.println("Test PlusX1.1: variabile complessa intera + stack con un complesso intero ");
        System.out.println("x = 45 + 9i , [5 + 11i] -> var.plus(x) -> x = 50 + 20i,[5 + 11i]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap  
        Complex xValue = new Complex(45, 9);
        stack.push(xValue);
        operazioni.maggX("x");

        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(5, 11);
        stack.push(stackValue);

        // Effettua la plusX con la variabile "x"
        Complex result = operazioni.plusX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());

        Complex newC = new Complex(50, 20);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a "x" nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testPlusX1_2() throws InsertVariableException, EmptyStackException {
        
        System.out.println("Test PlusX1.2: variabile complessa con parte reale negativa e immaginaria positiva double + stack con complesso intero ");
        System.out.println("x = -19 + 1.67i, [2 + 2i] -> var.plus(x) -> x = -17 + 2.67,[2 + 2i]\n");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap  
        Complex xValue = new Complex(-19, 1.67);
        stack.push(xValue);
        operazioni.maggX("x");

        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(2, 2);
        stack.push(stackValue);

        // Effettua la plusX con la variabile "x"
        Complex result = operazioni.plusX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());

        Complex newC = new Complex(-17, 3.67);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a "x" nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testPlusX1_3() throws InsertVariableException, EmptyStackException {
        
        System.out.println("Test PlusX1.3:  variabile complessa con parte reale e immaginaria positiva double + stack con complesso");
        System.out.println("x = 10.58 + 1.0i, [2 0,2] -> var.plus(x) -> x = 12.58 + 1.2i,[2 + 0,2i]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap  
        Complex xValue = new Complex(10.58, 1.0);
        stack.push(xValue);
        operazioni.maggX("x");

        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(2, 0.2);
        stack.push(stackValue);

        // Effettua la plusX con la variabile "x"
        Complex result = operazioni.plusX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());

        Complex newC = new Complex(12.58, 1.2);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a "x" nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testPlusX1_4() throws InsertVariableException, EmptyStackException {
        
        System.out.println("Test PlusX1.4: variabile complessa con parte reale negativa e immaginaria positiva double + stack con complesso intero ");
        System.out.println("x = -5 + 1i , [2 + 2,3i] -> var.plus(x) -> x = -3 +3,3i,[2 + 2.3i]\n");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap  
        Complex xValue = new Complex(-5, 1);
        stack.push(xValue);
        operazioni.maggX("x");

        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(2, 2.3);
        stack.push(stackValue);

        // Effettua la plusX con la variabile "x"
        Complex result = operazioni.plusX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());

        Complex newC = new Complex(-3, 3.3);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a "x" nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testPlusX1_5() throws InsertVariableException, EmptyStackException {
        
        System.out.println("Test PlusX1.5: variabile complessa con parte reale nulla e immaginaria positiva + stack con complesso intero e zero ");
        System.out.println("x = 1i , [2] -> var.plus(x) -> x = 2 + 1i,[2]\n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap  
        Complex xValue = new Complex(0, 1);
        stack.push(xValue);
        operazioni.maggX("x");

        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(2, 0);
        stack.push(stackValue);

        // Effettua la plusX con la variabile "x"
        Complex result = operazioni.plusX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());

        Complex newC = new Complex(2, 1);
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a "x" nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testPlusX1_6() throws InsertVariableException, EmptyStackException {
        
        System.out.println("Test PlusX1.6: variabile complessa di cui un negativo + stack vuoto - exception ");
        System.out.println("x = -1.54 + 1i \n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile "x" nella LinkedHashMap 
        Complex xValue = new Complex(-1.54, 1);
        stack.push(xValue);
        operazioni.maggX("x");
        
        stack.clear();

        // Effettua la plusX con la variabile "x" su uno stack vuoto
        assertThrows(EmptyStackException.class, () -> operazioni.plusX("x"));
        // Se si raggiunge questo punto, il test ha fallito
            
    }
    
    @Test
    public void testPlusX1_7() {
        System.out.println("Test PlusX1.7: variabile complessa positiva + stack vuoto - exception ");
        System.out.println("x = 1 + 12.64i \n");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Effettua la plusX con la variabile "x" non inizializzata su uno stack non vuoto
        stack.push(new Complex(1,12.64));
        
        assertThrows(InsertVariableException.class, () -> operazioni.plusX("x"));
        // Se si raggiunge questo punto, il test ha fallito
    }
    
    @Test
    public void testPlusX2() {
        System.out.println("Test PlusX2: variabile non inizializzata + stack vuoto - exception ");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Effettua la plusX con la variabile "x" non inizializzata su uno stack vuoto
        assertThrows(InsertVariableException.class, () -> operazioni.plusX("x"));
        // Se si raggiunge questo punto, il test ha fallito
    }
    
    @Test
    public void testLessX1() throws EmptyStackException, InsertVariableException {
        
        System.out.println("Test Less X - 1.1 due coppie di complessi positivi -> in: '1 10' '2 2.452' - out: '-1 + 7,548' ");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile 'x' nella LinkedHashMap
        Complex xValue = new Complex(1, 10);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(2, 2.452);
        stack.push(stackValue);

        // Effettua la lessX con la variabile 'x'
        Complex result = operazioni.lessX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());
        
        Complex newC = new Complex(-1, 7.548);
        
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a 'x' nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testLessX1_2() throws EmptyStackException, InsertVariableException {
        
        System.out.println("Test Less X - 1.2 due coppie di complessi di cui una positiva e l'altra negativa -> in: '1.3 1' '-52 -2' - out: '53,3 + 3i'");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile 'x' nella LinkedHashMap
        Complex xValue = new Complex(1.3, 1);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(-52, -2);
        stack.push(stackValue);

        // Effettua la lessX con la variabile 'x'
        Complex result = operazioni.lessX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());
        
        Complex newC = new Complex(53.3, 3);
        
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a 'x' nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testLessX1_3() throws EmptyStackException, InsertVariableException {
        
        System.out.println("Test Less X - 1.3 due coppie di complessi positivi, in una coppia anche uno zero -> in: '-1 0' '2 2.3' - out: '-3 - 2,3i' ");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile 'x' nella LinkedHashMap
        Complex xValue = new Complex(-1, 0);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(2, 2.3);
        stack.push(stackValue);

        // Effettua la lessX con la variabile 'x'
        Complex result = operazioni.lessX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());
        
        Complex newC = new Complex(-3, -2.3);
        
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a 'x' nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testLessX1_4() throws EmptyStackException, InsertVariableException {
        
        System.out.println("Test Less X - 1.4 due coppie di complessi positivi di cui una coppia sono zeri -> in: '1.2 1.41' '0 0' - out: '1,2 1,41' ");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile 'x' nella LinkedHashMap
        Complex xValue = new Complex(1.2, 1.41);
        stack.push(xValue);
        operazioni.maggX("x");
        
        // Inizializza lo stack con almeno un valore
        Complex stackValue = new Complex(0, 0);
        stack.push(stackValue);

        // Effettua la lessX con la variabile 'x'
        Complex result = operazioni.lessX("x");

        // Verifica che il risultato restituito sia corretto
        assertNotNull(result.getReal());
        assertNotNull(result.getImaginary());
        
        Complex newC = new Complex(1.2, 1.41);
        
        assertEquals(newC.getReal(), result.getReal());
        assertEquals(newC.getImaginary(), result.getImaginary());

        operazioni.minX("x");
        // Verifica che il valore associato a 'x' nella LinkedHashMap sia stato aggiornato
        assertEquals(newC.getReal(), stack.top().getReal());
        assertEquals(newC.getImaginary(), stack.top().getImaginary());
    }
    
    @Test
    public void testLessX2() throws EmptyStackException {
        
        System.out.println("Test Less X - 2 una coppia di complessi positivi -> in: '1 191' - exception ");
        
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Inizializza la variabile 'x' nella LinkedHashMap 
        Complex xValue = new Complex(1, 191);
        stack.push(xValue);
        operazioni.maggX("x");

        stack.clear();
        // Effettua la lessX con la variabile 'x' su uno stack vuoto
        // Se si raggiunge questo punto, il test ha fallito
        // Verifica che il messaggio di errore corrisponda all'aspettativa
        assertThrows(EmptyStackException.class, () -> operazioni.lessX("x"));
    }
    
    @Test
    public void testLessX3() {
        System.out.println("Test Less X - 3 coppia di complessi positivi su variabile non inizializzata -> in: '1 0.1' - exception");
        // Effettua la lessX con la variabile 'x' non inizializzata su uno stack non vuoto
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        stack.push(new Complex(1,0.1));
        // Se si raggiunge questo punto, il test ha fallito
        // Verifica che il messaggio di errore corrisponda all'aspettativa
        assertThrows(InsertVariableException.class, () -> operazioni.lessX("x"));
    }
    
    @Test
    public void testLessX4() throws InsertVariableException{
        
        System.out.println("Test Less X - 4 variabile non inizializzata e stack vuoto -> in: ' ' - exception ");
        StackNum stack = new StackNum();
        OperazioniVariabili operazioni = new OperazioniVariabili(stack);
        // Effettua la lessX con la variabile 'x' non inizializzata su uno stack vuoto
        assertThrows(InsertVariableException.class, () -> operazioni.lessX("x"));
        // Se si raggiunge questo punto, il test ha fallito
    }
  
}
