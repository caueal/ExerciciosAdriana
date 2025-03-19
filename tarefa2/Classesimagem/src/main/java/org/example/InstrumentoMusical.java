package org.example;

public class InstrumentoMusical {
    private String tipo;
    private String marca;
    private String pecas;

    public InstrumentoMusical(String tipo, String marca, String pecas) {
        this.tipo = tipo;
        this.marca = marca;
        this.pecas = pecas;
    }

    public void tocar() {
        System.out.println("O instrumento: " + tipo + " está tocando impecavelmente.");
    }

    public void Afinar() {
        System.out.println("O instrumento: " + tipo + " está afinando.");
    }

    public void desgastar() {
        System.out.println("O instrumento: " + tipo + " está desgastado.");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
