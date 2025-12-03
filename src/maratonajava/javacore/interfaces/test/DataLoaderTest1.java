package src.maratonajava.javacore.interfaces.test;

import src.maratonajava.javacore.interfaces.dominio.DatabaseLoader;
import src.maratonajava.javacore.interfaces.dominio.FileLoader;

public class DataLoaderTest1 {
    static void main() {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();


    }
}
