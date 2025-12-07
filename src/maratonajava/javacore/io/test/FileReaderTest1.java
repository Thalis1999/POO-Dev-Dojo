package src.maratonajava.javacore.io.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {
    static void main() throws FileNotFoundException {
        File file = new File("file.txt");
        try(FileReader fileReader = new FileReader(file)){
            char[] in = new char[1];
            fileReader.read(in);
            for (char c : in){
                System.out.println(c);
            }
//            int i;
//            while ((i = fileReader.read()) != -1){ // se for diferente de -1, true. Assim lendo arquivo todo
//                System.out.print((char) i);
//            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
