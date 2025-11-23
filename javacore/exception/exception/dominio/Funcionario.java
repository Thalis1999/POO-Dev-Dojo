package javacore.exception.exception.dominio;

import javacore.exception.dominio.LoginInvalidoException;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, ArithmeticException{
        System.out.println("Salvando funcionario");
    }
}
