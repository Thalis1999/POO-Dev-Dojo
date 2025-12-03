package src.maratonajava.javacore.datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest1 {
    static void main() {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(1999, Month.JUNE, 4);
        System.out.println(date);
        LocalDate agora = LocalDate.now();
        agora = agora.plusWeeks(4); // nova var refer. pois cria outro objeto
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.lengthOfMonth()); // quantos dias tem o mês
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
    }
}
