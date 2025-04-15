package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class impressoraController {

    @FXML
    private Button btn_escanear;

    @FXML
    private Button btn_imprimir;

    @FXML
    private Button btn_pintar;

    @FXML
    private TextField camp_marcaImpressora;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void imprimir() {
    String marca = camp_marcaImpressora.getText();
    String mensagem = "A Impressora " + marca + " está Imprimindo.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void escanear() {
    String marca = camp_marcaImpressora.getText();
    String mensagem = "A Impressora " + marca + " está escaneando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void pintar() {
    String marca = camp_marcaImpressora.getText();
    String mensagem = "A Impressora " + marca + " está pintando a página.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
