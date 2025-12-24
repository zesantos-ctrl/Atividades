package exerciciosPart1;
import java.util.Scanner;

public class Conversor {
    public static double metrosParaCm(double m) {
        return m * 100;
    }

    public static double cmParaMetros(double cm) {
        return cm / 100;
    }

    public static double kmParaMetros(double km) {
        return km * 1000;
    }

    public static double metrosParaKm(double m) {
        return m / 1000;
    }

    public static double metrosParaMilhas(double m) {
        return m / 1609.34;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um valor em metros: ");
        double m = teclado.nextDouble();

        System.out.println("Metros para Cm: " + metrosParaCm(m));
        System.out.println("Metros para Km: " + metrosParaKm(m));
        System.out.println("Metros para Milhas: " + metrosParaMilhas(m));

        System.out.print("Digite um valor em centímetros: ");
        double cm = teclado.nextDouble();
        System.out.println("Cm para Metros: " + cmParaMetros(cm));

        System.out.print("Digite um valor em Km: ");
        double km = teclado.nextDouble();
        System.out.println("Km para Metros: " + kmParaMetros(km));

        teclado.close();
    }
}
