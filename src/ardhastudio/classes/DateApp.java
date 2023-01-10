package ardhastudio.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        Date tanggal =  new Date();
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.HOUR_OF_DAY, 13);

        Date hasil = calendar.getTime();
        System.out.println(hasil);
    }
}
