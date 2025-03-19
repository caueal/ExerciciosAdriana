package org.example;

public class Caneta {
    private String modelo;
    private String corTinta;
    private int grossura;

    public Caneta(String modelo, String corTinta, int grossura) {
        this.modelo = modelo;
        this.corTinta = corTinta;
        this.grossura = grossura;
    }

    public void escrever() {
        System.out.println("A caneta: " + modelo + " Escreveu");
    }

    public void abre() {
        System.out.println("A caneta: " + modelo + " Abriu!");
    }

    public void gastar() {
        System.out.println("A caneta: " + modelo + " gastou muita tinta");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
