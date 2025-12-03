package src.maratonajava.introducao;

public class Aula01OlaDevDojo {
    public static void main(String[] args) {
        /* System.out.println("KA-ME-HA-ME-HAA!");*/
        int count = 0;
        while (count < 10 ){
            System.out.println(count);
            count = count + 1;
        }
        count = 0;
        do {
            System.out.printf("dentro do while " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " +1);
        }

    }
}

