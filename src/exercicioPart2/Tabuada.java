package exercicioPart2;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        for (int i = 0; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
