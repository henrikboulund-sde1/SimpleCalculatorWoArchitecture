package dk.easv.simplecalculator01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtValue1;

    @FXML
    private Label lblOperator;

    @FXML
    private TextField txtValue2;

    @FXML
    private Button btnPlus;

    @FXML
    private Button btnMinus;

    @FXML
    private Button btnMultiply;

    @FXML
    private Button btnDivide;

    @FXML
    private Button btnCalculate;

    @FXML
    private Label lblResult;


    public void onPlusOperation(ActionEvent actionEvent) {
        lblOperator.setText("+");
    }

    public void onMinusOperation(ActionEvent actionEvent) {
        lblOperator.setText("-");
    }

    public void onMultiplyOperation(ActionEvent actionEvent) {
        lblOperator.setText("*");
    }

    public void onDivideOperation(ActionEvent actionEvent) {
        lblOperator.setText("/");
    }

    public void onCalculate(ActionEvent actionEvent) {
        int value1 = Integer.parseInt(txtValue1.getText());
        int value2 = Integer.parseInt(txtValue2.getText());

        if(lblOperator.getText() == "+")
        {
            int result = value1 + value2;
            lblResult.setText(result + "");
        }
        else if(lblOperator.getText() == "-")
        {
            int result = value1 - value2;
            lblResult.setText(result + "");
        }
        else if(lblOperator.getText() == "*")
        {
            int result = value1 * value2;
            lblResult.setText(result + "");
        }
        else if(lblOperator.getText() == "/")
        {
            int result = value1 / value2;
            lblResult.setText(result + "");
        }
    }
}