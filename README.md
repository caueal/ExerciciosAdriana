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
     double salario = sc.nextDouble();
     
     System.out.println("Escreva o reajuste salarial em porcentagem:");
     double reajuste = sc.nextDouble();
     
     total = salario * (1 + (reajuste/100.0));
     
     System.out.println("O novo salario sera de: " + total);

     }
}
```

### Teste de Mesa tereceiro exercicio

Dados:
- **Salário:** 2000  
- **Reajuste:** 10%  

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 2000 (salário)     | `salario = 2000`    | -                | `salario = 2000` |
| 2     | 10 (reajuste)      | `reajuste = 10`     | -                | `reajuste = 10`  |
| 3     | -                 | `total = salario * (1 + (reajuste / 100.0))` | `2000 * (1 + (10 / 100.0))` | `total = 2200.0` |
| 4     | -                 | Exibe resultado      | `"O novo salario sera de: 2200.0"` | - |


## Quarto Exercicio ##

```
/* Exercicio Quatro*/

import java.util.Scanner;

public class CustoCarro{
     public static void main(String []args){

     Scanner sc = new Scanner(System.in);
     
     double distribuidor, imposto, custoDis, custoImp, preco;
 
     System.out.println("Escreva o custo de fabrica do carro:");
     double custo = sc.nextDouble();
     
     distribuidor = (28*custo/100);
     imposto = (45*custo/100);
     
     preco = custo + distribuidor + imposto;
     
     System.out.println("O custo final do carro sera de: " + preco);

     }
}
```

### Teste de Mesa quarto exercicio

Dados:
- **Custo de fábrica do carro:** 50.000  

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 50000 (custo)      | `custo = 50000`     | -                | `custo = 50000` |
| 2     | -                 | `distribuidor = 28 * custo / 100` | `28 * 50000 / 100` | `distribuidor = 14000` |
| 3     | -                 | `imposto = 45 * custo / 100` | `45 * 50000 / 100` | `imposto = 22500` |
| 4     | -                 | `preco = custo + distribuidor + imposto` | `50000 + 14000 + 22500` | `preco = 86500` |
| 5     | -                 | Exibe resultado      | `"O custo final do carro sera de: 86500"` | - |


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

### Teste de Mesa quinto exercicio ###

Dados:
- **Salário fixo:** 2000  
- **Valor total das vendas:** 100.000  
- **Quantidade de carros vendidos:** 5  

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 2000 (salário fixo) | `salarioFixo = 2000` | -                | `salarioFixo = 2000` |
| 2     | 100000 (valor total das vendas) | `valorVenda = 100000` | -                | `valorVenda = 100000` |
| 3     | 5 (quantidade de carros vendidos) | `quantCarro = 5` | -                | `quantCarro = 5` |
| 4     | -                 | `valorUnit = valorVenda / quantCarro` | `100000 / 5` | `valorUnit = 20000` |
| 5     | -                 | `comissao = 0.05 * valorVenda` | `0.05 * 100000` | `comissao = 5000` |
| 6     | -                 | `comissaoTotal = comissao * quantCarro` | `5000 * 5` | `comissaoTotal = 25000` |
| 7     | -                 | `salarioTotal = salarioFixo + comissaoTotal` | `2000 + 25000` | `salarioTotal = 27000` |
| 8     | -                 | Exibe resultado      | `"O valor unitario de cada carro vendido, foi de: 20000"` | - |
| 9     | -                 | Exibe resultado      | `"O salario final, foi de: 27000"` | - |


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

### Teste de Mesa Sexto exercicio

Dados:
- **Temperatura em Celsius:** 25  

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 25 (temperatura em Celsius) | `tempCelsius = 25` | -                | `tempCelsius = 25` |
| 2     | -                 | `convertorFaren = (1.8 * tempCelsius) + 32` | `(1.8 * 25) + 32` | `convertorFaren = 77.0` |
| 3     | -                 | Exibe resultado      | `"Esse aqui e a temperatura convertida em Farenheit 77.0"` | - |




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
    } else {
        System.out.println("Valor e igual a 10");
}
}
}
```

### Teste de Mesa Setimo exercicio

Dados:
1 **Entrada: 15**  
2 **Entrada: 5**  
3 **Entrada: 10**  

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 15                | `valor = 15`        | -                | `valor = 15` |
| 2     | -                 | Verifica condição `if (valor > 10)` | `15 > 10` (Verdadeiro) | - |
| 3     | -                 | Exibe resultado      | `"Valor e maior que 10"` | - |

