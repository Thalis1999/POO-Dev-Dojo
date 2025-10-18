
/* Eu como usuário gostaria de imprimir todos os numeros impares de 0 ate o valor digitado pelo usuario */

package maratonalogica.aulas.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int valorFinal = teclado.nextInt();
        int i = 0;
        while ( i <= valorFinal) {
            if ( i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
    }
}
