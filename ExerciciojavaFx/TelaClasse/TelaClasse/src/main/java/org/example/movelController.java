package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class movelController {

    @FXML
    private Button btn_abrir;

    @FXML
    private Button btn_enfeitar;

    @FXML
    private Button btn_guardar;

    @FXML
    private TextField camp_nome_armario;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void guardar() {
    String tipoMovel = camp_nome_armario.getText();
    String mensagem = "O móvel: " + tipoMovel + " está guardando utensílios.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void enfeitar() {
    String material = camp_nome_armario.getText();
    String mensagem = "O móvel feito de: " + material + " está enfeitando o ambiente muito bem.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void abrir() {
    String tipoMovel = camp_nome_armario.getText();
    String mensagem = "O móvel: " + tipoMovel + " abriu.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

    

}
