package src.maratonajava.javacore.datas.test;

import java.time.DayOfWeek;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

public class ObterProximoDia implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays = 1;
        switch (dayOfWeek) {
            case FRIDAY -> {
                addDays = 3;
                break;
            }
            case SATURDAY ->{
                addDays = 2;
                break;
            }
            default -> {
                addDays = 1;
            }
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);
    }
}
