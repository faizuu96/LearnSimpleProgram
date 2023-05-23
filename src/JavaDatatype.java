import java.util.Scanner;

public class JavaDatatype {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                long x = in.nextLong();
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) ;
                System.out.println("* byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) ;
                System.out.println("* short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) ;
                System.out.println("* int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) ;
                System.out.println("* long");

            }catch(Exception e)
            {
                System.out.println(in.next()+"can't be fitted anywhere");
            }
        }
    }
}
