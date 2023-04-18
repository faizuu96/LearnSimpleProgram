import jdk.internal.dynalink.beans.StaticClass;

public class Factorial {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return(n*factorial(n-1));
        }
    }

    public static void main(String[] args) {
        int num=4;
        int m;
        m=factorial(num);
        System.out.println(m);
    }
}
