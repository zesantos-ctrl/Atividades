package exercicioPart2;

import java.util.ArrayList;
import java.util.Scanner;

class Item {

    String nome;
    double preco;

    Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }
}

public class ListaDeCompras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Item> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n==== LISTA DE COMPRAS ====");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Calcular total");
            System.out.println("0. Sair");
            System.out.println("Escolha: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome do item: ");
                    String nome = teclado.nextLine();

                    System.out.println("Preço: R$ ");
                    double preco = teclado.nextDouble();

                    lista.add(new Item(nome, preco));
                    System.out.println("Item adicionado!");
                    break;
                case 2:
                    System.out.println("Digite o índice de item para remover: ");
                    int indice = teclado.nextInt();

                    if (indice >= 0 && indice < lista.size()) {
                        lista.remove(indice);
                        System.out.println("Item removido1");
                    } else {
                        System.out.println("Índice inválido1");
                    }
                    break;
                case 3:
                    System.out.println("\n---ITENS NA LISTA ---");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println(i + " - " + lista.get(i));
                    }
                    break;

                case 4:
                    double total = 0;
                    for (Item item : lista) {
                        total += item.preco;
                    }
                    System.out.println("Total:  R$ " + total);
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