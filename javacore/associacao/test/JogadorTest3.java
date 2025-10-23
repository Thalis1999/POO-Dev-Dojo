package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

// Bidirecional
public class JogadorTest3 {
    static void main() {
        Jogador jogador = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprimir();

        System.out.println("--- Time ---");
        time.imprimir();
    }
}
