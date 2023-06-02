import java.util.Scanner;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        int l = S.length();

        while(start<end){
            char v = S.charAt(start);
            System.out.print(v);
            start++;
        }
    }
}
