package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Gesto {
    String gesto;
    List<Gesto> ganha = new ArrayList<>();
    List<Gesto> perde = new ArrayList<>();

    public Gesto(String gesto) {
        this.gesto = gesto;
    }
}

class Mao {
    Gesto gesto;
}

enum Resultado {
    GANHA, PERDE, EMPATA;
}

class jogoController {
    public Resultado jogar(Mao jogador1, Mao jogador2) {
        if (jogador1.gesto == null || jogador2.gesto == null) {
            System.out.println("Erro: Alguém jogou com a mão vazia!");
            return Resultado.EMPATA;
        }
        if (jogador1.gesto == jogador2.gesto){
            return Resultado.EMPATA;
        }

        if (jogador1.gesto.ganha.contains(jogador2.gesto)){
            return Resultado.GANHA;
        }
        return Resultado.PERDE;
    }
}

class Jogo {
    Mao jogador1;
    Mao jogador2;
    jogoController jogoController;

    public void jogar() {
        jogador1 = new Mao();
        jogador2 = new Mao();
        jogoController = new jogoController();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Gesto pedra = new Gesto("Pedra");
        Gesto papel = new Gesto("Papel");
        Gesto tesoura = new Gesto("Tesoura");

        pedra.ganha.add(tesoura);
        pedra.perde.add(papel);

        papel.ganha.add(pedra);
        papel.perde.add(tesoura);

        tesoura.ganha.add(papel);
        tesoura.perde.add(pedra);

        List<Gesto> opcoes = new ArrayList<>();
        opcoes.add(pedra);
        opcoes.add(papel);
        opcoes.add(tesoura);

        System.out.println("Escolha: 0-Pedra | 1-Papel | 2-Tesoura");
        int escolha = scanner.nextInt();

        if (escolha < 0 || escolha > 2) {
            System.out.println("Opção inválida.");
            return;
        }

        jogador1.gesto = opcoes.get(escolha);

        int escolhaPC = random.nextInt(3);
        jogador2.gesto = opcoes.get(escolhaPC);

        System.out.println("Você: " + jogador1.gesto.gesto + " vs PC: " + jogador2.gesto.gesto);

        Resultado resultado = jogoController.jogar(jogador1, jogador2);
        System.out.println("Resultado: " + resultado);
    }
}

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.jogar();
    }
}