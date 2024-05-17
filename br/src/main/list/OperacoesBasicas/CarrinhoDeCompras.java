package br.src.main.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item>  itemList;
    
    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover =  new ArrayList<>();

        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
      
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        
        if (!itemList.isEmpty()) {
            for (Item i : itemList ) {
                double valorItem = i.getPreco() * i.getQuantidade(); // eu não tinha implementado por quantidade, pensei nisso depois achando que preco poderia ser total

                valorTotal  += valorItem;
            }
    
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
        
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            // System.out.println(itemList);
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
        
    }
    @Override
    public String toString() {
      return "CarrinhoDeCompras{" +
          "itens=" + itemList +
          '}';
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        
        carrinhoDeCompras.adicionarItem("Carne", 35.50, 1);
        carrinhoDeCompras.adicionarItem("Carne", 35.50, 1);
        carrinhoDeCompras.adicionarItem("batata", 10.00, 5);

        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.removerItem("Carne");
        System.out.println("O numero total de elementos na lista é: " + carrinhoDeCompras.calcularValorTotal());
        
        carrinhoDeCompras.exibirItens();

        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();

        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}
