package src.maratonajava.javacore.heranca.test;

import src.maratonajava.javacore.heranca.dominio.Funcionario;

// 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar a classe pai
// 1 - Bloco de inicialização estático da sub classe é executado quando a JVM carregar a classe filha
// 1 - Alocado espaço em memória pro objeto da super classe
// 2 - Cada atributo de super classe é criado e inicializado com valores dafault ou que for passada da classe pai
// 3 - Bloco de inicialização da super classe é executado
// 4 - Construtor é executado da super classe
// 1 - Alocado espaço em memória pro objeto da sub classe
// 2 - Cada atributo de sub classe é criado e inicializado com valores dafault ou que for passada da classe pai
// 3 - Bloco de inicialização da sub classe é executado
// 4 - Construtor é executado da sub classe

public class HerancaTest2 {
    static void main() {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
