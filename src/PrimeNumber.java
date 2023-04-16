import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number start");
        int start = s.nextInt();
        System.out.println("Enter the number end");
        int end = s.nextInt();
        System.out.println("The Prime Number Between " +start+" and "+end);

            for (int i = start; i <= end; i++) {
                if(isPrime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else {
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}