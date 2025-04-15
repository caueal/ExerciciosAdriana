package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ferramentaController {

    @FXML
    private Button btn_consertar;

    @FXML
    private Button btn_identificar;

    @FXML
    private Button btn_reestaurar;

    @FXML
    private TextField camp_modeloFerramenta;

    @FXML
    private void btn_menu() throws IOException {
        App.setRoot("menu");

    }

    @FXML
private void consertar() {
    String modelo = camp_modeloFerramenta.getText();
    String mensagem = "A ferramenta do modelo " + modelo + " está Consertando.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void identificar() {
    String marca = camp_modeloFerramenta.getText();
    String mensagem = "A ferramenta da marca " + marca + " ajudou a identificar o problema.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

@FXML
private void reestaurar() {
    String modelo = camp_modeloFerramenta.getText();
    String mensagem = "A ferramenta do modelo " + modelo + " restaurou a peça.";

    javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.INFORMATION);
    alert.setTitle("Informação");
    alert.setHeaderText(null);
    alert.setContentText(mensagem);
    alert.showAndWait();
}

}
