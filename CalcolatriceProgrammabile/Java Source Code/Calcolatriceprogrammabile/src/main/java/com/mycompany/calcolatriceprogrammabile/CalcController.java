/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calcolatriceprogrammabile;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import com.mycompany.cal.*;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.scene.text.Font;
import project.exception.EmptyStackException;
import project.exception.InsertVariableException;
import project.exception.OpeArithmeticException;

/**
 * FXML Controller class
 *
 * @author Luigi Veniero
 */
public class CalcController implements Initializable {
    
    private Button[] buttonNum = new Button[11];
    private Button[] buttonletters = new Button[26];
    
    @FXML
    private TextField insert;
    @FXML
    private Button num1;
    @FXML
    private Button num2;
    @FXML
    private Button num3;
    @FXML
    private Button num4;
    @FXML
    private Button num5;
    @FXML
    private Button num6;
    @FXML
    private Button num7;
    @FXML
    private Button num8;
    @FXML
    private Button num9;
    @FXML
    private Button punto;
    @FXML
    private Button num0;
    @FXML
    private Button uguale;
    @FXML
    private Button div;
    @FXML
    private Button mult;
    @FXML
    private Button add;
    @FXML
    private Button min;
    @FXML
    private Button invSign;
    @FXML
    private Button SQRT;
    @FXML
    private Button a;
    @FXML
    private Button b;
    @FXML
    private Button c;
    @FXML
    private Button d;
    @FXML
    private Button e;
    @FXML
    private Button f;
    @FXML
    private Button g;
    @FXML
    private Button h;
    @FXML
    private Button i;
    @FXML
    private Button j;
    @FXML
    private Button k;
    @FXML
    private Button l;
    @FXML
    private Button m;
    @FXML
    private Button n;
    @FXML
    private Button p;
    @FXML
    private Button q;
    @FXML
    private Button r;
    @FXML
    private Button s;
    @FXML
    private Button t;
    @FXML
    private Button o;
    @FXML
    private Button u;
    @FXML
    private Button v;
    @FXML
    private Button w;
    @FXML
    private Button x;
    @FXML
    private Button y;
    @FXML
    private Button z;
    @FXML
    private Button clear;
    @FXML
    private Button dup;
    @FXML
    private Button drop;
    @FXML
    private Button over;
    @FXML
    private Button swap;
    @FXML
    private Button maggX;
    @FXML
    private Button lessX;
    @FXML
    private Button minX;
    @FXML
    private Button plusX;
    @FXML
    private Button spazio;
    @FXML
    private ListView<String> vbox;
    @FXML
    private ListView<String> VarBox;
    @FXML
    private TextField exception;
    @FXML
    private Button clrVar;
    
    //instanza delle classi 
    private StackNum stackNum = new StackNum();
    
    private InserisciNumero inserisci = new InserisciNumero();
    
    private InserisciOperazioni ope = new InserisciOperazioni();
    
    private OperazioniVariabili opeVar = new OperazioniVariabili(stackNum);
    
    //instanza di due liste osservabili per la gestione della cronologia dello stack e delle variabili
    private ObservableList<String> stack = FXCollections.observableArrayList();
    
    private ObservableList<String> variabili = FXCollections.observableArrayList();
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //funzioni init dei pulsanti della calcolatrice
        initLetters(buttonletters);
        initNumbers(buttonNum);
        
        //settaggio del colore per lo stack grafico
        vbox.setStyle("-fx-control-inner-background: #ac9eff;");
        
        //settaggio del colore per la cronologia delle variabili
        VarBox.setStyle("-fx-control-inner-background: #ac9eff;");
        
        //binding per i pulsanti dello stack
        dup.disableProperty().bind(Bindings.isEmpty(stack));
        drop.disableProperty().bind(Bindings.isEmpty(stack));
        swap.disableProperty().bind(Bindings.isEmpty(stack));
        over.disableProperty().bind(Bindings.isEmpty(stack));
        
        //collegamento alla lista osservabile(stack)
        vbox.setItems(stack);
        
        //collegamento alla lista osservabile(variabli)
        VarBox.setItems(variabili);
        
        //setOnAction dei pulsanti di utility
        for(int i=0;i<buttonletters.length;i++){
            buttonletters[i].setOnAction(event1->letters(event1));
        }
        for(int j=0;j<buttonNum.length;j++){
            buttonNum[j].setOnAction(event2->number(event2));
        } 
        
        spazio.setOnAction(event3->Spazio(event3));
        
        uguale.setOnAction(event4 -> {
            try {
                Uguale(event4);
            } catch (Exception ex) {
                exception.setText("");
                exception.setText("Errore,numero di parametri errato");
            }
        });
        
        //setOnAction dei pulsanti delle operazioni basilari
        add.setOnAction(event6 -> {
            try {
                Addition(event6);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Non ci sono abbastanza valori nello stack"); 
            }
        });
        
