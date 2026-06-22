import java.util.Comparator;

public class ComparadorUltimaLetra implements Comparator<String> {
    
    @Override
    public int compare(String p1, String p2) {
        // Pega o ultimo caractere de cada string
        char ultimaLetraP1 = p1.charAt(p1.length() - 1);
        char ultimaLetraP2 = p2.charAt(p2.length() - 1);
        
        return Character.compare(ultimaLetraP1, ultimaLetraP2);
    }
}

