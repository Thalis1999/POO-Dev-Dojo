package src.maratonajava.javacore.associacao.test;

import src.maratonajava.javacore.associacao.dominio.Escola;
import src.maratonajava.javacore.associacao.dominio.Professor;

public class EscolaTest {
    static void main() {
        Professor professor = new Professor("Jiraya");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konoha", professores);

        escola.imprimir();
    }
}
