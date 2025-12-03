package src.maratonajava.javacore.exception.exception.dominio;

import src.maratonajava.javacore.exception.dominio.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Pessoa {
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando pessoa");
    }
}
