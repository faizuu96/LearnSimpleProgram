import java.util.Scanner;
public class JavaMyRegex {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }


    }
}
class MyRegex{
    String pattern = "";
    public MyRegex(){
        pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
                +"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    }
}