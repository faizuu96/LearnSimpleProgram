import java.util.Scanner;

public class BinaryNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){

        a[i]=in.nextInt();
        in.nextLine();


        }
        for(int i=0;i<n;i++){
            String binary = Integer.toBinaryString(a[i]);
            System.out.print(binary +" ");
        }



    }
}
