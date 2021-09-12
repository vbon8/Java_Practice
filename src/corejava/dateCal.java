package corejava;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class dateCal {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        SimpleDateFormat sd = new SimpleDateFormat("DD/MM/YYYY");
        //cal.getTime();

    /*    System.out.println("Calender formatted date: " + sd.format(cal.getTime()));

        System.out.println(cal.getTimeZone());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); */

        //Getting the current the date value
        LocalDate currentdate = LocalDate.now();
        System.out.println("Current Date " +currentdate);

        //Getting the current day
        int currentday = currentdate.getDayOfMonth();
        System.out.println(currentday);

        //Length of month
        int monthlen = currentdate.lengthOfMonth();
        System.out.println(monthlen);

        //Boolean
        boolean isleapyear = currentdate.isLeapYear();
        System.out.println("Is this year a leap year? : " +isleapyear);

    }
}
