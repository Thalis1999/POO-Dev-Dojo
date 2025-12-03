package src.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest1 {
    static void main() {
        String regex = "ab";
        String texto = "abababa";
        Pattern pattern = Pattern.compile(regex);  //compila
        Matcher matcher = pattern.matcher(texto);  //matcher
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " ");
        }
    }
}
