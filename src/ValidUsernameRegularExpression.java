import java.util.Scanner;


class UserNameValidate{
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

public class ValidUsernameRegularExpression {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        while(n-- !=0){
            String userName = in.nextLine();
            if(userName.matches(UserNameValidate.regularExpression)){
                System.out.println("Valid");
            } else{
                System.out.println("Invalid");
            }
        }
    }
}
