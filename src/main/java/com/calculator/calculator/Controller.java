package com.calculator.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;



public class Controller implements Initializable {

    Float data = 0f;
    int operation = -1;
    @FXML
    private Button equals;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button seven;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button doubleZero;
    @FXML
    private Button addDecimal;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button multiply;
    @FXML
    private Button divide;
    @FXML
    private Button clear;
    @FXML
    private Button clearAll;
    @FXML
    private Button percentage;
    @FXML
    private TextArea textAreaInput;


    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            textAreaInput.setText(textAreaInput.getText() + "1");
        } else if (event.getSource() == two) {
            textAreaInput.setText(textAreaInput.getText() + "2");
        } else if (event.getSource() == three) {
            textAreaInput.setText(textAreaInput.getText() + "3");
        } else if (event.getSource() == four) {
            textAreaInput.setText(textAreaInput.getText() + "4");
        } else if (event.getSource() == five) {
            textAreaInput.setText(textAreaInput.getText() + "5");
        } else if (event.getSource() == six) {
            textAreaInput.setText(textAreaInput.getText() + "6");
        } else if (event.getSource() == seven) {
            textAreaInput.setText(textAreaInput.getText() + "7");
        } else if (event.getSource() == eight) {
            textAreaInput.setText(textAreaInput.getText() + "8");
        } else if (event.getSource() == nine) {
            textAreaInput.setText(textAreaInput.getText() + "9");
        } else if (event.getSource() == zero) {
            textAreaInput.setText(textAreaInput.getText() + "0");
        } else if (event.getSource() == doubleZero) {
            textAreaInput.setText(textAreaInput.getText() + "00");
        } else if (event.getSource() == addDecimal) {
            textAreaInput.setText(textAreaInput.getText() + ".");
        } else if (event.getSource() == clearAll) {
            textAreaInput.setText("");
        } else if (event.getSource()==clear) {
            textAreaInput.setText("");
        } else if (event.getSource() == plus) {
            data = Float.parseFloat(textAreaInput.getText());
            operation = 1; //Addition
            textAreaInput.setText("");
        } else if (event.getSource() == minus) {
            data = Float.parseFloat(textAreaInput.getText());
            operation = 2; //subtraction
            textAreaInput.setText("");
        } else if (event.getSource() == multiply) {
            data = Float.parseFloat(textAreaInput.getText());
            operation = 3; //multiplication
            textAreaInput.setText("");
        } else if (event.getSource() == divide) {
            data = Float.parseFloat(textAreaInput.getText());
            operation = 4; //division
            textAreaInput.setText("");
        } else if (event.getSource() == percentage) {
            data = Float.parseFloat(textAreaInput.getText());
            operation = 5; //percentage
            textAreaInput.setText("");
        } else if (event.getSource() == equals) {
            Float secondOperand = Float.parseFloat(textAreaInput.getText());
            switch (operation) {
                case 1: //Addition
                    Float ans = data + secondOperand;
                    textAreaInput.setText(String.valueOf(ans));
                    break;
                case 2:  //subtraction
                    ans = data - secondOperand;
                    textAreaInput.setText(String.valueOf(ans));
                    break;
                case 3: //multiplication
                    ans = data * secondOperand;
                    textAreaInput.setText(String.valueOf(ans));
                    break;
                case 4: //division
                    ans = data / secondOperand;
                    textAreaInput.setText(String.valueOf(ans));
                    break;
                case 5: //percentage
                    ans = data * (secondOperand / 100);
                    textAreaInput.setText(String.valueOf(ans) + "%");
                    break;
            }


        }


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("in init method......");
    }
}