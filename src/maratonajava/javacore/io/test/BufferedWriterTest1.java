package src.maratonajava.javacore.io.test;

import java.io.*;
// Mais otimizado que FileWriter, para dados em memoria
public class BufferedWriterTest1 {
    static void main() throws FileNotFoundException {
        File file = new File("file.txt");
        try (FileWriter fileWriter = new FileWriter(file, true)){
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("O melhor curso do mundo");
            bufferedWriter.newLine();
            bufferedWriter.flush(); //Sempre fechar recursos
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
