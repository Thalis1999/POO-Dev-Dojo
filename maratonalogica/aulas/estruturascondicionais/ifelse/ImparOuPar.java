package maratonalogica.aulas.estruturascondicionais.ifelse;
/*
    Dado um determinado número inteiro, imprima se ele é ímpar ou par.
    Resto da divisão por 2 se for par, sempre vai ser 0, se não vai ser ímpar.
*/
public class ImparOuPar {
    public static void main(String[] args) {
        // +, -, /, %, *
        int numero = 121212;
        if ((numero % 2) == 0){
            System.out.println("PAR: "+(numero % 2));
        }else {
            System.out.println("IMPAR: "+(numero % 2));
        }
    }
}
