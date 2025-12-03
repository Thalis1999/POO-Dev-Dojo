package src.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3Exer {
    static void main() {
        String regex = "0[xX][0-9a-fA-F]";   // encontrar no range: x ou X, 0 até 9, a até f e A até F
        String texto = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 123456789");
        System.out.println("regex: " + regex);
        System.out.println("posicoes encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }
    }

}
