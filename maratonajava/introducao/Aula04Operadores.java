package maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // * - / +
        int numero01 = 10;
        int numero02 = 20;
        System.out.println(numero01+numero02);

        // %: resto
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >== == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND) || (or) !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinte = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinte = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinte " + isDentroDaLeiMaiorQueTrinte);
        System.out.println("isDentroDaLeiMenorQueTrinte " + isDentroDaLeiMenorQueTrinte);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlayStationCincoCompravel " + isPlayStationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;  // 1800
        bonus += 1000;  // 2800
        bonus -= 1000;  // 1800
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // Operadores unários
        int contador = 0;
        contador += 1;  // contador = contador + 1;
        contador++;
        contador--;
        ++contador; // executa e incrementa
        --contador; // incrementa e executa
        int contador2 = 0;
        System.out.println(++contador2);


    }
}
