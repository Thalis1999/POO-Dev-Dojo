package maratonalogica.aulas.estruturascondicionais.ifelse;
/*
    Dado um determinado salário, se o salário for maior que 4500, imprima
    30% do valor se não imprima 15% do valor.
    Desafio: Utilize apenas uma variável para guardar o resultado e imprimir no final.
    Desafio: Diga na impressão se é 30% ou 10%.
*/
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {

        float salario = 4700.50F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.30F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.15F;
            porcentagem = "15%";
        }
        System.out.println("O valor em porcentagem de " + porcentagem + " é de " + resultado);
    }
}