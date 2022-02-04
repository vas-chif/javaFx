package com.example.convertero2flow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    CalculateValueO2 parameter = new CalculateValueO2(50, 25);

    public TextField FiO2Input;
    public TextField FlowInput;

    public Label O2Output;
    public Label AirOutput;


    public Button clearBtn;
    public Button resultBtn;


    public void clickAction(ActionEvent actionEvent) {
        CalculateValueO2 value = new CalculateValueO2(FiO2Input.getText().hashCode(), FlowInput.getText().hashCode());


        if (FlowInput.getText().isEmpty() || FiO2Input.getText().isEmpty()) {
            return;
        }


        if (actionEvent.getSource() == clearBtn) {
            O2Output.setText(" ");
            AirOutput.setText(" ");

            FiO2Input.clear();
            FlowInput.clear();

        }

        double fio2TCalculate = Double.valueOf(FiO2Input.getText());
        double flowToCalculate = Double.valueOf(FiO2Input.getText());

        if (actionEvent.getSource() == resultBtn) {
            O2Output = value.oxigen(String.valueOf());

        }


    }

}