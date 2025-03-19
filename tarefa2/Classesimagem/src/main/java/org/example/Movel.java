package org.example;

public class Movel {
    private String tipoMovel;
    private String material;
    private String tamanho;

    public Movel(String tipoMovel, String material, String tamanho) {
        this.tipoMovel = tipoMovel;
        this.material = material;
        this.tamanho = tamanho;
    }

    public void guardar() {
        System.out.println("O movel: " + tipoMovel + " está guardando utensilios");
    }

    public void enfeitar() {
        System.out.println("O movel feito de: " + material + "enfeitando o ambiente muito bem");
    }

    public void abrir() {
        System.out.println("O movel: " + tipoMovel + " abriu");
    }

    public String getTipoMovel() {
        return tipoMovel;
    }

    public void setTipoMovel(String tipoMovel) {
        this.tipoMovel = tipoMovel;
    }
}
