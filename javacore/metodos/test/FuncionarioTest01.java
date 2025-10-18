package javacore.metodos.test;

import javacore.metodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main() {
        Funcionario funcionario = new Funcionario();
        funcionario.setIdade(12);
        funcionario.setNome("Camila");
        funcionario.setSalarios(new double[]{120, 789, 4655});
        funcionario.imprime();
        System.out.println("Média " + funcionario.getSalarios());
    }
}
