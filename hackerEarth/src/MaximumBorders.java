import java.util.Scanner;

public class MaximumBorders {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt(); // Number of test cases
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < t; i++) {
                int rows = scanner.nextInt();
                int cols = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                char[][] matrix = new char[rows][cols];
                for (int j = 0; j < rows; j++) {
                    String line = scanner.nextLine();
                    String[] split = line.split(" ");
                    for (int k = 0; k < cols; k++) {
                        matrix[j][k] = split[k].charAt(0);
                    }
                }

                int maxBorder = getMaxBorder(matrix, rows, cols);
                System.out.println(maxBorder);
            }

            scanner.close();
        }

    private static int getMaxBorder(char[][] matrix, int rows, int cols) {
        int maxBorder = 0;

        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '#') {
                    count++;
                } else {
                    count = 0;
                }
                maxBorder = Math.max(maxBorder, count);
            }
        }

        for (int j = 0; j < cols; j++) {
            int count = 0;
            for (int i = 0; i < rows; i++) {
                if (matrix[i][j] == '#') {
                    count++;
                } else {
                    count = 0;
                }
                maxBorder = Math.max(maxBorder, count);
            }
        }

        return maxBorder;
        }
    }
