package src.maratonajava.javacore.io.filepersistence;

import java.io.IOException;

public class Main {
    static void main() throws IOException {
        FilePersistence persistence = new IOfilePersistence("user.csv");
        System.out.println((persistence.write("Lucas;lucas@lucas.com;15/05/1990")));
        System.out.println("===========================");
        System.out.println((persistence.write("Maria;maria@lucas.com;31/05/1998")));
        System.out.println("===========================");
        System.out.println((persistence.write("Joao;joao@lucas.com;17/05/1995")));
        System.out.println("===========================");
        System.out.println(persistence.findAll());
        System.out.println("===========================");
        System.out.println(persistence.remove("lucas@"));
        System.out.println("===========================");
        System.out.println(persistence.findBy(";maria@"));
        System.out.println("===========================");
        System.out.println(persistence.replace("Maria", "MariaSubs"));
        System.out.println("===========================");
        System.out.println(persistence.findAll());



    }
}
