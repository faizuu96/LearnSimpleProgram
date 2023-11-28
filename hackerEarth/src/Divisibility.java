import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] =in.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = (temp * 10) + arr[i] % 10;
        }
        if (temp % 10 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        }
    }

