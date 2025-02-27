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

### Teste de Mesa 1 exercicio

Dados:
- **Idade (anos):** 20  
- **Meses:** 5  
- **Dias:** 10  

| Passo | Entrada | Variáveis  | Cálculo Realizado | Valor Resultante |
|-------|-------------------|----------------------|------------------|----------------|
| 1     | 20 (anos)         | `ano = 20`          | -                | `ano = 20`     |
| 2     | 5 (meses)         | `mes = 5`           | -                | `mes = 5`      |
| 3     | 10 (dias)         | `dia = 10`          | -                | `dia = 10`     |
| 4     | -                 | `anoEx = 365 * ano` | `365 * 20`       | `anoEx = 7300` |
| 5     | -                 | `mesEx = 30 * mes`  | `30 * 5`         | `mesEx = 150`  |
| 6     | -                 | `total = anoEx + mesEx + dia` | `7300 + 150 + 10` | `total = 7460` |
| 7     | -                 | Exibe resultado     | `O seu total de dias de vida é: 7460` | - |

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

### Teste de Mesa 2 exercicio

Dados:
- **Total de eleitores:** 1000  
- **Votos brancos:** 150  
- **Votos nulos:** 100  
- **Votos válidos:** 750  

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 1000 (total)       | `total = 1000`      | -                | `total = 1000` |
| 2     | 150 (brancos)      | `branco = 150`      | -                | `branco = 150` |
| 3     | 100 (nulos)        | `nulo = 100`        | -                | `nulo = 100`   |
| 4     | 750 (válidos)      | `valido = 750`      | -                | `valido = 750` |
| 5     | -                 | -                    | `(branco / total) * 100 = (150 / 1000) * 100` | `15%` |
| 6     | -                 | -                    | `(nulo / total) * 100 = (100 / 1000) * 100` | `10%` |
| 7     | -                 | -                    | `(valido / total) * 100 = (750 / 1000) * 100` | `75%` |
| 8     | -                 | Exibe resultado      | `"Porcentagem de eleitores que votaram Branco: 15%"` | - |
| 9     | -                 | Exibe resultado      | `"Porcentagem de eleitores que votaram Nulo: 10%"` | - |
| 10    | -                 | Exibe resultado      | `"Porcentagem de eleitores que votaram Valido: 75%"` | - |


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

## Quinto Exercicio ## 

```
/* Atividade cinco */

import java.util.Scanner;

public class SalarioFuncionario{

     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         
         double comissao, salarioTotal, comissaoTotal;
         double valorUnit;
         
        System.out.println("Digite aqui o salario fixo: ");
        int salarioFixo = sc.nextInt();
        
        System.out.println("Digite aqui o valor total das vendas: ");
        int valorVenda = sc.nextInt();
        
        System.out.println("Digite aqui quantos carros o funcionario vendeu: ");
        int quantCarro = sc.nextInt();
        
    
        valorUnit = (valorVenda/quantCarro);
        
        comissao = (0.05 * valorVenda);
        comissaoTotal = comissao * quantCarro; 
        salarioTotal = salarioFixo + comissaoTotal;
        
        System.out.println("O valor unitario de cada carro vendido, foi de: " + valorUnit);
        
        System.out.println("O salario final, foi de: " + salarioTotal);
        
     }
}
```

## Sexto exercicio ##
```
/* Exercicio Seis */

import java.util.Scanner; 

public class ConvertorGraus {
    
    public static void main(String []args){
    double convertorFaren;   

    Scanner sc = new Scanner(System.in);

    System.out.println("Digita aqui a temperatura em Celsius: ");
    int tempCelsius = sc.nextInt();
    
    convertorFaren = (1.8*tempCelsius) + 32;
    
    System.out.println("Esse aqui e a temperatura convertida em Farenheit" + convertorFaren);

}
}
```

## Setimo exercicio ##

```
/* Exercicio Sete */

import java.util.Scanner; 

public class CondicaoDez{
    
    public static void main(String []args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digita aqui um valor: ");
    int valor = sc.nextInt();
    
    if (valor > 10) {
        System.out.println("Valor e maior que 10");
    } else if (valor < 10){
        System.out.println("Valor e menor que 10");
    }
}
}
```

## Oitavo exercicio ##

```
/* Exercicio Oito */

import java.util.Scanner; 

public class NegativoPositivo{
    
    public static void main(String []args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Digita aqui um valor: ");
    int valor = sc.nextInt();
    
    if (valor <= 0) {
        System.out.println("Valor e negativo");
    } else if (valor > 0){
        System.out.println("Valor e positivo");
    }
}
}
```

## Nono exercicio ##

```
/* Exercicio Nove */

import java.util.Scanner; 

public class Macas{
    
    public static void main(String []args){
        
    double valorUnit, precoFinal;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digita aqui quantas macas comprou");
    int quantia = sc.nextInt();
    
    if (quantia < 12) {
        System.out.println("O preco final foi de: " + (1.30*quantia));
    } else if (quantia >= 12){
               System.out.println("O preco final foi de: " + (1*quantia));
    }

}
}
```

## Décimo exercicio ##

```
/* Exercicio Dez */

import java.util.Scanner; 

public class MediaSimples{
    
    public static void main(String []args){
        
    double media;

    Scanner sc = new Scanner(System.in);

    System.out.println("Nota da 1a: ");
    int nota1 = sc.nextInt();
    
    System.out.println("Nota da 2a: ");
    int nota2 = sc.nextInt();
    
    media = (nota1 + nota2)/2;
    
    if (media >= 6) {
        System.out.println("O aluno passou, com a media de: " + media);
    } else if (media < 6){
               System.out.println("O aluno reprovou com a media de: " + media);
    }

}
}
```

## Décimo primeiro Exercicio ## 

```
/* Exercicio Onze */

import java.util.Scanner; 

public class votacao{
    
    public static void main(String []args){
        
    int idade;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite seu ano de nascimento");
    int nasc = sc.nextInt();
    
    idade = (2024 - nasc);
    
    if (idade >= 18) {
        System.out.println("Parabens voce pode votar");
    } else if (idade < 18){
       System.out.println("Voce nao pode votar");
    }

}
}
```

## Décimo Segundo Exercicio ## 

```
/* Exercicio Doze */

import java.util.Scanner; 

public class MaiorMenor{
    
    public static void main(String []args){
        
    int comparador;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o 1 valor");
    int valor1 = sc.nextInt();
    
    System.out.println("Digite o 2 valor");
    int valor2 = sc.nextInt();
  
    if (valor1 > valor2) {
       System.out.println("O primeiro valor: " + valor1 + ", E o maior");
    } else if (valor1 < valor2){
       System.out.println("O segundo valor: " + valor2 + ", E o maior");
    } else if (valor1 == valor2) {
       System.out.println("Ambos valores sao iguais");
     }

}
}
```

## Decimo terceiro exercicio ## 

```
/* Exercicio Treze */

import java.util.Scanner; 

public class Crescente{
    
    public static void main(String []args){
        
    int comparador;

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o 1 valor");
    int valor1 = sc.nextInt();
    
    System.out.println("Digite o 2 valor");
    int valor2 = sc.nextInt();
  
    if (valor1 > valor2) {
       System.out.println(valor2 + "," + valor1);
    } else if (valor1 < valor2){
       System.out.println(valor1 + "," +valor2);
    } else if (valor1 == valor2) {
       System.out.println("Ambos valores sao iguais");
     }

}
}
```

## Décimo Quarto Exercicio ##

```








