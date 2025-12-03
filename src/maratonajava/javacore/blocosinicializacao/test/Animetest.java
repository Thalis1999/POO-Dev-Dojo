package src.maratonajava.javacore.blocosinicializacao.test;

import src.maratonajava.javacore.blocosinicializacao.dominio.Anime;

public class Animetest {
    static void main() {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());
    }
}
