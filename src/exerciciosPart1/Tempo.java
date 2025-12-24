package exerciciosPart1;

import java.util.Scanner;

public class Tempo {
    public static double celsiusParaFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();

        double f = celsiusParaFahrenheit(c);

        System.out.println("Em Fahrenheit: " + f);
        sc.close();
    }

}
