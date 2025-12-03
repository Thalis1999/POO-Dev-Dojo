package src.maratonajava.javacore.exception.exception.dominio;

import src.maratonajava.javacore.exception.dominio.LoginInvalidoException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, ArithmeticException{
        System.out.println("Salvando funcionario");
    }
}
