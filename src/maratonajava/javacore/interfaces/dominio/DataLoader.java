package src.maratonajava.javacore.interfaces.dominio;

// Redundante pois java ja sabe que é abstrato
public interface DataLoader {
    public static final int MAX_DATA_DIZE = 10;
    public abstract void load();

    // Nao precisa implementar
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize");
    }
}
