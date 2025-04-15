package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class pessoaController {

    @FXML
    private Button btn_comer;

    @FXML
    private Button btn_dormir;

    @FXML
    private Button btn_trabalhar;

    @FXML
    private TextField camp_nomePessoa;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void comer() {
    String nome = camp_nomePessoa.getText();
    String mensagem = "O indivíduo chamado " + nome + " está comendo.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void dormir() {
    String nome = camp_nomePessoa.getText();
    String mensagem = "O indivíduo chamado " + nome + " está dormindo.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void trabalhar() {
    String nome = camp_nomePessoa.getText();
    String mensagem = "O indivíduo chamado " + nome + " está trabalhando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
