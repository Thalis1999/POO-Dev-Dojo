package src.maratonajava.javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest1 {
    static void main() {
        // Classe abstrata nao instancia obj
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana.");
        }
        System.out.println(Calendar.DAY_OF_WEEK);
        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(Calendar.DAY_OF_YEAR);
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);

        c.add(Calendar.DAY_OF_MONTH, 2); //add 2 hrs
        Date date = c.getTime();
        System.out.println(date);
    }
}
