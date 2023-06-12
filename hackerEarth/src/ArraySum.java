
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long sum = 0;
        int n = in.nextInt();
        int [] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();

        }
        for(int i = 0;i<ar.length;i++){
            sum += ar[i];
        }
           System.out.println(sum);

    }
}
