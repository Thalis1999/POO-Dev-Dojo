package maratonalogica.aulas.arrays.unidimensional;

import java.util.Scanner;

public class Aula02ArraysComFor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        double media = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Resultado " + (i + 1));
            notas[i] = scanner.nextDouble();
            media = media + notas[i];
        }
        System.out.println("A media é " + (media / notas.length));
    }
}








