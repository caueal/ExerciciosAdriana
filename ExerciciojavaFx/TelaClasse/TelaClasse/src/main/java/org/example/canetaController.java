package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class canetaController {

    @FXML
    private Button btn_abrir;

    @FXML
    private Button btn_escreveu;

    @FXML
    private Button btn_gastou;

    @FXML
    private TextField camp_modeloCaneta;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
    private void escrever() {
    String modelo = camp_modeloCaneta.getText();
    String mensagem = "A caneta: " + modelo + " escreveu.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

    @FXML
    private void abre() {
    String modelo = camp_modeloCaneta.getText();
    String mensagem = "A caneta: " + modelo + " abriu!";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

    @FXML
    private void gastar() {
    String modelo = camp_modeloCaneta.getText();
    String mensagem = "A caneta: " + modelo + " gastou muita tinta.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}
    

}
