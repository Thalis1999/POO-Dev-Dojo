package src.maratonajava.javacore.polimorfismo.test;

import src.maratonajava.javacore.polimorfismo.dominio.Computador;
import src.maratonajava.javacore.polimorfismo.dominio.Televisao;
import src.maratonajava.javacore.polimorfismo.dominio.Tomate;
import src.maratonajava.javacore.polimorfismo.servico.CalcularImposto;

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
