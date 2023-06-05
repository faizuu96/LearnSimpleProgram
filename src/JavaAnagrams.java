import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {


        static boolean isAnagram(String a, String b) {
            // Complete the function
            a = a.toLowerCase();
            b = b.toLowerCase();

            if(a.length() != b.length()){
                return false;
            }
            char[] achars = a.toCharArray();
            char[] bchars = b.toCharArray();

            Arrays.sort(achars);
            Arrays.sort(bchars);

            return Arrays.equals(achars,bchars);

        }

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            String a = scan.next();
            String b = scan.next();
            scan.close();
            boolean ret = isAnagram(a, b);
            System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        }


}
