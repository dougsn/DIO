package list.OperacoesBasicas.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItems(String nome, Double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();

        for(Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        itemList.removeAll(itemsParaRemover);
    }

    public void calcularValorTotal() {
        double valorTotal = 0;

        for(Item i: itemList) {
            valorTotal += i.getPreco() * i.getQuantidade();
        }
        System.out.println(valorTotal);
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItems("Arroz",5.0,2);
        carrinhoDeCompras.adicionarItems("Feijão",3.0,3);
        carrinhoDeCompras.adicionarItems("Batata",1.0,10);


        carrinhoDeCompras.calcularValorTotal();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Feijão");
        carrinhoDeCompras.exibirItens();



    }

}
