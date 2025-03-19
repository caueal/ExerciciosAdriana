package org.example;

public class Pessoa {
    private String sexo;
    private String nome;
    private int idade;

    public Pessoa(String sexo, String nome, int idade) {
        this.sexo = sexo;
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println("O individo chamado " + nome + " Está comendo");
    }

    public void dormir() {
        System.out.println("O individo chamado " + nome + " Está dormindo");
    }

    public void trabalhar() {
        System.out.println("O individo chamado " + nome + " Está trabalhando");
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}