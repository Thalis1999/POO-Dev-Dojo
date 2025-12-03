package src.maratonajava.javacore.polimorfismo.servico;

import src.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
