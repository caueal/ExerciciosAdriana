package org.example;

public class Carro {
    private String modelo;
    private String ano;
    private String cor;

    public Carro(String modelo, String ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void andar() {
        System.out.println("O carro do modelo " + modelo + " está andando.");
    }

    public void frear() {
        System.out.println("O carro do modelo " + modelo + " está freando");
    }

    public void buzinar() {
        System.out.println("O carro do modelo " + modelo + " está buzinando");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

