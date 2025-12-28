package src.maratonajava.javacore.threadeerunnable;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Thread {

    private final static Queue<Integer> numbers = new LinkedBlockingQueue<>(100);

    private static synchronized void inc(int number) {
        numbers.add(number);
    }
    private static synchronized void show() {
        System.out.println(numbers);
    }

    static void main() {

        Runnable inc = () -> {
            for (int i = 0; i < 100_000; i++) {
                inc(i);
            }
        };
        Runnable dec = () -> {
            for (int i = 0; i < 100_000; i++) {
                inc(i);
            }
        };
        Runnable show = () -> {
            for (int i = 0; i < 100_000; i++) {
                show();
            }
        };

        new java.lang.Thread(inc).start();
        new java.lang.Thread(dec).start();
        new java.lang.Thread(show).start();

    }
}
