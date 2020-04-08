package Lab_4;

import java.util.Calendar;

public class Pimer_2 {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);
        int second = cal.get(Calendar.SECOND);
        System.out.printf("Now %4d %02d %02d %02d:%02d:%02d\n", year, month+1, day, hour, minute, second);
    }
}
