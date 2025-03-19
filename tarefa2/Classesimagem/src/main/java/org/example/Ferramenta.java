package org.example;

public class Ferramenta {
    private String funcao;
    private String marca;
    private String modelo;

    public Ferramenta(String funcao, String marca, String modelo) {
        this.funcao = funcao;
        this.marca = marca;
        this.modelo = modelo;
    }

    public void consertar() {
        System.out.println("A ferramenta do modelo " + modelo + " está Consertando.");
    }

    public void Identificar() {
        System.out.println("A ferramenta da marca " + marca + " Ajudou a identificar o problema.");
    }

    public void reestaurar() {
        System.out.println("A ferramenta do modelo " + modelo + " Restaurou a peça.");
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
