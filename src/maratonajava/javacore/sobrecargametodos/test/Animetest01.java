package src.maratonajava.javacore.sobrecargametodos.test;

import src.maratonajava.javacore.sobrecargametodos.dominio.Anime;

public class Animetest01 {
    static void main() {
        Anime anime = new Anime();
        anime.init("Rakudama Drive", "TV", 12, "M");
        anime.imprimir();
    }
}
