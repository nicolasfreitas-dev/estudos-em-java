package javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // SEGUE DUAS ISOs --> LINGUA, PAÍS
        Locale localeItaly = new  Locale("it", "IT");
        Locale localeCH = new  Locale("it", "CH");
        Locale localeIndia = new  Locale("hi", "IN");
        Locale localeJapan = new  Locale("ja", "JP");
        Locale localeHolanda = new  Locale("nl", "NL");
        Calendar cal = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);

        System.out.println("Itália: " + df1.format(cal.getTime()));
        System.out.println("Suíça: " + df2.format(cal.getTime()));
        System.out.println("India: " + df3.format(cal.getTime()));
        System.out.println("Japão: " + df4.format(cal.getTime()));
        System.out.println("Holanda: " + df5.format(cal.getTime()));

        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeJapan.getDisplayCountry(Locale.JAPAN));
    }
}
