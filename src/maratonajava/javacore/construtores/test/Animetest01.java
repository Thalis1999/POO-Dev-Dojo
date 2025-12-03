package src.maratonajava.javacore.construtores.test;

import src.maratonajava.javacore.construtores.dominio.Anime;

public class Animetest01 {
    static void main() {
        Anime anime = new Anime("Rakudama Drive", "TV", 12, "M");
        anime.imprimir();
    }
}
