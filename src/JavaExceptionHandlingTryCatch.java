import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        try {
            int n = in.nextInt();
            int p = in.nextInt();
            int result = divide(n , p);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        }catch(InputMismatchException e){
            System.out.println("InputMismatchException");
        }
        in.close();
    }
    public static int divide(int n, int p){
        return n/p;
    }
}