---

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 5                 | `valor = 5`         | -                | `valor = 5` |
| 2     | -                 | Verifica condição `if (valor > 10)` | `5 > 10` (Falso) | - |
| 3     | -                 | Verifica `else if (valor < 10)` | `5 < 10` (Verdadeiro) | - |
| 4     | -                 | Exibe resultado      | `"Valor e menor que 10"` | - |

---

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 10                | `valor = 10`        | -                | `valor = 10` |
| 2     | -                 | Verifica condição `if (valor > 10)` | `10 > 10` (Falso) | - |
| 3     | -                 | Verifica `else if (valor < 10)` | `10 < 10` (Falso) | - |
| 4     | -                 | Nenhuma condição foi satisfeita | `"Valor e igual a 10"` | - |


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

### Teste de Mesa oitavo exercicio

Dados:
1 **Entrada: -5**  
2 **Entrada: 10**  

---

#### Caso 1: Entrada = -5

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | -5                | `valor = -5`         | -                | `valor = -5` |
| 2     | -                 | Verifica condição `if (valor <= 0)` | `-5 <= 0` (Verdadeiro) | - |
| 3     | -                 | Exibe resultado      | `"Valor e negativo"` | - |

---

#### Caso 2: Entrada = 10

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 10                | `valor = 10`         | -                | `valor = 10` |
| 2     | -                 | Verifica condição `if (valor <= 0)` | `10 <= 0` (Falso) | - |
| 3     | -                 | Verifica `else if (valor > 0)` | `10 > 0` (Verdadeiro) | - |
| 4     | -                 | Exibe resultado      | `"Valor e positivo"` | - |

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

### Teste de Mesa nono exercicio

Dados:
1 **Entrada: 10 maçãs**  
2 **Entrada: 12 maçãs**  
3 **Entrada: 20 maçãs**  

---

#### Caso 1: Entrada = 10 maçãs

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 10                | `quantia = 10`       | -                | `quantia = 10` |
| 2     | -                 | Verifica condição `if (quantia < 12)` | `10 < 12` (Verdadeiro) | - |
| 3     | -                 | Calcula preço final  | `1.30 * 10` | `precoFinal = 13.0` |
| 4     | -                 | Exibe resultado      | `"O preco final foi de: 13.0"` | - |

---

#### Caso 2: Entrada = 12 maçãs

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 12                | `quantia = 12`       | -                | `quantia = 12` |
| 2     | -                 | Verifica condição `if (quantia < 12)` | `12 < 12` (Falso) | - |
| 3     | -                 | Verifica `else if (quantia >= 12)` | `12 >= 12` (Verdadeiro) | - |
| 4     | -                 | Calcula preço final  | `1.0 * 12` | `precoFinal = 12.0` |
| 5     | -                 | Exibe resultado      | `"O preco final foi de: 12.0"` | - |

---

#### Caso 3: Entrada = 20 maçãs

| Passo | Entrada  | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 20                | `quantia = 20`       | -                | `quantia = 20` |
| 2     | -                 | Verifica condição `if (quantia < 12)` | `20 < 12` (Falso) | - |
| 3     | -                 | Verifica `else if (quantia >= 12)` | `20 >= 12` (Verdadeiro) | - |
| 4     | -                 | Calcula preço final  | `1.0 * 20` | `precoFinal = 20.0` |
| 5     | -                 | Exibe resultado      | `"O preco final foi de: 20.0"` | - |


## Décimo exercicio ##

```
/* Exercicio Dez */

import java.util.Scanner; 

public class MediaSimples{
    
    public static void main(String []args){
        
    double media;

    Scanner sc = new Scanner(System.in);

    System.out.println("Nota da 1a: ");
    double nota1 = sc.nextDouble();
    
    System.out.println("Nota da 2a: ");
    double nota2 = sc.nextDouble();
    
    media = (nota1 + nota2)/2;
    
    if (media >= 6) {
        System.out.println("O aluno passou, com a media de: " + media);
    } else if (media < 6){
               System.out.println("O aluno reprovou com a media de: " + media);
    }

}
}
```
### Teste de Mesa décimo exercicio

Dados:
1 **Entrada: Nota 1 = 8, Nota 2 = 6**  
2 **Entrada: Nota 1 = 5, Nota 2 = 4**  
3 **Entrada: Nota 1 = 6, Nota 2 = 6**  

---

#### Caso 1: Nota 1 = 8, Nota 2 = 6

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 8                 | `nota1 = 8`          | -                | `nota1 = 8` |
| 2     | 6                 | `nota2 = 6`          | -                | `nota2 = 6` |
| 3     | -                 | Calcula média        | `(8 + 6) / 2` | `media = 7.0` |
| 4     | -                 | Verifica condição `if (media >= 6)` | `7.0 >= 6` (Verdadeiro) | - |
| 5     | -                 | Exibe resultado      | `"O aluno passou, com a media de: 7.0"` | - |

