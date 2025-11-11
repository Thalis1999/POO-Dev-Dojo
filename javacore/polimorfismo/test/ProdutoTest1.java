package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Televisao;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalcularImposto;

public class ProdutoTest1 {
    static void main() {
        Computador computador = new Computador("NUC1017", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalcularImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalcularImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalcularImposto.calcularImposto(tv);
    }
}
