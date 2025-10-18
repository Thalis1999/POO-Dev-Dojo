package javacore.construtores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(String nome, String tipo, int episodios) {
        System.out.println("Dentro do construtor outros tipos de argumentos");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;

    }

    public Anime(String nome, String tipo, int episodios, String genero) {
        this(nome, tipo, episodios); // chamando o construtor com esses tipos de argumentos
        //this(); //Chama o construtor sem argumentos
        System.out.println("Dentro do construtor com argumentos");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
    public int getEpisodios() {
        return this.episodios;
    }
}
