package src.maratonajava.javacore.polimorfismo.servico;

import src.maratonajava.javacore.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando na memoria");
    }
}
