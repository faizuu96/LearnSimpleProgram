import java.util.Scanner;
public class DaySixteen {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            scan.close();

            try {
                int num = Integer.parseInt(s);
                System.out.println(num);
            } catch (NumberFormatException e) {
                System.out.println("Bad String");
            }
        }
    }