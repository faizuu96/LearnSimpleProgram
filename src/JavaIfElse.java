import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class JavaIfElse {
    public static void main(String[] args) {
        //Java If else

      /*  If  is odd, print Weird
        If  is even and in the inclusive range 2 of 5 to , print Not Weird
        If  is even and in the inclusive range of  6 to 20 , print Weird
        If  is even and greater than 20 , print Not Weird*/

        Scanner n = new Scanner(System.in);
        int N = n.nextInt();

        if(N%2==1){
            System.out.println("Weird");
        }else if(N>=2 && N<=5){
            System.out.println("Not Weird");
        }else if (N>=6 && N<=20){
            System.out.println("Weird");
        }else if(N>20){
            System.out.println("Not Weird");
        }
        n.close();
    }
}
