package src.maratonajava.javacore.test;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Test2 {

    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
        double valorUnitPeca1 = 0, valorUnitPeca2 = 0;

        codigoPeca1 = sc.nextInt();
        numeroPecas1 = sc.nextInt();
        double valor1 = sc.nextDouble();

        codigoPeca2 = sc.nextInt();
        numeroPecas2 = sc.nextInt();
        double valor2= sc.nextDouble();

        double total = (numeroPecas1 * valor1) + (numeroPecas2 * valor2);

        System.out.printf(Locale.US, "VALOR A PAGAR = R$ %.2f%n", total);

    }
}