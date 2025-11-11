package javacore.interfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    // private -> default -> protected -> public
    @Override
    public void load() {
        System.out.println("Carregando da base de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do banco de dados");
    }

    public void checkPermission() {
    System.out.println("Checando permissões no banco de dados");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do DatabaseLoader");
    }
}
