package caracterescontador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a frase: ");
            String frase = scanner.nextLine();
            int contador = 0;
            int numeroDigitos = 0;
            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);
                if (c != ' ') {
                    contador++;
                }
                if (Character.isDigit(c)) {
                    numeroDigitos++;
                }
            }
            String mensagem = "A frase tem " + contador + " caracteres (sem contar espaços)";
            if (numeroDigitos > 0) {
                mensagem += " e " + numeroDigitos + " dígitos.";
            }
            System.out.println(mensagem);
        }
    }
}