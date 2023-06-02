import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*String original,reverse="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        original = s.nextLine();
        int length = original.length();
        for(int i= length-1;i>=0;i--) {
            reverse = reverse + original.charAt(i);
        }
            if(original.equals(reverse)){
                System.out.println("Enter the value is palindrome");
            }else{
                System.out.println("Enter the value is not palindrome");*/

        Scanner in = new Scanner(System.in);
        String A = in.next();
        int l = A.length();
        boolean isPalindrome = true;
        for(int i=l-1;i>=0;i--) {

            char r = A.charAt(i);
            if (r != A.charAt(l - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        in.close();
            }

}
