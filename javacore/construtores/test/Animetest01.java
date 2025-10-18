package javacore.construtores.test;

import javacore.construtores.dominio.Anime;

public class Animetest01 {
    static void main() {
        Anime anime = new Anime("Rakudama Drive", "TV", 12, "M");
        anime.imprimir();
    }
}
