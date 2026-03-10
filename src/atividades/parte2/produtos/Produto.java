package atividades.parte2.produtos;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Estoque adicionado!");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) {
            estoque -= quantidade;
            System.out.println("Venda realizada!");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    public void aplicarDesconto(double porcentagem) {
        if (porcentagem > 0 && porcentagem <= 100) {
            preco -= preco * (porcentagem / 100);
            System.out.println("Desconto aplicado!");
        }
    }

    @Override
    public String toString() {
        return nome + "| Preço: R$ " + preco + " | Estoque: " + estoque;
    }
}
