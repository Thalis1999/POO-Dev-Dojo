package javacore.modificadoresestaticos.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização é executado quando a JVM Carregar a classe
    // 1 - Alocado espaço em memória pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores dafault ou que for passada
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado
    static {  //Executado 1 vez.
        System.out.print("Bloco de inicialização");
    }

    public Anime(String nome, int[] episodios) {
        this.nome = nome;
        Anime.episodios = episodios;
    }

    public Anime() {
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
        for (int episodio: Anime.episodios) {
            System.out.println(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
