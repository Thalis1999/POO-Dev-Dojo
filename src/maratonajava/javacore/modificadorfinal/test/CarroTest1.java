package src.maratonajava.javacore.modificadorfinal.test;

import src.maratonajava.javacore.modificadorfinal.dominio.Carro;
import src.maratonajava.javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest1 {
    static void main() {
        Carro carro = new Carro();
        System.out.println(Carro.VELICIDADE_LIMITE);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        System.out.println(ferrari.getNome());
    }
}
