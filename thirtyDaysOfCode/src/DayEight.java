import java.util.Scanner;

public class DayEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n;i++){
            String name = in.next();
            int phone = in.nextInt();

        while(in.hasNext()) {
            String s = in.next();
            if(name==s){
                System.out.println(name+"="+phone);
            }
        }
        }
        in.close();
    }
}
