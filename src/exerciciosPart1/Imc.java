package exerciciosPart1;

import java.util.Scanner;

public class Imc {
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Peso: ");
        double peso = teclado.nextDouble();

        System.out.print("Altura: ");
        double altura = teclado.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.println("Seu IMC é: " + imc);
        teclado.close();
    }
}
