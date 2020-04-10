package Lab_4;

import java.util.Calendar;

public class Primer_2 {
    public static void main(String[] args){
        Calendar date1 = Calendar.getInstance();
        int year = date1.get(Calendar.YEAR);
        int month = date1.get(Calendar.MONTH);
        int day = date1.get(Calendar.DAY_OF_MONTH);
        int hour = date1.get(Calendar.HOUR);
        int minute = date1.get(Calendar.MINUTE);
        int second = date1.get(Calendar.SECOND);
        System.out.println("Nikita Tsarkov");
        System.out.printf("Now %4d-%02d-%02d %02d:%02d:%02d\n", year, month+1, day, hour, minute, second);
    }
}
