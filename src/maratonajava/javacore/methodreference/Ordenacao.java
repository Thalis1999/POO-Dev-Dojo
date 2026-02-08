package src.maratonajava.javacore.methodreference;
import java.util.ArrayList;
import java.util.Comparator;
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
            // method reference
            pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("Lista vazia.");
        }
    }
}
public class Ordenacao {
}
