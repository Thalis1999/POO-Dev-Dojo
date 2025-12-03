package src.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest1 {
    static void main() {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022-08-06");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        LocalDateTime ldt1 = date.atTime(time);
    }
}
