package exercicioPart2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        String user = "admin";
        int senha = 1234;

        int tentativas = 0;
        int limiteTentativas = 3;

        while (tentativas < limiteTentativas) {
            System.out.println("Digite o usuario: ");
            String usuario = teclado.nextLine();

            System.out.println("Digite sua senha: ");
            String senhas = teclado.nextLine();

            if (usuario.equals(user) && senhas.equals(senha)) {
                System.out.println("Login realizado");
                break;
            } else {
                System.out.println("Login não foi realizado :(");
                tentativas++;
            }

            if (tentativas > limiteTentativas) {
                System.out.println("Limites de tentativas atingido");
            }
        }
        teclado.close();
    }
}
