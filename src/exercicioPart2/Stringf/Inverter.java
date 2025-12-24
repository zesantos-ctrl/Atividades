package exercicioPart2.Stringf;

import java.util.Scanner;

public class Inverter {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String texto = teclado.nextLine();

        String invertida = new StringBuilder(texto).reverse().toString();

        System.out.println("String invertida: " + invertida);

        teclado.close();
    }
}