        min.setOnAction(event7 -> {
            try {
                Minus(event7);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Non ci sono abbastanza valori nello stack");
            }
        });
        
        mult.setOnAction(event8 -> {
            try {
                Multiply(event8);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Non ci sono abbastanza valori nello stack");
            }
        });
        
        div.setOnAction(event9 -> {
            try {
                Division(event9);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Non ci sono abbastanza valori nello stack");
            } catch (OpeArithmeticException ex) {
                exception.setText("");
                exception.setText("Operazione Aritmetica impossibile");
            }
        });
        
        SQRT.setOnAction(event10 -> {
            try {
                Radix(event10);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Non ci sono abbastanza valori nello stack"); 
            }
        });
        
        invSign.setOnAction(event11 -> {
            try {
                InvSign(event11);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Non ci sono abbastanza valori nello stack"); 
            }
        });
        
        //setOnAction dei pulsanti di manipolazione dello stack
        clear.setOnAction(event5 -> Clear(event5));
        
        dup.setOnAction(event12 -> Dup(event12));
        
        drop.setOnAction(event13 -> Drop(event13));
        
        over.setOnAction(event14 -> {
            try {
                Over(event14);
            } catch (Exception ex) {
                exception.setText("");
                exception.setText("Over non possibile, non ci sono abbastanza valori");
            }
        });
        
        swap.setOnAction(event15 -> {
            try {
                Swap(event15);
            } catch (Exception ex) {
                exception.setText("");
                exception.setText("Swap non possibile, non ci sono abbastanza valori");
            }
        });
        
        //setOnAction dei pulsati delle operazioni sulle varabili
        maggX.setOnAction(event16 -> {
            try {
                MaggX(event16);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Stack vuoto");
            }catch(Exception ex){
                exception.setText("");
                exception.setText("Campo degli inserimenti vuoto");
                
            }
        });
        
        minX.setOnAction(event17 -> {
            try {
                MinX(event17);
            } catch (InsertVariableException ex) {
                exception.setText("");
                exception.setText("Variabile non inizializzata");
            }catch(Exception ex){
                exception.setText("");
                exception.setText("Campo degli inserimenti vuoto");
            }
        });
        
        plusX.setOnAction(event18 -> {
            try {
                PlusX(event18);
            } catch (InsertVariableException ex) {
                exception.setText("");
                exception.setText("Variabile non inizializzata");
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Stack Vuoto");
            }catch(Exception ex){
                exception.setText("");
                exception.setText("Campo degli inserimenti vuoto");
            }
        });
        
        lessX.setOnAction(event19 -> {
            try {
                LessX(event19);
            } catch (EmptyStackException ex) {
                exception.setText("");
                exception.setText("Stack Vuoto");
            } catch (InsertVariableException ex) {
                exception.setText("");
                exception.setText("Variabile non inizializzata");
            }catch(Exception ex){
                exception.setText("");
                exception.setText("Campo degli inserimenti vuoto");
            }
        });
        
