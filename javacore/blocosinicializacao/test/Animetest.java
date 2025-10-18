package javacore.blocosinicializacao.test;

import javacore.blocosinicializacao.dominio.Anime;

public class Animetest {
    static void main() {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());
    }
}
