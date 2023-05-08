import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class DayTwentyEight {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(bufferedReader.readLine().trim());
        List<String> names = new ArrayList<>();

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];
            String emailID = firstMultipleInput[1];

            // Check if the email ID contains "@gmail"
            if (emailID.contains("@gmail")) {
                names.add(firstName);
            }
        }

        bufferedReader.close();

        // Sort and print the names
        Collections.sort(names);
        for (String name : names) {
            System.out.println(name);
        }
    }

}

