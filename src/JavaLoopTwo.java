import java.util.Scanner;

public class JavaLoopTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Read the number of test cases
        int t = in.nextInt();

        // Process each test case
        for (int i = 0; i < t; i++) {
            // Read the values of a, b, and n
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // Print the first n terms of the sequence
            int term = a + b;
            System.out.print(term);
            for (int j = 1; j < n; j++) {
                term = term + (int)Math.pow(2, j) * b;
                System.out.print(" " + term);
            }
            System.out.println();
        }

        // Close the scanner
        in.close();
    }

}
