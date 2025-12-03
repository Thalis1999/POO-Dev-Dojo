package src.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest4 {
    static void main() {
        // \d = todos os digitos
        // \D = tudo que não for digito
        // \s = espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, digitos,
        // \W = tudo o que não for incluso no \w
        // []
        // quantificadores - poder em tirar algo de expressão
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n,n} de n até m
        // ()
        // | o(v|c)o encontre ovo | cafe
        // $ fim da linha
        //             ache uma ou mais vezes, seguido de espaco em branco ou no fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1 ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto: " + texto);
        System.out.println("indice: 123456789");
        System.out.println("regex: " + regex);
        System.out.println("posicoes encontradas");
        while(matcher.find()){
            System.out.println(matcher.start() + " " + matcher.group());
        }
    }
}
