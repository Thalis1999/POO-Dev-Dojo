package maratonajava.introducao;
/*
Prática

Cria variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>,
na data <data.>
*/

public class Aula03TipoPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Thalis";
        String endereco = "Rua dos tolos";
        double salario = 2500.0;
        String dataRecebimento = "24/05/2012";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ",\nconfirmo que recebi o salário de " + salario + ",\n" +
                "na data " + dataRecebimento + ".";

        System.out.println(relatorio);
    }
}
