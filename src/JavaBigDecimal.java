import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = in.next();
        }

        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; ++j) {
                BigDecimal a = new BigDecimal(s[j + 1]);
                BigDecimal b = new BigDecimal(s[j]);

                if (a.compareTo(b) > 0) {
                    String temp = s[j + 1];
                    s[j + 1] = s[j];
                    s[j] = temp;
                }
            }
        }
            for (int i = 0; i < n; i++) {
                System.out.println(s[i]);
            }
        }
    }

