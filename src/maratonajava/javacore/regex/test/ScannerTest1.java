package src.maratonajava.javacore.regex.test;

import java.util.Scanner;

public class ScannerTest1 {
    static void main() {
        // \\s pula aonde tem a expressao
        String texto = "Levi, Eren, Mikasa, true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()){

            if (scanner.hasNextInt()){
                int i = scanner.nextInt();
                System.out.println("int " + i);
            }else if (scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean " + b);
            }else{
                System.out.println(scanner.next());
            }

        }
    }
}
