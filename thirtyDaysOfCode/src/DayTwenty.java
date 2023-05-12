
    import java.io.*;
import java.util.*;
import java.util.stream.*;

    public class DayTwenty {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> a = Arrays.stream(bufferedReader.readLine().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int swaps = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (a.get(j) > a.get(j + 1)) {
                        int tmp = a.get(j);
                        a.set(j, a.get(j + 1));
                        a.set(j + 1, tmp);
                        swaps++;
                    }
                }
            }

            System.out.println("Array is sorted in " + swaps + " swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: " + a.get(n - 1));

            bufferedReader.close();
        }
    }

