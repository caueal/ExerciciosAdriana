package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class instrumentoController {

    @FXML
    private Button btn_afinar;

    @FXML
    private Button btn_desgastar;

    @FXML
    private Button btn_tocar;

    @FXML
    private TextField camp_tipoInstrumento;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void tocar() {
    String tipo = camp_tipoInstrumento.getText();
    String mensagem = "O instrumento: " + tipo + " está tocando impecavelmente.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void afinar() {
    String tipo = camp_tipoInstrumento.getText();
    String mensagem = "O instrumento: " + tipo + " está afinando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void desgastar() {
    String tipo = camp_tipoInstrumento.getText();
    String mensagem = "O instrumento: " + tipo + " está desgastado.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
