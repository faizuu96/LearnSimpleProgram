import java.util.Scanner;
/*
Find the minimum among 10 numbers.
        Sample Testcase :
        INPUT
        5 4 3 2 1 7 6 10 8 9
        OUTPUT
        1
*/
public class Program5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<10;i++){
            int n = in.nextInt();
            if(n<min){
                min=n;
            }
        }
        System.out.println(min);
    }
}
