import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("=============================");
        //for loop using for number of time we enter the input
        //In case if we enter n number of times , use while(n.hasnext()){}
        for(int j=0;j<3;j++){
            String s = n.next();
            int i = n.nextInt();
            System.out.printf("%-15s%03d\n",s,i);
        }
        System.out.println("=============================");
    }
}
