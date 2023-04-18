import java.util.Scanner;

public class DaySix {
    //input: abcd
    //output:ac bd
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numString = in.nextInt();
    int i,j;
for(i=0;i<numString;i++){
    String s = in.next();
    String even = "";
    String odd = "";
    for(j=0;j<s.length();j++){
        if(j%2==0){
            even += s.charAt(j);
        }else{
            odd += s.charAt(j);
        }
    }
    System.out.println(even + " " + odd);
}
    }
}

