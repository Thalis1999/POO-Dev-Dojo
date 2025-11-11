package javacore.polimorfismo.test;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.LinkedList;
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
