package javacore.interfaces.test;

import javacore.interfaces.dominio.DataLoader;
import javacore.interfaces.dominio.DatabaseLoader;
import javacore.interfaces.dominio.FileLoader;

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
