package src.maratonajava.javacore.test.exerconexaobd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static src.maratonajava.javacore.test.exerconexaobd.GravarEstoque.gravarEstoque;

public class Main {
    static void main() throws IOException {
        Scanner sc = new Scanner(System.in);

        String nomeDoArquivo = "estoque.csv";
        String diretorio = System.getProperty("C:\\PROJETOS\\DevDojo\\managerFiles");
        String caminho = diretorio + "\\" + nomeDoArquivo;

        List<String> carrinho = new ArrayList<>();
        carrinho.add("Maca");
        carrinho.add("Banana");
        carrinho.add("Uva");

        gravarEstoque(nomeDoArquivo, caminho, carrinho);

    }
}


