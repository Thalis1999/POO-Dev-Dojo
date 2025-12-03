package src.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraTeclado {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = scanner.nextLine();
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
    }
}
