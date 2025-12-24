package exercicioPart2.Stringf;

import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = sc.nextLine().toLowerCase();

        int vogais = 0;
        int consoantes = 0;

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vogais++;
                } else {
                    consoantes++;
                }
            }
        }

        System.out.println("Vogais: " + vogais);
        System.out.println("Consoantes: " + consoantes);

        sc.close();
    }
}
