package org.example;

public class Moeda {
    private int valor;
    private String minerio;
    private int espesura;

    public Moeda(int valor, String minerio, int espesura) {
        this.valor = valor;
        this.minerio = minerio;
        this.espesura = espesura;
    }

    public void trocar() {
        System.out.println("A moeda de valor: " + valor + " foi trocada por uma bala");
    }

    public void girar() {
        System.out.println("A moeda de espessura " + espesura + "girou");
    }

    public void sortear() {
        System.out.println("A moeda de espessura " + espesura + "caiu cara");
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
