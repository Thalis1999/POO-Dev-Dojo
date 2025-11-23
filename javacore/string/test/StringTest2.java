package javacore.string.test;

public class StringTest2 {
    static void main() {
        String nome = "Luffy";
        String num = "123456";
        System.out.println(nome.charAt(0)); // posicao 0 na string
        System.out.println(nome.length()); // tamanho = 4 pos
        System.out.println(nome.replace("f", "l")); // troca
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(num.length());
        System.out.println(num.substring(3, num.length()));
        System.out.println(nome.trim());
    }
}
