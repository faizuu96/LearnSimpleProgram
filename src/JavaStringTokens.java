import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        S=S.trim();
        if(S.isEmpty()){
            System.out.println(S.length());
        }else{
        String[] token = S.split("[\\s!,?.\\_'@]+");
        System.out.println(token.length);
            for (String loop : token) {
                System.out.println(loop);

            }
        }
    }
}

