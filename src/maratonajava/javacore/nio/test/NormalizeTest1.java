package src.maratonajava.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest1 {
    static void main() {
        String diretorioProjeto = "home/thalis/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        System.out.println(path1.normalize()); // normaliza os diretorios
        Path path2 = Paths.get("/home/./thalis/./dev/");
        System.out.println(path2);
        System.out.println(path2.normalize());
    }
}
