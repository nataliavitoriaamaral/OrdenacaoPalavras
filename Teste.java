import java.util.Arrays;
import java.util.Comparator;

public class Teste {
    public static void main(String[] args) {
        String[] palavras = {"abacaxi", "maçã", "uvaia", "margarina", "abobrinha", "batom"};

        System.out.println("Lista original:");
        System.out.println(Arrays.toString(palavras));

        // Ordenação por ordem alfabética (default da classe String)
        Arrays.sort(palavras);
        System.out.println("Ordem alfabetica:");
        System.out.println(Arrays.toString(palavras));
        // Ordem por tamanho da palavra
        Arrays.sort(palavras, Comparator.comparingInt(String::length));
        System.out.println("Ordem por tamanho da palavra:");
        System.out.println(Arrays.toString(palavras));
        // Ordem pela ultima letra usando o comparator customizado
        Arrays.sort(palavras, new ComparadorUltimaLetra());
        System.out.println("Ordem pela ultima letra:");
        System.out.println(Arrays.toString(palavras));
    }
}