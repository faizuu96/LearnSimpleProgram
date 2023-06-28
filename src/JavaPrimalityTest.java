import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String n = bufferedReader.readLine();
            BigInteger num = new BigInteger(n);
            boolean isPrime = num.isProbablePrime(10);
            if(isPrime){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }catch(IOException e){
            System.err.println("Error Reading Input: "+e.getMessage());
        }catch (NumberFormatException e){
            System.err.println("Invalid Input Format: "+e.getMessage());
        }finally {
            try {
                bufferedReader.close();
            }catch (IOException e){
                System.err.println("Error cloasing BufferedReader: "+e.getMessage());
            }
        }
    }
}
