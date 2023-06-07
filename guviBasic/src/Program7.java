import java.util.Scanner;
/*Write a program to print the sum of the first K natural numbers.
        Input Size : n <= 100000
        Sample Testcase :
        INPUT
        3
        OUTPUT
        6*/
public class Program7 {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = +sum + i;
            }
            System.out.println(sum);
        }
}
