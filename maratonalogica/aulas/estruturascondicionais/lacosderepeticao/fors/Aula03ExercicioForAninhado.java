package maratonalogica.aulas.estruturascondicionais.lacosderepeticao.fors;

// Tabuada do 1 ate o 9

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("Tabuada do " + i);
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));
            }
        }
    }
}


