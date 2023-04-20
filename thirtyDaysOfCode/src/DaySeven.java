import java.util.Scanner;

public class DaySeven {
    //input
    //4
    //1 2 3 4
    //output
    //4 3 2 1
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
 int n = in.nextInt();
 int[] ar;//declare
 ar=new int[n];//allocate
for(int i=0;i<n;i++){
    ar[i] = in.nextInt();//initialize a array input
}for(int i=0;i<n/2;i++){
    int temp = ar[i];
    ar[i]= ar[n-1-i];
    ar[n-1-i] = temp;
        }
System.out.print("[");
        for(int i=0;i<n;i++){
            System.out.print(ar[i]);
            if(i<n-1){
                System.out.print(", ");
            }
    }
        System.out.print("]");
    }
}



