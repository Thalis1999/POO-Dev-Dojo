package maratonalogica.aulas.arrays.unidimensional;

import java.util.Scanner;

public class Aula03ExercicioArraysMelhorado {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner scanner = new Scanner(System.in);
        String concatenacaoArray3 = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1, posição " + i + ": ");
            array1[i] = scanner.nextInt();
            System.out.println("Vetor 2, posição " + i + ": ");
            array2[i] = scanner.nextInt();
            array3[i] = array1[i] * array2[i];
            concatenacaoArray3 = concatenacaoArray3 + array3[i] + " ";
        }
        System.out.println(concatenacaoArray3);

    }
}