        clrVar.setOnAction(event20 -> ClearVariable(event20));
        
    }    
    
    //Funzioni Base della Calcolatrice
    @FXML
    private void number(ActionEvent event){
        String numero = ((Button)event.getSource()).getText();
        insert.appendText(numero);
        System.out.println("Numero"); 
    }
    

    @FXML
    private void letters(ActionEvent event) {
        String lettera = ((Button)event.getSource()).getText();
        insert.appendText(lettera);
        System.out.println("Lettera");
    }


    @FXML
    private void Spazio(ActionEvent event) {
        System.out.println("Spazio");
        insert.appendText(" ");
    }
    
    @FXML
    private void Uguale(ActionEvent event) throws Exception{
        String seq = insert.getText();
        if(seq.isEmpty() || seq.length() <3)
            throw new Exception();
        exception.setText("");
        inserisci.inserisci(seq, stackNum);
        stack.add(0,stackNum.top().toString());
        insert.setText("");
        System.out.println(stackNum);
    }
    
    //Operazioni Basilari
    @FXML
    private void Division(ActionEvent event) throws EmptyStackException, OpeArithmeticException {
        ope.div(stackNum);
        for(int i =0;i<2;i++){
            stack.remove(0);    
        }
        stack.add(0,stackNum.top().toString());
        System.out.println(stackNum);
    }

    @FXML
    private void Multiply(ActionEvent event) throws EmptyStackException {
        ope.mult(stackNum);
        for(int i =0;i<2;i++){
            stack.remove(0);
        }
        stack.add(0,stackNum.top().toString());
        System.out.println(stackNum);
        
    }

    @FXML
    private void Addition(ActionEvent event) throws EmptyStackException {
        ope.add(stackNum);
        for(int i =0;i<2;i++){
            stack.remove(0);
        }
        
        stack.add(0,stackNum.top().toString());
        System.out.println(stackNum);
        
    }

    @FXML
    private void Minus(ActionEvent event) throws EmptyStackException {
        ope.sub(stackNum);
        for(int i =0;i<2;i++){
            stack.remove(0);
        }
        stack.add(0,stackNum.top().toString());
        System.out.println(stackNum);
    }

    @FXML
    private void Radix(ActionEvent event) throws EmptyStackException {
        ope.sqrt(stackNum);
        
        stack.remove(0);
        
        Complex c = stackNum.drop();
        stack.add(0,stackNum.top().toString());
        stack.add(0,c.toString());
        stackNum.push(c);
        
        System.out.println(stackNum);
        
    }

    @FXML
    private void InvSign(ActionEvent event) throws EmptyStackException {
        ope.invSign(stackNum);
        stack.remove(0);
        stack.add(0,stackNum.top().toString());
        System.out.println(stackNum); 
    }
    
    //Operazioni sulle variabili
    @FXML
    private void MaggX(ActionEvent event) throws EmptyStackException,Exception{
        String var = insert.getText();
        if(var.equals("")){
            throw new Exception();
        }
        opeVar.maggX(var);
        variabili.add(0,var.charAt(var.length()-1) + " = " + stackNum.top().toString());
        insert.setText("");
        System.out.println(stackNum);
    }
    
    //aggiungere le eccezioni e iniziare a fare screen codici
    @FXML
    private void LessX(ActionEvent event) throws EmptyStackException, InsertVariableException, Exception {
        String str = insert.getText();
        if(str.equals("")){
            throw new Exception();
        }
        Complex c = opeVar.lessX(str);

        variabili.remove(0);
        variabili.add(0,str + "=" + c.toString());
        System.out.println(stackNum);
        
    }

    @FXML
    private void MinX(ActionEvent event) throws InsertVariableException, Exception{
        String str = insert.getText();
        if(str.equals("")){
            throw new Exception();
        }
        opeVar.minX(str);
        System.out.println(stackNum);
        Text var = new Text();
        var.setFont(new Font(20));
        var.setText(stackNum.top().toString());
        stack.add(0,var.getText());
        
    }

    @FXML
    private void PlusX(ActionEvent event) throws InsertVariableException, EmptyStackException, Exception {
        String str = insert.getText();
        if(str.equals("")){
            throw new Exception();
        }
        Complex c = opeVar.plusX(str);
        variabili.remove(0);
        variabili.add(0,str + "=" + c);
        System.out.println(stackNum); 
    }
    
    @FXML
    private void ClearVariable(ActionEvent event) {
        variabili.clear();
    }
    
    //Operazioni di Manipolazione dello Stack
    @FXML
    private void Clear(ActionEvent event){
        stackNum.clear();
        stack.clear();
        System.out.println("Clear");
    }
    
    @FXML
    private void Dup(ActionEvent event) {
        stack.add(0,stackNum.top().toString());
        stackNum.dup();
        System.out.println(stackNum);
    }
    
    @FXML
    private void Drop(ActionEvent event) {
        stack.remove(0);
        stackNum.drop();
        System.out.println(stackNum);
    }

    @FXML
    private void Over(ActionEvent event) throws Exception {
        if(stackNum.stackSize() < 2)
            throw new Exception();
        stackNum.over();
        stack.add(0,stackNum.top().toString());
        System.out.println(stackNum);
    }

    @FXML
    private void Swap(ActionEvent event) throws Exception {
        String c = stackNum.top().toString();
        if(stackNum.stackSize() < 2)
            throw new Exception();
        for(int i=0;i<2;i++){
            stack.remove(0);
        }
        
        stackNum.swap();
        stack.add(0,c);
        stack.add(0,stackNum.top().toString());
        
        System.out.println(stackNum);

    }
 
    //Sezione di Inizializzazione dei Pulsanti
    private void initNumbers(Button[] butt){
        butt[0] = num0;
        butt[1] = num1;
        butt[2] = num2;
        butt[3] = num3;
        butt[4] = num4;
        butt[5] = num5;
        butt[6] = num6;
        butt[7] = num7;
        butt[8] = num8;
        butt[9] = num9;
        butt[10] = punto;
    }
    
    private void initLetters(Button[] btn){
        btn[0] = a;
        btn[1] = b;
        btn[2] = c;
        btn[3] = d;
        btn[4] = e;
        btn[5] = f;
        btn[6] = g;
        btn[7] = h;
        btn[8] = i;
        btn[9] = j;
        btn[10] = k;
        btn[11] = l;
        btn[12] = m;
        btn[13] = n;
        btn[14] = o;
        btn[15] = p;
        btn[16] = q;
        btn[17] = r;
        btn[18] = s;
        btn[19] = t;
        btn[20] = u;
        btn[21] = v;
        btn[22] = w;
        btn[23] = x;
        btn[24] = y;
        btn[25] = z;
    }

}
