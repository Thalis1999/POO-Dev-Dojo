package javacore.exercicios.seminario.test;

import javacore.exercicios.seminario.dominio.Aluno;
import javacore.exercicios.seminario.dominio.Local;
import javacore.exercicios.seminario.dominio.Professor;
import javacore.exercicios.seminario.dominio.Seminario;

public class SeminarioTest {
    static void main() {
        Local local = new Local("Rua das laranjeiras");

        Aluno aluno = new Aluno("Alex", 17);
        Aluno aluno2 = new Aluno("Joao", 23);

        Professor professor = new Professor("Junior", "Pirata");
        Professor professor2 = new Professor("Lucas", "Cozinheiro");

        Aluno[] alunosSeminario = {aluno, aluno2};

        Seminario seminario = new Seminario("Onde achar one piece", local, alunosSeminario);
        Seminario seminario2 = new Seminario("Sabaody", local, alunosSeminario);
        Seminario[] seminariosDisponiveis = {seminario, seminario2};

        professor.setSeminarios(seminariosDisponiveis);
        professor.imprimir();

    }
}
/*
* Cadastrar seminarios, estudantes, professores e local onde sera realizado
*
* Um aluno podera estar em apenas um seminario
* Um seminario podera ter nenhum ou varios alunos
* Um professor podera ministrar varios seminarios
* Um seminario deve ter um local
*
* Campos basicos (excluindo relacionamento)
* seminario: titulo
* aluno: nome e idade
* professor: nome, especialidade
* local: endereco
*/