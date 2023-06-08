public class JavaFibonacci {
    static int n1=0,n2=1,temp;
    public static void printFibonacci(int n){
        if(n>0){
            temp = n1+n2;
            n1=n2;
            n2=temp;
            System.out.print(" "+temp);
            printFibonacci(n-1);

        }
    }

    public static void main(String[] args) {
        int n=10;
        System.out.print(n1+" "+n2);
        printFibonacci(n-8);
    }
}
