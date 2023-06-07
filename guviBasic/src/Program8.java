import java.util.Scanner;

/*Given a number N, print 'yes' if it is composite else print 'no'.
        Sample Testcase :
        INPUT
        123
        OUTPUT
        yes*/


public class Program8 {
    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isComposite = false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isComposite=true;
                break;
            }
        }if(isComposite){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
