package src.maratonajava.javacore.polimorfismo.test;

import src.maratonajava.javacore.polimorfismo.dominio.Computador;
import src.maratonajava.javacore.polimorfismo.dominio.Produto;
import src.maratonajava.javacore.polimorfismo.dominio.Tomate;

public class ProdutoTest3 {
    static void main() {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
    }
}
