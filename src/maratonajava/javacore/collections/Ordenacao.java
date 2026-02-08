package src.maratonajava.javacore.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pessoa {
    private Double altura;

    public Double getAltura() {
        return altura;
    }
}

class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public List<Pessoa> ordenarPorAltura() {
        if (!pessoaList.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }
}
public class Ordenacao {
}
