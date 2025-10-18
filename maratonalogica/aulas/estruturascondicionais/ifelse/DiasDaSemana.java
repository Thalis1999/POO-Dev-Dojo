package maratonalogica.aulas.estruturascondicionais.ifelse;
/*
    receba um número inteiro do usuário e imprima o dia da semana correspondente
    sendo 1 segunda-feira.
*/
public class DiasDaSemana {
    public static void main(String[] args) {
        int dia = 5;

        if (dia == 1) {
            System.out.println("segunda");
        } else if (dia == 2) {
            System.out.println("terca");
        } else if (dia == 3) {
            System.out.println("quarta");
        } else if (dia == 4) {
            System.out.println("quinta");
        } else if (dia == 5) {
            System.out.println("sexta");
        } else if (dia == 6) {
            System.out.println("sabado");
        } else if (dia == 7) {
            System.out.println("domingo");

        }
    }
}
