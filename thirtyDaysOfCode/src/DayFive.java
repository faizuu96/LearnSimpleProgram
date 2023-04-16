import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayFive {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        int n =Integer.parseInt(s);
        for(int i=1;i<=10;i++) {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }
}
