import java.util.Scanner;
public class JavaStdInAndStdOut {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        double D = n.nextDouble();
        n.nextLine();
        String S = n.nextLine();
        System.out.println("String: "+S);
        System.out.println("Double: "+D);
        System.out.println("Int: "+N);
    }
}
