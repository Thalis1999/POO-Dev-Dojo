package src.maratonajava.javacore.test.exerconexaobd;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GravarEstoque {
    public static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {

        FileWriter stream;
        PrintWriter print;

        try {
            stream = new FileWriter(caminho);
            print = new PrintWriter(stream);
            for (String linha : conteudo) {
                print.println(linha);
            }
            print.close();
            stream.close();
            System.out.println("O arquivo " + nomeDoArquivo + " foi salvo em " + caminho);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
