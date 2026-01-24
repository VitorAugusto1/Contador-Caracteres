package caracterescontador;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite a frase: ");
            String frase = scanner.nextLine();
            int contadorLetras = 0;
            int contadorEspaços = 0;
            int numeroDigitos = 0;
            int contadorEspecial = 0;
            for (int i = 0; i < frase.length(); i++) {
                char c = frase.charAt(i);
                if (Character.isLetter(c)) {
                    contadorLetras++;
                }
                if (Character.isDigit(c)) {
                    numeroDigitos++;
                }
                if (!Character.isLetterOrDigit(c) && c != ' ') {
                    contadorEspecial++;
                }
                if (c == ' ') {
                    contadorEspaços++;
                }
            }   
            String mensagem = "A frase tem " + contadorLetras + " letras";
            if (numeroDigitos > 0) {
                mensagem += ", " + numeroDigitos + " dígitos";
            }
            if (contadorEspecial > 0) {
                mensagem += ", " + contadorEspecial + " caracteres especiais";
            }
            if (contadorEspaços > 0 ) {
                mensagem += " e " + contadorEspaços + " espaços";
            }
            System.out.println(mensagem);
        }
    }
}