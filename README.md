# ExerciciosAdriana
Exercicos do teams referentes a LP


## Primeiro exercicio ##

``` 

/* Exercicio Um*/

import java.util.Scanner;

public class LeitorIdade{
     public static void main(String []args){
         
    int anoEx;
    int mesEx;
    int total;
    
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite aqui sua idade em anos:");
     int ano = sc.nextInt();
     
     System.out.println("Quantidade meses");
     int mes = sc.nextInt();
     
     System.out.println("Quantos dias:");
     int dia = sc.nextInt();
     
     anoEx = (365*ano);
     mesEx = (30*mes);
     total = (anoEx + mesEx + dia);
     
     System.out.println("O seu total de dias de vida e:" + total);
     }
}
```

## Segundo Exercicio ##

```
/* Exercicio Dois*/

import java.util.Scanner;

public class Eleitores{
     public static void main(String []args){
    
     Scanner sc = new Scanner(System.in);
 
     System.out.println("Escreva o numero total de eleitores:");
     double total = sc.nextInt();
     
     System.out.println("Quantidade de eleitores que votaram brancos:");
     double branco = sc.nextInt();
     
     System.out.println("Quantidade de eleitores que votaram nulo:");
     double nulo = sc.nextInt();
     
     System.out.println("Quantidade de eleitores que votaram valido:");
     double valido = sc.nextInt();
   
     
     System.out.println("Porcentagem de eleitores que votaram Branco:" + (branco/total * 100) + "%");
     System.out.println("Porcentagem de eleitores que votaram Nulo:" + (nulo/total * 100) + "%");
     System.out.println("Porcentagem de eleitores que votaram Valido:" + (valido/total * 100) + "%");

     }
}
```

## Terceiro Exercicio ##

```
/* Exercicio Tres*/

import java.util.Scanner;

public class Salario{
     public static void main(String []args){
         
    double total;
    
     Scanner sc = new Scanner(System.in);
 
     System.out.println("Escreva o salario do funcionario:");
     double salario = sc.nextInt();
     
     System.out.println("Escreva o reajuste salarial em porcentagem:");
     double reajuste = sc.nextInt();
     
     total = salario * (1 + (reajuste/100.0));
     
     System.out.println("O novo salario sera de: " + total);

     }
}
```

## Quarto Exercicio ##

```
/* Exercicio Quatro*/

import java.util.Scanner;

public class CustoCarro{
     public static void main(String []args){

     Scanner sc = new Scanner(System.in);
     
     double distribuidor, imposto, custoDis, custoImp, preco;
 
     System.out.println("Escreva o custo de fabrica do carro:");
     double custo = sc.nextInt();
     
     distribuidor = (28*custo/100);
     imposto = (45*custo/100);
     
     preco = custo + distribuidor + imposto;
     
     System.out.println("O custo final do carro sera de: " + preco);

     }
}
```
