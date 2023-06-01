import java.io.*;
import java.util.*;
class Result {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
    public static String findDay(int month, int day, int year) {

        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month - 1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] weekdays = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY"};

        return weekdays[dayOfWeek - 1];
    }
}
public class JavaDateAndTime {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));



        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        System.out.println(res);

        bufferedReader.close();

    }
}
