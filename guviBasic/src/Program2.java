import java.util.Scanner;
/*Write a code to get the input and print it 5 times.

        Input Description:
        A single line contains an integer N.

        Output Description:
        Output contains 5 lines with each line having the value N.

        Sample Input :
        4
        Sample Output :
        4
        4
        4
        4
        4*/
public class Program2 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=0;i<5;i++){
            System.out.println(N);
        }
    }
}
