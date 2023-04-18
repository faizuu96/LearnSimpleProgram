import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original,reverse="";
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
                System.out.println("Enter the value is not palindrome");
            }
        }



}
