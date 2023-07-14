import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MinimumNumberOfJumps {

        public static int minJumps(int[] arr) {
            int n = arr.length;
            int[] jumps = new int[n];
            jumps[0] = 0;

            if (n == 0 || arr[0] == 0) {
                return -1; // Not possible to reach the end
            }

            for (int i = 1; i < n; i++) {
                jumps[i] = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {
                    if (j + arr[j] >= i && jumps[j] != Integer.MAX_VALUE) {
                        jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    }
                }
            }

            return jumps[n - 1] != Integer.MAX_VALUE ? jumps[n - 1] : -1;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            scanner.close();

            int result = minJumps(arr);
            System.out.println("Minimum number of jumps required: " + result);
        }
    }


