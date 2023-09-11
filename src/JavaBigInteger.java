import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();

        BigInteger one = new BigInteger(a);
        BigInteger two = new BigInteger(b);

        BigInteger sum = one.add(two);
        BigInteger multi = one.multiply(two);
        System.out.println(sum);
        System.out.println(multi);
    }

}
