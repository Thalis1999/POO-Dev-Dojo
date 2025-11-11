package javacore.exercicios.ExerciciosRicardoMaroquio.ex1;

import java.io.IOException;
import java.util.Scanner;

public class App {
    static void clearScreen() throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    static void main() throws Exception {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Digite o segundo lado: ");
        double lado2 = scanner.nextDouble();
        double area = lado1 * lado2;
        System.out.format("A área do retângulo de lados %f e %f é %f.%n", lado1, lado2, area);
        scanner.close();
    }


}
