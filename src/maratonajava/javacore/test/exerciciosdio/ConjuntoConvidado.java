package src.maratonajava.javacore.test.exerciciosdio;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public void setCodigoConvite(int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Convidado convidado = (Convidado) o;
        return codigoConvite == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }
}

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
         System.out.println(convidadoSet);
    }

    static void main() {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        conjuntoConvidado.adicionarConvidado("Convidado 1", 122);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 122);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1432);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro da Set de convidados");
        conjuntoConvidado.exibirConvidados();

        //conjuntoConvidado.removerConvidadoPorCodigoConvite(122);
        //System.out.println(conjuntoConvidado.contarConvidados() + " após remoção.");
    }

}
