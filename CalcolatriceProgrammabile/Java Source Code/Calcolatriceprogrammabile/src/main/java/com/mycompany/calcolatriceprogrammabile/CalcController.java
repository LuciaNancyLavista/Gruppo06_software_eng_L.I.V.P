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
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import com.mycompany.cal.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.text.Font;
import project.exception.EmptyStackException;
import project.exception.InsertVariableException;

/**
 * FXML Controller class
 *
 * @author nancy
 */
public class CalcController implements Initializable {
    
    private Button[] buttonNum = new Button[11];
    private Button[] buttonletters = new Button[26];
    //private Button[] buttonStack = new Button[5];
    //private Button[] buttonOpe = new Button[6];
    //private Button[] buttonVar = new Button[4];
    
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
    private VBox vbox;
    @FXML
    private VBox VarBox;
    
    //instanza delle classi 
    private StackNum stackNum = new StackNum();
    
    private InserisciNumero inserisci = new InserisciNumero();
    
    private InserisciOperazioni ope = new InserisciOperazioni();
    
    private OperazioniVariabili opeVar = new OperazioniVariabili(stackNum);
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initLetters(buttonletters);
        initNumbers(buttonNum);
        //initVar(buttonVar);
        //initOpe(buttonOpe);
        //initSButton(buttonStack);
        
        //setOnAction dei pulsanti di utility
        for(int i=0;i<buttonletters.length;i++){
            buttonletters[i].setOnAction(event1->letters(event1));
        }
        for(int j=0;j<buttonNum.length;j++){
            buttonNum[j].setOnAction(event2->number(event2));
        } 
        
        spazio.setOnAction(event3->Spazio(event3));
        
        uguale.setOnAction(event4 -> Uguale(event4));
        
        //setOnAction dei pulsanti delle operazioni basilari
        add.setOnAction(event6 -> Addition(event6));
        
        min.setOnAction(event7 -> Minus(event7));
        
        mult.setOnAction(event8 -> Multiply(event8));
        
        div.setOnAction(event9 -> Division(event9));
        
        SQRT.setOnAction(event10 -> Radix(event10));
        
        invSign.setOnAction(event11 -> InvSign(event11));
        
        //setOnAction dei pulsanti di manipolazione dello stack
        clear.setOnAction(event5 -> Clear(event5));
        
        dup.setOnAction(event12 -> Dup(event12));
        
        drop.setOnAction(event13 -> Drop(event13));
        
        over.setOnAction(event14 -> Over(event14));
        
        swap.setOnAction(event15 -> Swap(event15));
        
        //setOnAction dei pulsati delle operazioni sulle varabili
        maggX.setOnAction(event16 -> {
            try {
                MaggX(event16);
            } catch (EmptyStackException ex) {
                insert.setText("Stack vuoto");
            }
        });
        
        minX.setOnAction(event17 -> {
            try {
                MinX(event17);
            } catch (InsertVariableException ex) {
                insert.setText("Variabile non inizializzata");
            }
        });
        
        plusX.setOnAction(event18 -> {
            try {
                PlusX(event18);
            } catch (InsertVariableException ex) {
                insert.setText("Variabile non inizializzata");
            } catch (EmptyStackException ex) {
                System.out.println("Stack Vuoto");
            }
        });
        
        lessX.setOnAction(event19 -> {
            try {
                LessX(event19);
            } catch (EmptyStackException ex) {
                insert.setText("Stack Vuoto");
            } catch (InsertVariableException ex) {
                insert.setText("Variabile non inizializzata");
            }
        });
        
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
    private void Uguale(ActionEvent event){
        String seq = insert.getText();
        inserisci.inserisci(seq, stackNum);
        Text stack = new Text();
        stack.setFont(new Font(20));
        stack.setText(stackNum.top().toString());
        vbox.getChildren().add(0,stack);
        insert.setText("");
        System.out.println(stackNum);
    }
    
    //Operazioni Basilari
    @FXML
    private void Division(ActionEvent event) {
        ope.div(stackNum);
        Text result = new Text();
        for(int i =0;i<2;i++){
            vbox.getChildren().remove(0);
        }
        result.setFont(new Font(20));
        result.setText(stackNum.top().toString());
        vbox.getChildren().add(0,result);
        System.out.println(stackNum);
    }

    @FXML
    private void Multiply(ActionEvent event) {
        ope.mult(stackNum);
        Text result = new Text();
        for(int i =0;i<2;i++){
            vbox.getChildren().remove(0);
        }
        result.setFont(new Font(20));
        result.setText(stackNum.top().toString());
        vbox.getChildren().add(0,result);
        System.out.println(stackNum);
    }

    @FXML
    private void Addition(ActionEvent event) {
        ope.add(stackNum);
        Text result = new Text();
        for(int i =0;i<2;i++){
            vbox.getChildren().remove(0);
        }
        result.setFont(new Font(20));
        result.setText(stackNum.top().toString());
        vbox.getChildren().add(0,result);
        System.out.println(stackNum);
    }

