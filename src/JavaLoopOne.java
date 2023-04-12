import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaLoopOne {
    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String S = b.readLine();
        int N = Integer.parseInt(S);
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n",N,i,N*i);
        }
        b.close();
    }
}
