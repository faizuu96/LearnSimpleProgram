import java.util.Scanner;
/*
Given a range of 2 numbers (i.e) L and R count the number of prime numbers in the range (inclusive of L and R ).
        Input Size : L <= R <= 100000(complexity O(n) read about Sieve of Eratosthenes)
        Sample Testcase :
        INPUT
        2 5
        OUTPUT
        3
*/


public class Program4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int R = in.nextInt();
        int count = 0;
        for(int i=L;i<=R;i++){
            if(isPrime(i)){
                count++;
            }

        }
        System.out.print(count);

    }
    public static boolean isPrime(int n){
        if(n<1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
