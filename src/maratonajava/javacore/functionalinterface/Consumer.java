package src.maratonajava.javacore.functionalinterface;

import java.util.Arrays;
import java.util.List;

public class Consumer {
    static void main() {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        numeros.forEach(integer -> {
                    if (integer % 2 == 0) {
                        System.out.println(integer);
                    }
                }
        );
    }
}

