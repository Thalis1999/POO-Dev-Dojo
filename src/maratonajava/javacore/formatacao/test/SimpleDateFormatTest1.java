package src.maratonajava.javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest1 {
    static void main() {
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
        try{
            System.out.println(sdf.parse("Amstredam 15 de Frebruary de 2021"));
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
