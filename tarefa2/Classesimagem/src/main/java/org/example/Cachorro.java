package org.example;

public class Cachorro {
    private String raca;
    private String tamanho;
    private String pelugem;


    public Cachorro(String raca, String tamanho, String pelugem) {
        this.raca = raca;
        this.tamanho = tamanho;
        this.pelugem = pelugem;
    }

    public void andar() {
        System.out.println("O cachorro da raça " + raca + " está andando.");
    }

    public void latir() {
        System.out.println("O cachorro da raça " + raca + " está latindo");
    }

    public void rosnar() {
        System.out.println("O cachorro da raça " + raca + " está rosnando");
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getPelugem() {
        return pelugem;
    }

    public void setPelugem(String pelugem) {
        this.pelugem = pelugem;
    }

}