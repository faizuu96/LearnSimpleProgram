import java.util.Scanner;
/*
Write a code to get an integer N and print the even values from 1 till N in a separate line.

        Input Description:
        A single line contains an integer N.

        Output Description:
        Print the even values from 1 to N in a separate line.

        Sample Input :
        6
        Sample Output :
        2
        4
        6
*/
public class Program6 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i=1;i<=n;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
}
