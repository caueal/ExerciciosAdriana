package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class cachorroController {

    @FXML
    private Button btn_andar;

    @FXML
    private Button btn_latir;

    @FXML
    private Button btn_menu;

    @FXML
    private Button btn_rosnar;

    @FXML
    private TextField camp_racaCachorro;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
    private void retornaAndo() {
    
    String raca = camp_racaCachorro.getText();

    String mensagem = "O cachorro da raça " + raca + " está andando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
    private void retornaLatido() {
    
    String raca = camp_racaCachorro.getText();

    String mensagem = "O cachorro da raça " + raca + " está latindo.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
    private void retornaRosna() {
    
    String raca = camp_racaCachorro.getText();

    String mensagem = "O cachorro da raça " + raca + " está rosnando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
