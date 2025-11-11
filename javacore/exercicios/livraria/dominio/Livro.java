package javacore.exercicios.livraria.dominio;

public class Livro {
    private String nome;
    private String descricao;
    private double valor;

    private Autor autor;

    public Livro(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String mostrarDetalhes() {
        return "Livro {" +
                "Nome = '" + nome + '\'' +
                ", Descricao = '" + descricao + '\'' +
                ", Valor = " + valor +
                ", Autor = '" + autor + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
