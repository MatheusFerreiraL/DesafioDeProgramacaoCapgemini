# Desafio de Programação Capgemini 2022

Etapa de desafio de programação no processo seletivo da Academia Capgemini.

## Desafios

---------

### Desafio 01:

A mediana de uma lista de números é basicamente o elemento que se encontra no meio da lista após a ordenação. Dada uma lista de números com um número ímpar de elementos, desenvolva um algoritmo que encontre a mediana.

**Exemplo:**

Entrada:

 `arr = [9, 2, 1, 4, 6]`

Saída: 

`4`

### Desafio 02:

Dado um vetor de inteiros n e um inteiro qualquer x. Construa um algoritmo que determine o número de elementos pares do vetor que tem uma diferença igual ao valor de x.

**Exemplo:**

Entrada:

`n = [1, 5, 3, 4, 2]`

Saída:

`3`

**Explicação:**

Existem 3 pares de inteiros no vetor com uma diferença de 2: [5, 3], [4, 2] e [3, 1].

### Desafio 03:

Um texto precisa ser encriptado usando o seguinte esquema. Primeiro, os espaços são removidos do texto. Então, os caracteres são escritos em um grid, no qual as linhas e colunas tem as seguintes regras:

![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)<=linha<=coluna<=![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7BT%7D)

- Considere T, como o tamanho do texto.
- Se certifique de que linhas x colunas >= ![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=T).
- Se múltiplos grids satisfazem as condições, escolha aquele com a menor área.

Escreva um algoritmo que ao receber uma string s, mostre a mensagem encriptada de acordo com as regras descritas.

**Exemplos:**

**Exemplo  01:**

Entrada:

`s = tenha um bom dia`

Saída:

`taoa eum nmd hbi`

Explicação:

Depois de remover os espaços, a string tem 13 caracteres. ![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7B13%7D) está entre 3 e 4, então a string é rescrita na forma de um grid com 4 linhas e 4 colunas:

```
tenh  

aumb  

omdi  

a
```

 O resultado é obtido ao mostrar os caracteres de cada coluna, com um espaço entre as colunas de texto. A mensagem encriptada é obtida ao mostrar os caracteres de cada linha com um espaço entre as colunas.

**Exemplo 02:**

Entrada:

`s = ola mundo`

Saída:

```
omd luo an
```

Explicação:

 Depois de remover os espaços a string tem 8 caracteres. ![](https://www.google.com/chart?cht=tx&chf=bg,s,FFFFFF00&chco=000000&chl=%5Csqrt%7B8%7D) está entre 2 e 3, então a string é reescrita na forma de um grid com 3 linhas e 3 colunas:

```
ola

mun

do
```

## Tecnologias

___

<img src= "https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white">

<img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white">

## Para acessar:

___

- É necessário ter o kit JDK instalado na máquina;

- Necessário acesso a uma  IDE de sua preferência 

- Fazer um clone do projeto:

```

```

- Acessar o a pasta `src` e executar as questões.

## Testes Unitários

---

Acesso aos testes nos links abaixo (recomendado o acesso via computador/notebook para melhor visualização):

**Questão 01:** Teste unitário com resultado positivo e outro com falha. <a href="https://drive.google.com/file/d/1W-RMyq5j5KYp8wPO5OVPpZsNTOwjOHVB/view?usp=sharing">Link aqui!</a>  

**Questão 02:** Teste unitário com resultado positivo. <a href="https://drive.google.com/file/d/1tsARfUAec9MXDGosuDWwe3xovXLun9NX/view?usp=sharing">Link aqui!</a>  

**Questão 03:** Teste unitário com resultado positivo. <a href="https://drive.google.com/file/d/1NIMJJ8SsJ986ohG2WCFmeHM-pQ13lED-/view?usp=sharing">Link aqui!</a>  

## Autor

---

Matheus Ferreira Leandro

<a href="https://linkedin.com/in/matheusferreiraleandro/" alt="Linkedin">
  <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" /></a>


