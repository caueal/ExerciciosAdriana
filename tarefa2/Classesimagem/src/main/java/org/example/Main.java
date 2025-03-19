package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Carro");
            System.out.println("2. Cachorro");
            System.out.println("3. Peixe");
            System.out.println("4. Ferramenta");
            System.out.println("5. Instrumento");
            System.out.println("6. Impressora");
            System.out.println("7. Móvel");
            System.out.println("8. Pessoa");
            System.out.println("9. Moeda");
            System.out.println("10. Caneta");
            System.out.println("0. sair");
            System.out.println("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Classe Carro
                    Carro meuCarro = new Carro("Corolla", "2010", "Prata");
                    System.out.println("\nTestando métodos da classe Carro:");
                    meuCarro.andar();
                    meuCarro.frear();
                    meuCarro.buzinar();
                    break;

                case 2:
                    // Classe Cachorro
                    Cachorro meuCachorro = new Cachorro("Dobberman", "Grande", "Lisa");
                    System.out.println("\nTestando métodos da classe Cachorro:");
                    meuCachorro.andar();
                    meuCachorro.latir();
                    meuCachorro.rosnar();
                    break;

                case 3:
                    // Classe Peixe
                    Peixe meuPeixe = new Peixe("Bagre", "Grande", "Rio");
                    System.out.println("\nTestando métodos da classe Peixe:");
                    meuPeixe.nadar();
                    meuPeixe.nadar();
                    meuPeixe.nadar();
                    break;

                case 4:
                    // Classe Ferramenta
                    Ferramenta minhaFerramenta = new Ferramenta("Furar", "Milwake", "Furadeira");
                    System.out.println("\nTestando métodos da classe Ferramenta:");
                    minhaFerramenta.consertar();
                    minhaFerramenta.Identificar();
                    minhaFerramenta.reestaurar();
                    break;

                case 5:
                    // Classe Instrumento Musical
                    InstrumentoMusical meuInstrumento = new InstrumentoMusical("Baixo", "Tagima", "Madeira");
                    System.out.println("\nTestando métodos da classe Instrumento:");
                    meuInstrumento.tocar();
                    meuInstrumento.Afinar();
                    meuInstrumento.desgastar();
                    break;

                case 6:
                    // Classe Impressora
                    Impressora minhaImpressora = new Impressora("Elgin", "TM-T20", "Fiscal");
                    System.out.println("\nTestando métodos da classe Impressora:");
                    minhaImpressora.imprimir();
                    minhaImpressora.escanear();
                    minhaImpressora.pintar();
                    break;

                case 7:
                    // Classe Móvel
                    Movel meuMovel = new Movel("Armario", "Madeira", "Grande");
                    System.out.println("\nTestando métodos da classe Móvel:");
                    meuMovel.abrir();
                    meuMovel.enfeitar();
                    meuMovel.guardar();
                    break;

                case 8:
                    // Classe Pessoa
                    Pessoa pessoa = new Pessoa("Masc", "Joao", 40);
                    System.out.println("\nTestando métodos da classe Pessoa:");
                    pessoa.comer();
                    pessoa.dormir();
                    pessoa.trabalhar();
                    break;

                case 9:
                    // Classe Moeda
                    Moeda minhaMoeda = new Moeda(1, "Prata", 10);
                    System.out.println("\nTestando métodos da classe Moeda:");
                    minhaMoeda.trocar();
                    minhaMoeda.girar();
                    minhaMoeda.sortear();
                    break;

                case 10:
                    // Classe Caneta
                    Caneta minhaCaneta = new Caneta("Bic", "Azul", 3);
                    System.out.println("\nTestando métodos da classe Caneta:");
                    minhaCaneta.escrever();
                    minhaCaneta.abre();
                    minhaCaneta.gastar();
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}