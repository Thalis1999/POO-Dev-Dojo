package javacore.exception.exception.test;

import javacore.exception.dominio.LoginInvalidoException;
import javacore.exception.exception.dominio.Funcionario;
import javacore.exception.exception.dominio.Pessoa;

public class SobrescritaComExceptionTest1 {
    static void main() {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        }catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
