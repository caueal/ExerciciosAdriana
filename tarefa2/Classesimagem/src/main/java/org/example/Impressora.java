package org.example;

public class Impressora {
    private String marca;
    private String modelo;
    private String tamanho;

    public Impressora(String marca, String modelo, String tamanho) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanho = tamanho;
    }

    public void imprimir() {
        System.out.println("A Impressora " + marca + " está Imprimindo.");
    }

    public void escanear() {
        System.out.println("A Impressora " + marca + " está escaneando.");
    }

    public void pintar() {
        System.out.println("A Impressora " + marca + " está pintando a pagina.");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}