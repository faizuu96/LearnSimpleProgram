import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DayEleven {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int [][]arr = new int[6][6];
        int i, j;
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 6; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                    + arr[i + 1][j + 1]
                    + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxSum=Math.max(maxSum, sum);

            }
        }
        System.out.println(maxSum);
        in.close();
        }
    }



