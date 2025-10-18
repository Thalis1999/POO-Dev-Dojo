package maratonalogica.aulas.arrays.multidimensionais;

import java.util.Scanner;

public class Aula02InicializandoArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMulti1 = new int[2][3];
        //      arrayMulti1[0][0] = 21;
        //      arrayMulti1[0][1] = 10;
        //      arrayMulti1[0][2] = 4;
        //      arrayMulti1[1][0] = 5;
        //      arrayMulti1[1][1] = 9;
        //      arrayMulti1[1][2] = 7;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println("Digite o valor [" + i + "] [" + j + "]");
                arrayMulti1[i][i] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arrayMulti1.length; i++) {
            for (int j = 0; j < arrayMulti1[i].length; j++) {
                System.out.println(" [" + i + "] [" + j + "] " + arrayMulti1[i][j]);
            }
        }
    }
}


