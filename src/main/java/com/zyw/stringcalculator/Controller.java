package com.zyw.stringcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text output;
    private String operator = "";
    private long number1 = 0L;
    private Calculator calculator = new Calculator();
    private boolean startFlag = true;

    @FXML
    private void handleNumber(ActionEvent event) {
        if (startFlag) {
            output.setText("");
            startFlag = false;
        }
        var value = ((Button) event.getSource()).getText();
        output.setText(output.getText() + value);
    }

    @FXML
    private void handleOperator(ActionEvent event) {
        var value = ((Button) event.getSource()).getText();
        if (!"=".equals(value)) {
            if (!operator.isEmpty()) {return;}
            operator = value;
            number1 = Long.parseLong(output.getText());
            output.setText("");
        } else {
            if (operator.isEmpty()) {return;}
            output.setText(String.valueOf(calculator.calculate(number1, Long.parseLong(output.getText()), operator)));
            operator = "";
            startFlag = true;
        }
    }
}