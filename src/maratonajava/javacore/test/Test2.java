package src.maratonajava.javacore.test;

import java.util.Scanner;

public class Test2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String telefone = sc.next();
        String format = telefone.replaceAll("(\\d{2})(\\d{5})(\\d{4})", "($1) $2-$3");
        String fixo = sc.next();
        String format1 = fixo.replaceAll("(\\d{2})(\\d{4})(\\d{4})", "($1) $2-$3");
        System.out.println(format);
        System.out.println(format1);
    }
}
