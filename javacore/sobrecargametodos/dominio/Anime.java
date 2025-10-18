package javacore.sobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    // sobrecarga de metodos. (nomes iguais, assinaturas diferentes.
    public void init(String nome, String tipo, int episodios) {
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
    }

    public void init(String nome, String tipo, int episodios, String genero) {
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }

    public String imprimir() {
        return "Anime{" +
                "nome='" + this.nome + '\'' +
                ", tipo='" + this.tipo + '\'' +
                ", episodios=" + this.episodios +
                '}';
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
