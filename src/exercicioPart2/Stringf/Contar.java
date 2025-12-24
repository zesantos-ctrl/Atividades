package exercicioPart2.Stringf;

import java.util.Scanner;

public class Contar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a uma frase: ");
        String frase = teclado.nextLine();

        String[] palavras = frase.trim().split(frase);
        System.out.println("Quantidade de palavras: " + palavras.length);

        teclado.close();
    }
}
