package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuController {

    @FXML
    private void btn_cachorro() throws IOException {
        App.setRoot("cachorro");
    }

    @FXML
    private void btn_caneta() throws IOException {
        App.setRoot("caneta");
    }

    @FXML
    private void btn_carro() throws IOException {
        App.setRoot("carro");
    }

    @FXML
    private void btn_ferramenta() throws IOException {
        App.setRoot("ferramenta");
    }

    @FXML
    private void btn_impressora() throws IOException {
        App.setRoot("impressora");
    }

    @FXML
    private void btn_instrumento() throws IOException {
        App.setRoot("instrumento");
    }

    @FXML
    private void btn_moeda() throws IOException {
        App.setRoot("moeda");
    }

    @FXML
    private void btn_movel() throws IOException {
        App.setRoot("movel");
    }

    @FXML
    private void btn_peixe() throws IOException {
        App.setRoot("peixe");
    }

    @FXML
    private void btn_pessoa() throws IOException {
        App.setRoot("pessoa");
    }

}
