package pl.sdacademy.datetime.javafx.javafxexample.src.pl.sdacademy.javafxexample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button button;
    @FXML
    private Label label;
    @FXML
    private CheckBox checkBox;
    @FXML
    private TextField textField;

    public void initialize() {
        label.setText("abcd");
        checkBox.setText("to jest check box");

        button.setOnAction(event -> textField.setText("kliknieto przycisk"));

        checkBox.selectedProperty()
                .addListener((observable, oldValue, newValue) -> textField.setText(newValue.toString()));

    }
}
