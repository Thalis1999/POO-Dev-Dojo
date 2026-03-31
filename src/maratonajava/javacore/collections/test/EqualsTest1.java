package src.maratonajava.javacore.collections.test;

import src.maratonajava.javacore.collections.dominio.Smartphone;

public class EqualsTest1 {
    static void main() {
        Smartphone s1 = new Smartphone("3d22", "Iphone");
        Smartphone s2 = new Smartphone("3d22", "Iphone");
        System.out.println(s1.equals(s2));

    }
}
