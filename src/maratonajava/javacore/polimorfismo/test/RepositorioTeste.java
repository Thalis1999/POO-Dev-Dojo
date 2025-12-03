package src.maratonajava.javacore.polimorfismo.test;

import src.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import src.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    static void main() {
        // orietado a interfaces - Tipo genérico para tipos mais especificos.
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        // List é genérico, ArrayList é específico.
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
