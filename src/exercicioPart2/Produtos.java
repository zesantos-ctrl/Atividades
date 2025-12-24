package exercicioPart2;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Teclado", 120.0, 20));
        produtos.add(new Produto("Monitor", 890.0, 10));
        produtos.add(new Produto("Mouse", 70.0, 40));

        int opcao;

        do {
            System.out.println("\n=== SISTEMA DE PRODUTOS ====");
            System.out.println("1. Listar produtos");
            System.out.println("2. Adiciionar estoque");
            System.out.println("3. Vender produtos");
            System.out.println("4. Aplicar desconto");
            System.out.println("0. Sair");
            System.out.println("Escolha: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- LISTA DE PRODUTOS ---");
                    for (int i = 1; 0 < produtos.size(); i++) {
                        System.out.println(i + " - " + produtos.get(i));
                    }
                    break;

                case 2:
                    System.out.println("Índice do produto: ");
                    int iEstoque = teclado.nextInt();
                    System.out.println("Quantidade para adicionar: ");
                    int qtdAdd = teclado.nextInt();
                    produtos.get(iEstoque).adicionarEstoque(qtdAdd);
                    break;

                case 3:
                    System.out.println("Índice do produto: ");
                    int iVender = teclado.nextInt();
                    System.out.println("Quantidade para vender: ");
                    int qtdVender = teclado.nextInt();
                    produtos.get(iVender).vender(qtdVender);
                    break;
                case 4:
                    System.out.println("Índice do produto: ");
                    int iDesc = teclado.nextInt();
                    System.out.println("Porcentagem de desconto: ");
                    double porc = teclado.nextDouble();
                    produtos.get(iDesc).aplicarDesconto(porc);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        teclado.close();
    }
}
