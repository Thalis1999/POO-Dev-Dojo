package src.maratonajava.javacore.nio.niopersistence;

import java.io.IOException;

public class Test {
    static void main() throws IOException {
        FilePersistence persistence = new NIOFilePersistence("user.csv");
        System.out.println(persistence.write("bianca;bia@bia.com;22/09/1997"));
        System.out.println("=============================");
        System.out.println(persistence.write("bernardo;bernardo@bernardo.com;22/10/1980"));
        System.out.println("=============================");
        System.out.println(persistence.findAll());

    }
}
