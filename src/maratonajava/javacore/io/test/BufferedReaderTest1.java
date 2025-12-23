package src.maratonajava.javacore.io.test;

import java.io.*;

public class BufferedReaderTest1 {
    static void main() throws FileNotFoundException {
        File file = new File("file.txt");
        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linha;
                while ((linha = bufferedReader.readLine()) != null){
                    System.out.println(linha);
                }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
