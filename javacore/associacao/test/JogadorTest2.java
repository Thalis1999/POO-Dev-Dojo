package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

// Unidirecional - jogador tem 1 time
public class JogadorTest2 {
    static void main() {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
        jogador1.imprimir();
    }
}
