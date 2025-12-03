package src.maratonajava.javacore.string.test;

public class StringBuilderTest1 {
    static void main() {
        String nome = "William";
        nome.concat(" DevDojo");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder(16);
        sb.reverse();
        sb.delete(0, 3);


    }
}
