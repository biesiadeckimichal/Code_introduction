package pl.sdacademy.datetime.javafx.calculator.src.pl.sdacademy;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField inputTextField1;

    @FXML
    private TextField inputTextField2;

    @FXML
    private TextField outputTextField;

    @FXML
    private Button plus;

    public void initialize() {
        plus.setText("+");


    }
}
