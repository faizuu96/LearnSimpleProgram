import java.util.Scanner;

public class DayNine {
    public static int fatorial(int n){
        if(n==0){
            return 1;
        }else{
            return(n*fatorial(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Factorial Number: ");
        int n = in.nextInt();
        int sum = fatorial(n);
        System.out.println(sum);

    }
}
