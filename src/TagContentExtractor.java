import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = Integer.parseInt(in.nextLine());
        while (s>0){
            String n = in.nextLine();
            Pattern pattern = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(n);
            boolean foundMatcher = false;
            while (matcher.find()){
                System.out.println(matcher.group(2));
                foundMatcher = true;
            }if(!foundMatcher){
                System.out.println("None");
            }
            s--;
        }
        in.close();
    }
}
