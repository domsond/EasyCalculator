package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CalculatorController {

    private Double number;
    private Double number2;
    private Double result;
    private String operator;
    @FXML
    private TextField textField;
    @FXML
    private TextField smallerField;

    public void getNum() throws IOException{
        String t = textField.getText();
        System.out.println(t);
        System.out.println(operator);
        String []tab;
        if(operator=="+")
            tab = t.split("\\+");
        else if(operator=="*")
            tab = t.split("\\*");
        else
            tab = t.split(operator);

        for(String i: tab) System.out.println(i);
        number = Double.parseDouble(tab[0]);
        number2 = Double.parseDouble(tab[1]);

       // System.out.println("Liczby: "+number + "   "+ number2);
    }
    public void one(ActionEvent e) throws IOException {
        textField.appendText("1");
    }
    public void two(ActionEvent e) throws IOException {
        textField.appendText("2");
    }
    public void three(ActionEvent e) throws IOException {
        textField.appendText("3");
    }
    public void four(ActionEvent e) throws IOException {
        textField.appendText("4");
    }
    public void five(ActionEvent e) throws IOException {
        textField.appendText("5");
    }
    public void six(ActionEvent e) throws IOException {
        textField.appendText("6");
    }
    public void seven(ActionEvent e) throws IOException {
        textField.appendText("7");
    }
    public void eight(ActionEvent e) throws IOException {
        textField.appendText("8");
    }
    public void nine(ActionEvent e) throws IOException {
        textField.appendText("9");
    }
    public void zero(ActionEvent e) throws IOException {
        textField.appendText("0");
    }
    public void add(ActionEvent e) throws IOException {
        textField.appendText("+");
        operator = "+";
    }
    public void substract(ActionEvent e) throws IOException {
        textField.appendText("-");
        operator = "-";
    }
    public void multiply(ActionEvent e) throws IOException {
        textField.appendText("*");
        operator = "*";
    }
    public void divide(ActionEvent e) throws IOException {
        textField.appendText("/");
        operator = "/";
    }
    public void equals(ActionEvent e) throws IOException {
        getNum();
        int operations=0;
        smallerField.appendText(textField.getText()+"=");
        textField.clear();
        switch(operator){
            case "+": result = number + number2; operator=""; operations++; textField.appendText(String.valueOf(result)); break;
            case "-": result = number - number2; operator=""; operations++; textField.appendText(String.valueOf(result)); break;
            case "*": result = number * number2; operator=""; operations++; textField.appendText(String.valueOf(result)); break;
            case "/":
                if(number2 != 0)
                {
                    result = number / number2;
                    textField.appendText(String.valueOf(result));
                }
                else
                    textField.setText("Error");
                operations++;
                operator="";
                break;
        }

        if(operations != 0){
            String num = String.valueOf(Double.parseDouble(String.valueOf(result)));
            number = 0.0;
            number2 = 0.0;
            result=0.0;
            //smallerField.clear();
            textField.clear();
            textField.appendText(num);
        }
       // System.out.println(result);
    }

    public void clear(ActionEvent e) throws IOException {
        textField.clear();
        smallerField.clear();
        number=0.0;
        number2=0.0;
        result=0.0;
    }

    public void backspace(ActionEvent e) throws IOException{
        String text = textField.getText();
        if(text.length() >0){
            String t = text.substring(0, text.length()-1);
            textField.clear();
            textField.appendText(t);
        }

    }

    public void point(ActionEvent e) throws IOException {
        textField.appendText(".");
    }
}