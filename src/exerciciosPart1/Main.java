package exerciciosPart1;

import java.util.Scanner;

public class Main {
    public static double aplicarDesconto(double preco, double descontoPercentual) {
        return preco - (preco * (descontoPercentual / 100));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço original: ");
        double preco = sc.nextDouble();

        System.out.print("Desconto (%): ");
        double desconto = sc.nextDouble();

        double precoFinal = aplicarDesconto(preco, desconto);

        System.out.println("Preço final com desconto: " + precoFinal);
        sc.close();
    }
}
