package com.example.numberconverter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public class Controller {

    @FXML
    public TextField decimalInput;
    public Button convertBtn;
    public Button resetBtn;
    public Label convertedBinaryLabel;
    public Label convertedOctaLabel;
    public Label convertedHexadecimalLabel;

    @FXML


    public void convertNumber(ActionEvent actionEvent) {

      if (decimalInput.getText().isEmpty()) {                                    //exception empty label

            return;
        } else {

            int decimalValue = Integer.valueOf(decimalInput.getText());

            convertedBinaryLabel.setText(Integer.toBinaryString(decimalValue));

            convertedOctaLabel.setText(Integer.toOctalString(decimalValue));

            convertedHexadecimalLabel.setText(Integer.toHexString(decimalValue));
        }

    }


    public void resetNumber(ActionEvent actionEvent) {

        decimalInput.clear();
        convertedBinaryLabel.setText("");
        convertedOctaLabel.setText("");
        convertedHexadecimalLabel.setText("");
    }
}
