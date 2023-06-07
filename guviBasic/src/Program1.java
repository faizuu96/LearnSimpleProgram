import java.util.Scanner;

/*Given 2 numbers N and K followed by elements of N .Print 'yes' if K exists else print 'no'.
        Sample Testcase :
        INPUT
        4 2
        1 2 3 3
        OUTPUT
        yes*/
public class Program1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();

        boolean found = false;
        for(int i=0;i<N;i++){
            int S = in.nextInt();
            if(S==K){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
