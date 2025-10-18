package maratonalogica.aulas.variaveis;
/*
   Crie uma classe que calcule uma determinada porcentagem de um dado salário.
   Crie uma classe.
   Aceitar um valor de entrada para o salário.
   Definir o valor da porcentagem (perguntar quanto?) - 30%.
   Calcular a procentagem.
*/
public class CalculadoraSalario {
    public static void main(String[] args){
        float salario = 2500.00F;
        float porcentagem = 30;
        float porcentagemDoSalario = salario * (porcentagem /100);
        System.out.println(porcentagemDoSalario);
    }
}
