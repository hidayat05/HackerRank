import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * @owner hidayat
 * @since 11/29/16.
 */
public class DateAndTime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int year = in.nextInt();
        String dateResult = String.format("%d-%d-%d", year, month, day);
        Date date1 = null;
        try {
            date1 = new SimpleDateFormat("yyyy-M-d").parse(dateResult);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        String dayofWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date1);
        System.out.println(dayofWeek.toUpperCase());

    }
}
