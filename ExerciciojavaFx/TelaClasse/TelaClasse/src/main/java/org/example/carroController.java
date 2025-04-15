package org.example;
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class carroController {

    @FXML
    private Button btn_andar;

    @FXML
    private Button btn_buzinar;

    @FXML
    private Button btn_frear;

    @FXML
    private TextField camp_modeloCarro;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void andar() {
    String modelo = camp_modeloCarro.getText();
    String mensagem = "O carro do modelo " + modelo + " está andando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void frear() {
    String modelo = camp_modeloCarro.getText();
    String mensagem = "O carro do modelo " + modelo + " está freando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void buzinar() {
    String modelo = camp_modeloCarro.getText();
    String mensagem = "O carro do modelo " + modelo + " está buzinando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
