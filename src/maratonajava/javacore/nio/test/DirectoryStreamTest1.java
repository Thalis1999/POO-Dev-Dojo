package src.maratonajava.javacore.nio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTest1 {
    static void main() {
        Path dir = Paths.get("."); // . diretorio atual
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)){
            for(Path path : stream){
                System.out.println(path.getFileName());
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
