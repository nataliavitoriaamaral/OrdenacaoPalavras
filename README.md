# Exercício de Ordenação 

Este repositório contém a resolução de um exercício prático de Projetos Orientados a Objetos focado na ordenação de arrays e no uso da interface Comparator nativa do Java.

## O que o projeto faz
A aplicação demonstra diferentes formas de ordenar um array de strings usando o método Arrays.sort():
- **Ordem Alfabética:** Utiliza a ordenação natural (default) da classe String.
- **Ordem por Tamanho:** Ordena as palavras com base na quantidade de caracteres.
- **Ordem pela Última Letra:** Utiliza um Comparator customizado (ComparadorUltimaLetra) para analisar e ordenar especificamente pelo último caractere de cada palavra.

## Tecnologias
- Java

## Como rodar localmente
1. Clone este repositório ou baixe os arquivos.
2. Pelo terminal, navegue até a pasta onde os arquivos foram salvos.
3. Compile o código:
   ```bash
   javac Aplicacao.java ComparadorUltimaLetra.java
   ```
4. Execute a classe principal:
   ```bash
   java Aplicacao
   ```