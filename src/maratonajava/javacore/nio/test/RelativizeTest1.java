package src.maratonajava.javacore.nio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest1 {
    static void main() {
        Path dir = Paths.get("/home/thalis");
        Path clazz = Paths.get("/home/thalis/devtop/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        // como chegar em cada um dos diretorios
        Path absoluto1 = Paths.get("/home/thalis");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/thalis/dev/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
    }
}
