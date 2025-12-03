package src.maratonajava.javacore.introducaoclasses.test;
//Está em outro pacote
import src.maratonajava.javacore.introducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    static void main() {
        //Objeto criado com "new"
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Luffy";
        pessoa.idade = 32;
        pessoa.sexo = "M";

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);

    }
}
