/* Como usuario eu gostaria de ter um menu visual que seja navegavel atrave de numeros
O menu deve ser exibido da seguinte forma

1. Calcular imposto
2. Depositar salário
3. Sair

O menu deve ficar disponivel enquanto eu nao digitar o numero 3.Dessa forma o sistema fi
cará em execucao, evitando ter que ser reiniciado a cada opecacao */

package maratonalogica.aulas.estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        while (opcao != 3) {
            System.out.println("1.Calcular imposto");
            System.out.println("2.Depositar salário");
            System.out.println("3.Sair");
            opcao = sc.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
