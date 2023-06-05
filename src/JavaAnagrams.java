import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {


       /* static boolean isAnagram(String a, String b) {
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


}*/


        static boolean isAnagram(String a, String b) {
            // Complete the function
            a = a.toLowerCase();
            b = b.toLowerCase();

            if(a.length() != b.length()){
                return false;
            }

            int[] freqA = new int[26];
            int[] freqB = new int[26];

            // Populate frequency array for string A
            for (char c : a.toCharArray()) {
                freqA[c - 'a']++;
            }

            // Populate frequency array for string B
            for (char c : b.toCharArray()) {
                freqB[c - 'a']++;
            }

            // Compare the frequency arrays
            for (int i = 0; i < 26; i++) {
                if (freqA[i] != freqB[i]) {
                    return false;
                }
            }

            return true;
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

