import java.util.Locale;
import java.util.Scanner;

public class StringIntroduction {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        int C = A.length();
        int D = B.length();
        int n = A.compareTo(B);



        System.out.println(C + D);
        if(n>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String E = A.substring(0,1).toUpperCase() + A.substring(1);
        String F = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(E+" "+F);

    }
}
