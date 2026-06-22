import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {
        String[] palavras = {"abacaxi", "maçã", "uvaia", "margarina", "abobrinha", "batom"};

        System.out.println("Lista original:");
        System.out.println(Arrays.toString(palavras));

        // Ordenação por ordem alfabética (default da classe String)
        Arrays.sort(palavras);
        System.out.println("Ordem alfabetica:");
        System.out.println(Arrays.toString(palavras));
    }
}