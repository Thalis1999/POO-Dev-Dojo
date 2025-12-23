package src.maratonajava.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest3 {
    static void main() {
        // caminhos relativos
        Path dir = Paths.get("home/thalis");
        Path arquivo = Paths.get("dev/arquivo.txt");

        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

        Path absoluto = Paths.get("/home/thalis");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1" + absoluto.resolve(relativo));
        System.out.println("2" + absoluto.resolve(file));
        System.out.println("3" + relativo.resolve(absoluto));
        System.out.println("4" + relativo.resolve(file));
        System.out.println("5" + file.resolve(absoluto));
        System.out.println("6" + file.resolve(relativo));
    }
}
