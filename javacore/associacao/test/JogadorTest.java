package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
/*
* Jogador 1 -- 1 Personagem
* Time 1 -- N Jogador
* Jogador N -- 1 Time
* Estudante N -- N Curso
*/
public class JogadorTest {
    static void main() {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafú");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for(Jogador jogador: jogadores) {
            jogador.imprimir();
        }
    }
}
