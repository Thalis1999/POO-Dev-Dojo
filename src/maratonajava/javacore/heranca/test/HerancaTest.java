package src.maratonajava.javacore.heranca.test;

import src.maratonajava.javacore.heranca.dominio.Endereco;
import src.maratonajava.javacore.heranca.dominio.Funcionario;
import src.maratonajava.javacore.heranca.dominio.Pessoa;

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