---

#### Caso 2: Nota 1 = 5, Nota 2 = 4

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 5                 | `nota1 = 5`          | -                | `nota1 = 5` |
| 2     | 4                 | `nota2 = 4`          | -                | `nota2 = 4` |
| 3     | -                 | Calcula média        | `(5 + 4) / 2` | `media = 4.5` |
| 4     | -                 | Verifica condição `if (media >= 6)` | `4.5 >= 6` (Falso) | - |
| 5     | -                 | Verifica `else if (media < 6)` | `4.5 < 6` (Verdadeiro) | - |
| 6     | -                 | Exibe resultado      | `"O aluno reprovou com a media de: 4.5"` | - |

---

#### Caso 3: Nota 1 = 6, Nota 2 = 6

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 6                 | `nota1 = 6`          | -                | `nota1 = 6` |
| 2     | 6                 | `nota2 = 6`          | -                | `nota2 = 6` |
| 3     | -                 | Calcula média        | `(6 + 6) / 2` | `media = 6.0` |
| 4     | -                 | Verifica condição `if (media >= 6)` | `6.0 >= 6` (Verdadeiro) | - |
| 5     | -                 | Exibe resultado      | `"O aluno passou, com a media de: 6.0"` | - |



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

### Teste de Mesa decimo primeiro exercicio

Dados:
1 **Entrada: Ano de nascimento = 2000**  
2 **Entrada: Ano de nascimento = 2010**  
3 **Entrada: Ano de nascimento = 2006**  

---

#### Caso 1: Ano de nascimento = 2000

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 2000              | `nasc = 2000`       | -                | `nasc = 2000` |
| 2     | -                 | Calcula idade       | `2024 - 2000` | `idade = 24` |
| 3     | -                 | Verifica condição `if (idade >= 18)` | `24 >= 18` (Verdadeiro) | - |
| 4     | -                 | Exibe resultado      | `"Parabéns, você pode votar"` | - |

---

#### Caso 2: Ano de nascimento = 2010

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 2010              | `nasc = 2010`       | -                | `nasc = 2010` |
| 2     | -                 | Calcula idade       | `2024 - 2010` | `idade = 14` |
| 3     | -                 | Verifica condição `if (idade >= 18)` | `14 >= 18` (Falso) | - |
| 4     | -                 | Verifica `else if (idade < 18)` | `14 < 18` (Verdadeiro) | - |
| 5     | -                 | Exibe resultado      | `"Você não pode votar"` | - |

---

#### Caso 3: Ano de nascimento = 2006

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 2006              | `nasc = 2006`       | -                | `nasc = 2006` |
| 2     | -                 | Calcula idade       | `2024 - 2006` | `idade = 18` |
| 3     | -                 | Verifica condição `if (idade >= 18)` | `18 >= 18` (Verdadeiro) | - |
| 4     | -                 | Exibe resultado      | `"Parabéns, você pode votar"` | - |



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

### Teste de Mesa decimo segundo exercicio

Dados:
1 **Entrada: valor1 = 10, valor2 = 20**  
2 **Entrada: valor1 = 50, valor2 = 30**  
3 **Entrada: valor1 = 15, valor2 = 15**  

---

#### Caso 1: `valor1 = 10`, `valor2 = 20`

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 10                | `valor1 = 10`       | -                | `valor1 = 10` |
| 2     | 20                | `valor2 = 20`       | -                | `valor2 = 20` |
| 3     | -                 | Verifica `if (valor1 > valor2)` | `10 > 20` (Falso) | - |
| 4     | -                 | Verifica `else if (valor1 < valor2)` | `10 < 20` (Verdadeiro) | - |
| 5     | -                 | Exibe resultado      | `"O segundo valor: 20, é o maior"` | - |

---

#### Caso 2: `valor1 = 50`, `valor2 = 30`

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 50                | `valor1 = 50`       | -                | `valor1 = 50` |
| 2     | 30                | `valor2 = 30`       | -                | `valor2 = 30` |
| 3     | -                 | Verifica `if (valor1 > valor2)` | `50 > 30` (Verdadeiro) | - |
| 4     | -                 | Exibe resultado      | `"O primeiro valor: 50, é o maior"` | - |

---

#### Caso 3: `valor1 = 15`, `valor2 = 15`

