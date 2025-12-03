package src.maratonajava.javacore.classesabstratas.test;

import src.maratonajava.javacore.classesabstratas.dominio.Desenvolvedor;
import src.maratonajava.javacore.classesabstratas.dominio.Gerente;

public class FuncionarioTest1 {
    static void main() {
        Gerente gerente = new Gerente("Nami", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Touya", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprimir();
        desenvolvedor.imprimir();
    }
}
