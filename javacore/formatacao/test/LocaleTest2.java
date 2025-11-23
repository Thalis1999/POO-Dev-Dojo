package javacore.formatacao.test;

import java.util.Locale;

public class LocaleTest2 {
    static void main() {
        // config atual de linguagem
        System.out.println(Locale.getDefault());
        String[] isoCountries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for (String isoLanguage: isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        System.out.println();
        for (String isoCountry: isoCountries) {
            System.out.print(isoCountry + " ");
        }

    }
}