| Passo | Entrada | Variáveis | Cálculo Realizado | Valor Resultante |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 15                | `valor1 = 15`       | -                | `valor1 = 15` |
| 2     | 15                | `valor2 = 15`       | -                | `valor2 = 15` |
| 3     | -                 | Verifica `if (valor1 > valor2)` | `15 > 15` (Falso) | - |
| 4     | -                 | Verifica `else if (valor1 < valor2)` | `15 < 15` (Falso) | - |
| 5     | -                 | Verifica `else if (valor1 == valor2)` | `15 == 15` (Verdadeiro) | - |
| 6     | -                 | Exibe resultado      | `"Ambos valores são iguais"` | - |


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

### Teste de Mesa Decimo terceiro exercicio

Dados:
1 **Entrada: valor1 = 10, valor2 = 20**  
2 **Entrada: valor1 = 50, valor2 = 30**  
3 **Entrada: valor1 = 15, valor2 = 15**  

---

#### Caso 1: `valor1 = 10`, `valor2 = 20`

| Passo | Entrada | Variáveis | Cálculo Realizado | Saída |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 10                | `valor1 = 10`       | -                | - |
| 2     | 20                | `valor2 = 20`       | -                | - |
| 3     | -                 | Verifica `if (valor1 > valor2)` | `10 > 20` (Falso) | - |
| 4     | -                 | Verifica `else if (valor1 < valor2)` | `10 < 20` (Verdadeiro) | - |
| 5     | -                 | Exibe resultado      | `"10,20"` | `10,20` |

---

#### Caso 2: `valor1 = 50`, `valor2 = 30`

| Passo | Entrada | Variáveis | Cálculo Realizado | Saída |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 50                | `valor1 = 50`       | -                | - |
| 2     | 30                | `valor2 = 30`       | -                | - |
| 3     | -                 | Verifica `if (valor1 > valor2)` | `50 > 30` (Verdadeiro) | - |
| 4     | -                 | Exibe resultado      | `"30,50"` | `30,50` |

---

#### Caso 3: `valor1 = 15`, `valor2 = 15`

| Passo | Entrada | Variáveis | Cálculo Realizado | Saída |
|-------|--------------------|----------------------|------------------|----------------|
| 1     | 15                | `valor1 = 15`       | -                | - |
| 2     | 15                | `valor2 = 15`       | -                | - |
| 3     | -                 | Verifica `if (valor1 > valor2)` | `15 > 15` (Falso) | - |
| 4     | -                 | Verifica `else if (valor1 < valor2)` | `15 < 15` (Falso) | - |
| 5     | -                 | Verifica `else if (valor1 == valor2)` | `15 == 15` (Verdadeiro) | - |
| 6     | -                 | Exibe resultado      | `"Ambos valores são iguais"` | `"Ambos valores são iguais"` |


## Décimo Quarto Exercicio ##

```
/*Exercicio QUatorze*/

import java.util.Scanner;

public class DuracaoXadrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo:");
        int horaInicio = sc.nextInt();

        System.out.println("Digite a hora de término do jogo:");
        int horaFim = sc.nextInt();

        int duracao;
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("O jogo durou " + duracao);
    }
}
```

### Teste de Mesa decimo quarto

#### Hora de Início = 10, Hora de Fim = 15

| Passo | Entrada | Variáveis | Cálculo Realizado       | Saída    |
|-------|--------------------|----------------------------|------------------------|----------|
| 1     | 10                 | `horaInicio = 10`          | -                      | -        |
| 2     | 15                 | `horaFim = 15`             | -                      | -        |
| 3     | -                  | Verifica `if (horaInicio < horaFim)` | `10 < 15` (Verdadeiro) | -        |
| 4     | -                  | Calcula `horaFim - horaInicio` | `15 - 10` = 5            | `5 horas`|

---

#### Hora de Início = 22, Hora de Fim = 2

| Passo | Entrada | Variáveis | Cálculo Realizado       | Saída    |
|-------|--------------------|----------------------------|------------------------|----------|
| 1     | 22                 | `horaInicio = 22`          | -                      | -        |
| 2     | 2                  | `horaFim = 2`              | -                      | -        |
| 3     | -                  | Verifica `if (horaInicio < horaFim)` | `22 < 2` (Falso)        | -        |
| 4     | -                  | Executa `else`             | `(24 - 22) + 2` = 4      | `4 horas`|

## Décimo Quinto exercicio