    @FXML
    private void Minus(ActionEvent event) {
        ope.sub(stackNum);
        Text result = new Text();
        for(int i =0;i<2;i++){
            vbox.getChildren().remove(0);
        }
        result.setFont(new Font(20));
        result.setText(stackNum.top().toString());
        vbox.getChildren().add(0,result);
        System.out.println(stackNum);
    }

    @FXML
    private void Radix(ActionEvent event) {
        ope.sqrt(stackNum);
        Text result1,result2;
        result1 = new Text();
        result2 = new Text();
        result1.setFont(new Font(20));
        result2.setFont(new Font(20));
        vbox.getChildren().remove(0);
        
        result1.setText(stackNum.top().toString());
        ope.invSign(stackNum);
        result2.setText(stackNum.top().toString());
        
        vbox.getChildren().add(0,result1);
        vbox.getChildren().add(0,result2);
        System.out.println(stackNum);
    }

    @FXML
    private void InvSign(ActionEvent event) {
        ope.invSign(stackNum);
        Text result = new Text();
        vbox.getChildren().remove(0);
        result.setFont(new Font(20));
        result.setText(stackNum.top().toString());
        vbox.getChildren().add(0,result);
        System.out.println(stackNum);     
    }
    
    //Operazioni sulle variabili
    @FXML
    private void MaggX(ActionEvent event) throws EmptyStackException {
        String var = insert.getText();
        opeVar.maggX(var);
        Text varResult = new Text();
        varResult.setFont(new Font(15));
        varResult.setText(var + " = " + stackNum.top().toString());
        VarBox.getChildren().add(0,varResult);
        insert.setText("");
        System.out.println(opeVar.vars.toString());
    }

    @FXML
    private void LessX(ActionEvent event) throws EmptyStackException, InsertVariableException {
        /*
        String str = insert.getText();
        Complex c = opeVar.lessX(str);
        Text result = new Text();
        result.setFont(new Font(15));
        result.setText(str + "=" + c.toString());
        VarBox.getChildren().remove(0);
        VarBox.getChildren().add(0,result);
        System.out.println(opeVar.vars.toString());
        System.out.println(stackNum);
        */
    }

    @FXML
    private void MinX(ActionEvent event) throws InsertVariableException{
        String str = insert.getText();
        opeVar.minX(str);
        System.out.println(stackNum);
        Text var = new Text();
        var.setFont(new Font(20));
        var.setText(stackNum.top().toString());
        vbox.getChildren().add(0,var);
        
        
    }

    @FXML
    private void PlusX(ActionEvent event) throws InsertVariableException, EmptyStackException {
        /*
        String str = insert.getText();
        Complex c = opeVar.plusX(str);
        Text result = new Text();
        result.setFont(new Font(15));
        result.setText(str + "=" + c.toString());
        VarBox.getChildren().remove(0);
        VarBox.getChildren().add(0,result);
        System.out.println(opeVar.vars.toString());
        System.out.println(stackNum);
        */
        
    }
    
    //Operazioni di Manipolazione dello Stack
    @FXML
    private void Clear(ActionEvent event){
        stackNum.clear();
        vbox.getChildren().clear();
        System.out.println("Clear");
    }
    
    @FXML
    private void Dup(ActionEvent event) {
        Text result = new Text();
        result.setFont(new Font(20));
        result.setText(stackNum.top().toString());
        vbox.getChildren().add(0,result);
        stackNum.dup();
        System.out.println(stackNum);
        
        
    }

    @FXML
    private void Drop(ActionEvent event) {
        Text result = new Text();
        result.setFont(new Font(20));
        vbox.getChildren().remove(0);
        stackNum.drop();
        System.out.println(stackNum);
        
    }

    @FXML
    private void Over(ActionEvent event) {
        stackNum.over();
        Text result = new Text();
        result.setFont(new Font(20));
        result.setText(stackNum.top().toString());
        vbox.getChildren().add(0,result);
        System.out.println(stackNum);
    }

    @FXML
    private void Swap(ActionEvent event) {
        Text result1,result2;
        result1 = new Text();
        result2 = new Text();
        result1.setFont(new Font(20));
        result2.setFont(new Font(20));
        
        result1.setText(stackNum.top().toString());
        for(int i=0;i<2;i++){
            vbox.getChildren().remove(0);
        }
        stackNum.swap();
        result2.setText(stackNum.top().toString());
        
        vbox.getChildren().add(0,result1);
        vbox.getChildren().add(0,result2);
        
        System.out.println(stackNum);
    }
    
    
    
    //Sezione di Inizializzazione dei Pulsanti da sposatare in una classe apposita;
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
    /*
    private void initVar(Button[] buts){
        buts[0] = maggX;
        buts[1] = lessX;
        buts[2] = minX;
        buts[3] = plusX;
    }
    
    private void initOpe(Button[] btns){
        btns[0] = div;
        btns[1] = mult;
        btns[2] = add;
        btns[3] = min;
        btns[4] = invSign;
        btns[5] = SQRT;
    }
    private void initSButton(Button[] sbut){
        sbut[0] = clear;
        sbut[1] = dup;
        sbut[2] = drop;
        sbut[3] = swap;
        sbut[4] = over;
    }
*/
}
