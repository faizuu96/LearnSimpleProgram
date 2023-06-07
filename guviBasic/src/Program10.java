import java.util.Scanner;

    /*Program 10
    Given 2 numbers N and K followed by N elements,print the number of repetition of K otherwise print '-1' if the element not found.
    Sample Testcase :
    INPUT
    6 2
    1 2 3 5 7 8
    OUTPUT
    0*/
         public class Program10 {
           public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

              int N = scanner.nextInt();
              int K = scanner.nextInt();
              int[] elements = new int[N];

              for (int i = 0; i < N; i++) {
                elements[i] = scanner.nextInt();
            }

              int count = -1;
              boolean found = false;

              for (int i = 0; i < N; i++) {
                if (elements[i] == K) {
                    count++;
                    found = true;
                }
            }

              if (found) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
        }
    }