```
/*Exercicio quinze*/

import java.util.Scanner;

public class SalarioComHoraExtra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero de horas trabalhadas no mes:");
        int horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor do salario por hora:");
        double salarioPorHora = sc.nextDouble();

        int horasNormais = 40 * 4; // 40 horas por semana * 4 semanas
        double salarioBase = horasNormais * salarioPorHora;

        double salarioTotal;
        if (horasTrabalhadas > horasNormais) {
            int horasExtras = horasTrabalhadas - horasNormais;
            double valorHoraExtra = salarioPorHora * 1.5; // 50% de acréscimo
            salarioTotal = salarioBase + (horasExtras * valorHoraExtra);
        } else {
            salarioTotal = salarioBase;
        }

        System.out.println("O salario total do funcionário e: RS " + salarioTotal);
    }
}
```

### Teste de Mesa 15

#### Caso 1: Hora Normal
**Dados:**
- Horas trabalhadas: 160 horas
- Salário por hora: R$ 10,00

| Passo | Entrada  | Variáveis | Cálculo Realizado                  | Saída                 |
|-------|----------------------------|---------------------------------|------------------------------------|-----------------------|
| 1     | 160 horas                  | `horasTrabalhadas = 160`        | -                                  | -                     |
| 2     | R$ 10,00                   | `salarioPorHora = 10`           | -                                  | -                     |
| 3     | -                          | `horasNormais = 160`            | `40 horas/semana * 4 semanas`      | -                     |
| 4     | -                          | `salarioBase = 160 * 10`        | `1600,00`                          | `Salário Base = R$ 1600,00`  |
| 5     | -                          | Verifica `horasTrabalhadas > horasNormais` | `160 > 160` (Falso)               | -                     |
| 6     | -                          | `salarioTotal = salarioBase`    | `salarioTotal = 1600,00`           | `Salário Total = R$ 1600,00` |

---

#### Caso 2: Hora Extra
**Dados:**
- Horas trabalhadas: 180 horas (20 horas extras)
- Salário por hora: R$ 10,00

| Passo | Entrada | Variáveis | Cálculo Realizado                  | Saída                 |
|-------|----------------------------|---------------------------------|------------------------------------|-----------------------|
| 1     | 180 horas                  | `horasTrabalhadas = 180`        | -                                  | -                     |
| 2     | R$ 10,00                   | `salarioPorHora = 10`           | -                                  | -                     |
| 3     | -                          | `horasNormais = 160`            | `40 horas/semana * 4 semanas`      | -                     |
| 4     | -                          | `salarioBase = 160 * 10`        | `1600,00`                          | `Salário Base = R$ 1600,00`  |
| 5     | -                          | Verifica `horasTrabalhadas > horasNormais` | `180 > 160` (Verdadeiro) | -                     |
| 6     | -                          | `horasExtras = 180 - 160`       | `horasExtras = 20`                 | -                     |
| 7     | -                          | `valorHoraExtra = 10 * 1.5`     | `valorHoraExtra = 15`              | -                     |
| 8     | -                          | `salarioTotal = salarioBase + (horasExtras * valorHoraExtra)` | `salarioTotal = 1600 + (20 * 15)` | `Salário Total = R$ 1900,00` |

## Décimo sexto exercicio 

```
/*Exercicio 16*/

public class DespesasTrimestrais {
    public static void main(String[] args) {

        double janeiro = 15000; 
        double fevereiro = 23000; 
        double marco = 17000;

        double gastoTotal = janeiro + fevereiro + marco;

        double mediaMensal = gastoTotal / 3;

        System.out.println("Gasto total no primeiro trimestre: R$ " + gastoTotal);
        System.out.println("Média mensal de gastos: R$ " + mediaMensal);
    }
}
```

### Teste de Mesa 16

#### Caso 1: Despesas de Janeiro, Fevereiro e Março
**Dados:**
- Janeiro: R$ 15.000,00
- Fevereiro: R$ 23.000,00
- Março: R$ 17.000,00

| Passo | Entrada do Usuário         | Variáveis Modificadas           | Cálculo Realizado                  | Saída                 |
|-------|----------------------------|---------------------------------|------------------------------------|-----------------------|
| 1     | Janeiro = 15000            | `janeiro = 15000`               | -                                  | -                     |
| 2     | Fevereiro = 23000          | `fevereiro = 23000`             | -                                  | -                     |
| 3     | Março = 17000              | `marco = 17000`                 | -                                  | -                     |
| 4     | -                          | `gastoTotal = janeiro + fevereiro + marco` | `gastoTotal = 15000 + 23000 + 17000` | `gastoTotal = 55000`  |
| 5     | -                          | `mediaMensal = gastoTotal / 3`  | `mediaMensal = 55000 / 3`          | `mediaMensal = 18333.33` |
| 6     | -                          | -                               | -                                  | `Gasto total = R$ 55.000,00`  |
| 7     | -                          | -                               | -                                  | `Média mensal = R$ 18.333,33` |

## Décimo sétimo exercicio 

N/D














