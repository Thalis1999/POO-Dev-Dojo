package javacore.interfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões de um arquivo");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do do FileLoader");
    }
}
