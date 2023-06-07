import java.util.Scanner;
/*Write a code to get 2 integers A and N. Print the integer A, N times in separate line.

        Input Description:
        First line contains an integer A. Second line contains an Integer N.

        Output Description:
        Print the integer A, N times in a separate line.

        Sample Input :
        2 3
        Sample Output :
        2
        2
        2*/

public class Program3 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int A = obj.nextInt();
        int N = obj.nextInt();

        for(int i=0;i<N;i++){
            System.out.println(A);
        }
    }
}
