package src.maratonajava.javacore.datas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest1 {
    static void main() {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());  // 99 999 999 nanossegundos

    }
}
