package maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        byte dia = scanner.nextByte();
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.printf("Inválido");
                break;
        }

        String sexo = "F";
        switch (sexo) {
            case "M":
                System.out.println("Homem");
                break;
            case "F":
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }

    }
}

