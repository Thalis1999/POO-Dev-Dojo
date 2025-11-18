package javacore.test.enums.test;

import javacore.test.enums.dominio.DiaSemana;

import static javacore.test.enums.dominio.DiaSemana.SEGUNDA;

public class main {
    static void main() {
        DiaSemana hoje = SEGUNDA;
        switch (hoje) {
            case SABADO:
            case DOMINGO:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia da semana");


        }
    }
}
