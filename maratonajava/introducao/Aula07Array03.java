package maratonajava.introducao;

public class Aula07Array03 {
    public static void main(String[] args) {
        int[] numeros = new int[2];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};

 //       for (int i = 0; i < numeros3.length; i++) {
 //           System.out.println(numeros3);
 //       }

        for (int num: numeros3) {
            System.out.println(num);
        }

    }
}





