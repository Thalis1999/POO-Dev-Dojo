package src.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File - arquivo
// FileWriter - escrever em arquivo mas low level
// FileReader - leitura
// BufferedWriter - escrita estilizada e dados memoria
// BufferedReader - melhor que Bwriter
public class FileWriterTest1 {
    static void main() {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Melhor curso do Brasil\n");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
