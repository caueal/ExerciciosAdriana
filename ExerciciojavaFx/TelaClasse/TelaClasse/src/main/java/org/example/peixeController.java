package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class peixeController {

    @FXML
    private Button btn_alimentar;

    @FXML
    private Button btn_comer;

    @FXML
    private Button btn_morder;

    @FXML
    private TextField camp_tipoPeixe;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void nadar() {
    String tipo = camp_tipoPeixe.getText();
    String mensagem = "O peixe do tipo " + tipo + " está Nadando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void comer() {
    String tipo = camp_tipoPeixe.getText();
    String mensagem = "O peixe do tipo " + tipo + " está Comendo.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void morder() {
    String tipo = camp_tipoPeixe.getText();
    String mensagem = "O peixe do tipo " + tipo + " está Mordendo.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
