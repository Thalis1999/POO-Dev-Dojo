package src.maratonajava.javacore.collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private String nome;
    private double preco;
    private int quant;

    public Item(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuant() {
        return quant;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", quant = " + quant +
                '}';
    }
}

class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        this.itemList.add(item);
    }
    /*
    // Imperativo
    public double calcularValorTotal() {
        if (this.itemList.isEmpty()) {
            throw new RuntimeException("Carrinho vazio.");
        }
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                valorTotal += item.getPreco() * item.getQuant();
            }
        }
        return valorTotal; */


    // Declarativo com stream API
    public double calcularValorTotal() {
        if (itemList.isEmpty()){
            throw new RuntimeException("Lista vazia.");
        }
        return itemList.stream()
                .mapToDouble(item -> item.getPreco() * item.getQuant())
                .sum();
    }
    public void listarItems() {
        for (Item item : itemList) {
            System.out.println(item);
        }
    }
}

public class Carrinho {
    static void main() throws IOException {
        Scanner scanner = new Scanner(System.in);
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Adicione o item " + i);

            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite o preço: ");
            double preco = scanner.nextDouble();

            System.out.println("Digite a quantidade: ");
            int quantidade = scanner.nextInt();

            scanner.nextLine();
            Item novoItem = new Item(nome, preco, quantidade);
            carrinho.adicionarItem(novoItem);
        }
        carrinho.listarItems();
        System.out.println("Valor total da compra foi de: " + carrinho.calcularValorTotal());
    }
}

