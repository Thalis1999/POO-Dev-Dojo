package src.maratonajava.javacore.nio.test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest1 {
    static void main() {
        Path p1 = Paths.get("C:\\PROJETOS\\DevDojo\\pasta\\file.txt");
        System.out.println(p1.getFileName());
    }
}
