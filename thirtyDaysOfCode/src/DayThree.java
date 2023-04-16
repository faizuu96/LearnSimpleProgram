import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayThree {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(b.readLine());
        if(N%2==1){
            System.out.println("Weird");
        } else if(N>=2 && N<=5){
            System.out.println("Not Weird");
        }else if(N>=6 && N<=20) {
            System.out.println("Weird");
        }else if(N>20) {
            System.out.println("Not Weird");
        }
    }
}
