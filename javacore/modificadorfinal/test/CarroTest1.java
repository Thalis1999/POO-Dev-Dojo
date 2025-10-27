package javacore.modificadorfinal.test;

import javacore.modificadorfinal.dominio.Carro;
import javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest1 {
    static void main() {
        Carro carro = new Carro();
        System.out.println(Carro.VELICIDADE_LIMITE);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        System.out.println(ferrari.getNome());
    }
}
