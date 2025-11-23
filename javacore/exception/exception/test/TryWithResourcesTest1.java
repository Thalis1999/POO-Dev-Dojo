package javacore.exception.exception.test;

import javacore.exception.exception.dominio.Leitor1;
import javacore.exception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest1 {
    static void main() {
        lerArquivo();
    }
    // Ja libera a memoria automaticamente
    public static void lerArquivo(){
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"));
             Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
}
