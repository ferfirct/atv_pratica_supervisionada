
# Estruturas de Dados - Projeto de Filas, Pilhas e Merge

Este projeto contém implementações básicas de estruturas de dados como pilha, fila encadeada e fila com vetor, além de algoritmos demerge para combinar duas filas ordenadas.

Estrutura dos Arquivos

- No.java – Classe auxiliar usada nas estruturas encadeadas (pilha e fila).
- Fila.java – Implementação de fila com encadeamento.
- FilaVetor.java – Implementação de fila com vetor circular.
- Pilha.java – Implementação de uma pilha utilizando encadeamento.
- Merge.java – Função para fazer merge de duas filas encadeadas ordenadas.
- MergeVetor.java – Função para fazer merge de duas filas com vetor ordenadas.
- Main.java – Classe principal com exemplos de uso e testes.

## Como Executar

1. Compile todos os arquivos `.java`:

```bash
javac *.java
```

2. Execute a classe principal:

```bash
java Main
```

---
Exemplos Executados

A classe `Main` contém os seguintes exemplos prontos para execução:

## PILHA

```java
Pilha pilha = new Pilha();

pilha.insere("Elemento 1");
pilha.insere("Elemento 2");
pilha.insere("Elemento 3");

pilha.imprime(); // Mostra os elementos

pilha.remove();  // Remove o topo
pilha.imprime(); // Mostra após remoção
```

## FILA ENCADEADA

```java
Fila filaEx2 = new Fila();

filaEx2.insere("Elemento A");
filaEx2.insere("Elemento B");
filaEx2.insere("Elemento C");

filaEx2.imprime(); // Mostra os elementos

filaEx2.remove();  // Remove o primeiro
filaEx2.imprime(); // Mostra após remoção
```

## MERGE DE FILAS ENCADEADAS

```java
Fila filaA = new Fila();
Fila filaB = new Fila();

filaA.insere("12");
filaA.insere("35");
filaA.insere("52");
filaA.insere("64");

filaB.insere("05");
filaB.insere("15");
filaB.insere("23");
filaB.insere("55");
filaB.insere("75");

Fila filaC = Merge.mergeFilas(filaA, filaB);
filaC.imprime(); // Fila mesclada ordenada
```

## MERGE DE FILAS COM VETOR

```java
FilaVetor vetorA = new FilaVetor(10);
FilaVetor vetorB = new FilaVetor(10);

vetorA.insere("12");
vetorA.insere("35");
vetorA.insere("52");
vetorA.insere("64");

vetorB.insere("05");
vetorB.insere("15");
vetorB.insere("23");
vetorB.insere("55");
vetorB.insere("75");

FilaVetor vetorC = MergeVetor.mergeFilas(vetorA, vetorB, 20);
vetorC.imprime(); // Vetor mesclado ordenado
```

---

Projeto desenvolvido para fins de aprendizado e prática de estruturas de dados em Java.
