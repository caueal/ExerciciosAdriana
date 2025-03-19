package org.example;

public class Peixe {
    private String tipo;
    private String tamanho;
    private String sistemaResp;

    public Peixe(String tipo, String tamanho, String sistemaResp) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.sistemaResp = sistemaResp;
    }

    public void nadar() {
        System.out.println("O peixe do tipo " + tipo + " está Nadando.");
    }

    public void comer() {
        System.out.println("O peixe do tipo " + tipo + " está Comendo");
    }

    public void morder() {
        System.out.println("O peixe do tipo " + tipo + " está Mordendo");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

