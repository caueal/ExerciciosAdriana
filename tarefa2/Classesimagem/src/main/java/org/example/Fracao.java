package org.example;

public class Fracao {

    private int numerador;
    private int denominador;

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            System.out.println("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar(); 
    }

    private void simplificar() {
        int mdc = mdc(Math.abs(numerador), Math.abs(denominador));
        this.numerador /= mdc;
        this.denominador /= mdc;
    }

    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método para somar frações
    public Fracao somar(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador + this.denominador * outraFracao.numerador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para subtrair frações
    public Fracao subtrair(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.denominador - this.denominador * outraFracao.numerador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para multiplicar frações
    public Fracao multiplicar(Fracao outraFracao) {
        int novoNumerador = this.numerador * outraFracao.numerador;
        int novoDenominador = this.denominador * outraFracao.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para dividir frações
    public Fracao dividir(Fracao outraFracao) {
        if (outraFracao.numerador == 0) {
            system.out.println("Não é possível dividir por uma fração com numerador zero.");
        }
        int novoNumerador = this.numerador * outraFracao.denominador;
        int novoDenominador = this.denominador * outraFracao.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    // Método para exibir formatado
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    // Método para testar a classe
    public static void main(String[] args) {
        Fracao f1 = new Fracao(2, 5); // 2/5
        Fracao f2 = new Fracao(3, 7); // 3/7

        System.out.println("Soma: " + f1.somar(f2)); // 29/35
        System.out.println("Subtração: " + f1.subtrair(f2)); // -1/35
        System.out.println("Multiplicação: " + f1.multiplicar(f2)); // 6/35
        System.out.println("Divisão: " + f1.dividir(f2)); // 14/15
    }
}
