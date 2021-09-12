package corejava;
import java.text.SimpleDateFormat;
import java.util.Date;


public class date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.toGMTString());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/yyyy/DD");
        String formatted_date = sdf.format(d);
        System.out.println("Formatted Date "+formatted_date);

        SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy/DD hh:mm:ss");
        String formatted_date2 = sdf2.format(d);
        System.out.println("Formatted Date "+formatted_date2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
        String formatted_date3 = sdf3.format(d);
        System.out.println("Formatted Date "+formatted_date3);
    }
}
