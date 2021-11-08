package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.ref.Cleaner;
import java.lang.reflect.AnnotatedTypeVariable;

public class Controller {
    @FXML

    private Label welcomeText;
    public TextField display;

    public Button clear;


    public Button equals;

    public Button minus;
    public Button plus;
    public Button multiplication;
    public Button division;

    public Button point;

    public Button zero;
    public Button one;
    public Button two;
    public Button three;
    public Button four;
    public Button five;
    public Button six;
    public Button seven;
    public Button eight;
    public Button nine;

    Float date = 0f;
    int operation = -1;


    @FXML

    public void mouseBtnClick(ActionEvent actionEvent) {
        if (actionEvent.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (actionEvent.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (actionEvent.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (actionEvent.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (actionEvent.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (actionEvent.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (actionEvent.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (actionEvent.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (actionEvent.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (actionEvent.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (actionEvent.getSource() == point) {
            display.setText(display.getText() + ".");
        } else if (actionEvent.getSource() == clear) {
            display.clear();
        } else if (actionEvent.getSource() == plus) {
            date = Float.parseFloat(display.getText());
            operation = 1; // addition
            display.setText("");
        } else if (actionEvent.getSource() == minus) {
            date = Float.parseFloat(display.getText());
            operation = 2; // Subtraction
            display.setText("");
        } else if (actionEvent.getSource() == multiplication) {
            date = Float.parseFloat(display.getText());
            operation = 3; // Multiplication
            display.setText("");
        } else if (actionEvent.getSource() == division) {
            date = Float.parseFloat(display.getText());
            operation = 4; // Division
            display.setText("");
        } else if (actionEvent.getSource() == equals) {
            Float secondOperator = Float.parseFloat(display.getText());
            switch (operation) {
                case 1: // addition
                    Float result = date + secondOperator;
                    display.setText(String.valueOf(result));
                    break;
                case 2: // Subtraction
                    result = date - secondOperator;
                    display.setText(String.valueOf(result));
                    break;
                case 3: // Multiplication
                    result = date * secondOperator;
                    display.setText(String.valueOf(result));
                    break;
                case 4: // Division
                    result = date / secondOperator;
                    display.setText(String.valueOf(result));
                    break;
            }
        }
    }
}