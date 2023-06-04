
import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparison {
    /*public static void main(String[] args) {
        String min="";
        String max="";
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        int k=scan.nextInt();

        int len=s.length()-k+1;
        String data[]=new String[len];

        for(int i=0;i<len;i++){
            String sub=s.substring(i,i+k);
            data[i]=sub;
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(data[j].compareTo(data[i])<0){
                    min=data[j];
                    data[j]=data[i];
                    data[i]=min;
                }
            }
        }
        min=data[0];
        max=data[len-1];
        System.out.print(min+"\n"+max);


    }*/

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Initialize smallest and largest with the first substring of length 'k'
        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        // Compare all the remaining substrings of length 'k'
        for (int i = 1; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);

            // Compare substr with the current smallest and largest substrings
            if (substr.compareTo(smallest) < 0) {
                smallest = substr; // Update smallest if substr is lexicographically smaller
            }
            if (substr.compareTo(largest) > 0) {
                largest = substr; // Update largest if substr is lexicographically larger
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

}
