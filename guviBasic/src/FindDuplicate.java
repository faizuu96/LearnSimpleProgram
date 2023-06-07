import java.util.*;

public class FindDuplicate {
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
