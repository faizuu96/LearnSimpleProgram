import java.sql.SQLOutput;
import java.util.Scanner;

public class MaximumSteps {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        boolean notEqual = true;
        int count = 0;

        a[0]= in.nextInt();
        int min = a[0];

        for(int i=1;i<n;i++){
            a[i]=in.nextInt();
            min=Math.min(min,a[i]);
        }
        for(int i=0;i<n;i++)
            b[i]= in.nextInt();

        while(notEqual){
            notEqual=false;
            for (int i=0;i<a.length;i++){
                while(a[i]>min && b[i]!=0){
                    a[i]=a[i]-b[i];
                    count++;
                    notEqual=true;
                }
                min=Math.min(min,a[i]);
                if(min<0)break;
            }
        }
        System.out.println(min<0?-1:count);

    }
}
