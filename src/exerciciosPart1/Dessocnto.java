package exerciciosPart1;

import java.util.Scanner;

public class Dessocnto {
    public static void main(String[] arVergs) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor para o desconto: ");
        double preco = teclado.nextDouble();

        System.out.println("Digite o valor do desconto: ");
        double des = teclado.nextDouble();

        calculoDesc(preco, des);
    }

    public static void calculoDesc(double preco, double des) {
        double valorDes = (des * 100.0) * preco;
        double valorTotal = preco - des;
        System.out.println("Valor descontado: " + valorTotal);
    }
}
