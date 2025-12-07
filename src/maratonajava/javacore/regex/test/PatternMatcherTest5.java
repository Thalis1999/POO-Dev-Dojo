package src.maratonajava.javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {
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
        // Ache uma ou mais vezes, seguido de espaco em branco ou no fim da linha
        // \\. caractere de escape = para ponto . ex: gmail"."
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "luffy@hotmail.com, 123jotaro@gmail.com, @#!zoro@gmail.com.br";
        System.out.println("Email válido");
        System.out.println("#@!zoro@gmail.br".matches(regex));
        System.out.println(texto.split(",")[1].trim()); //trim tira espaço
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
