package src.maratonajava.javacore.test.exerciciosdio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}

public class OrdenacaoPessoa {
        private List<Pessoa> pessoaList;

        public OrdenacaoPessoa() {
            this.pessoaList = new ArrayList<>();
        }
        public void adicionarPessoa(String nome, int idade, double altura) {
            pessoaList.add(new Pessoa(nome, idade, altura));
        }
        public List<Pessoa> ordenarPorIdade() {
            List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
            Collections.sort(pessoaPorIdade);
            return pessoaPorIdade;
        }
        public List<Pessoa> ordenarPorAltura() {
            List<Pessoa> pessoaPorIAltura = new ArrayList<>(pessoaList);
            Collections.sort(pessoaPorIAltura, new ComparatorPorAltura());
            return pessoaPorIAltura;
        }

    static void main() {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 19,1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 19,1.54);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 19,1.88);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
