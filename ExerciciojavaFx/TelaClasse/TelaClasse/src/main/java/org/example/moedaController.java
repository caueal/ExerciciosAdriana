package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class moedaController {

    @FXML
    private Button btn_girar;

    @FXML
    private Button btn_sortear;

    @FXML
    private Button btn_troca;

    @FXML
    private TextField camp_valorMoeda;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void trocar() {
    String valor = camp_valorMoeda.getText();
    String mensagem = "A moeda de valor: " + valor + " foi trocada por uma bala.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void girar() {
    String espesura = camp_valorMoeda.getText();
    String mensagem = "A moeda de espessura " + espesura + " girou.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void sortear() {
    String espesura = camp_valorMoeda.getText();
    String resultado = Math.random() < 0.5 ? "cara" : "coroa";
    String mensagem = "A moeda de espessura " + espesura + " caiu " + resultado + ".";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
