import java.util.*;
      /*Given 2 numbers N and K followed by N elements,print the number of repetition of K otherwise print '-1' if the element not found.
        Sample Testcase :
        INPUT
        6 2
        1 2 3 5 7 8
        OUTPUT
        0*/
public class Program9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int count=-1;
        boolean found=false;
        for(int i=1;i<=n;i++){
            int s = in.nextInt();
        if(s==k){
            count++;
            found=true;
        }
    }
        if (found) {
            System.out.println(count);
        }else{
            System.out.println(count);
        }


    }
}
