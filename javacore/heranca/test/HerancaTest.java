package javacore.heranca.test;

import javacore.heranca.dominio.Endereco;
import javacore.heranca.dominio.Funcionario;
import javacore.heranca.dominio.Pessoa;

public class HerancaTest {
    static void main() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 4");
        endereco.setCep("19293933");

        Pessoa pessoa = new Pessoa("Thalis");
        pessoa.setNome("Honoyama");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario(pessoa.getNome());
        funcionario.setSalario(2000);
        funcionario.relatorioPagamento();

    }
}
