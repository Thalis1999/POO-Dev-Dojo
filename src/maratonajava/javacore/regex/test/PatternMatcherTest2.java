package src.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {
    static void main() {
        // metacaracteres
        // \d = todos os digitos
        // \D = tudo que não for digito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos,
        // \W = tudo o que não for incluso no \w
        // []
        String regex = "\\s";
        String texto = "@#hhj1221hch21hg2";
        Pattern pattern = Pattern.compile(regex);  //compila
        Matcher matcher = pattern.matcher(texto);  //matcher
        System.out.println("texto: " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
