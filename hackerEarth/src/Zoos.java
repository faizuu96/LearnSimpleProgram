import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Zoos {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String c =in.nextLine();
        int z = 0;
        int o = 0;
        for(int i = 0; i < c.length(); i++){
            if(c.charAt(i) == 'z')
                z++;
            else if(c.charAt(i) == 'o')
                o++;
        }
        System.out.println(2*z==o?"Yes":"No");
    }
}
