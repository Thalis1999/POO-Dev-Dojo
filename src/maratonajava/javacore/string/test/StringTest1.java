package src.maratonajava.javacore.string.test;

public class StringTest1 {
    static void main() {
        // Literal
        String nome = "Thalis";
        String nome2 = "Leo";

        // 1- Variavel referencia
        // 2- Objeto do tipo string
        // 3- String na pool
        String nome3 = new String("Thalis");
        System.out.println(nome3 == nome3.intern()); // Acessa a referencia
    }
}
