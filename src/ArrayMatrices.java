import java.util.Scanner;

public class ArrayMatrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of matirix");
        int m =in.nextInt();
        int n = in.nextInt();
        int [][] a = new int[m][n];
        int [][] b = new int[m][n];
        int [][] sum = new int[m][n];
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                a[i][j]=in.nextInt();
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                b[i][j]=in.nextInt();
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
        sum[i][j]=a[i][j]*b[i][j];
        for(int i=0;i<m;i++){

            for(int j=0;j<n;j++)
        System.out.println(sum[i][j]+"\t");
            System.out.println();
                    }
                }
}