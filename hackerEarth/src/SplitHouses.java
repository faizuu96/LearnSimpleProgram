import java.util.*;


public class SplitHouses {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char m[] = s.toCharArray();
        int i = 0;
        for (i = 0; i < n - 1; i++) {
            if (m[i] == 'H' && m[i + 1] == 'H') {
                System.out.println("NO");
                break;
            }
            if (m[i] == '.') {
                m[i] = 'B';
            }
        }
        if (i == n - 1) {
            System.out.println("YES");
            for (int k = 0; k < m.length; k++)
                System.out.print(m[k] + "");
        }
    }
}