import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DayEight {

        /*input
3
sam 99912222
tom 11122222
harry 12299933
sam
edward
harry

output
sam=99912222
Not found
harry=12299933
        */
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of custoer details in phone book:");
        int n = in.nextInt();

        Map<String, Integer> phoneBook = new HashMap<>();

        for(int i=0;i<n;i++){
            String name1 = in.next();
            int number1 = in.nextInt();
            phoneBook.put(name1,number1);
        }
        while (in.hasNext()){
            String name2 = in.next();
            Integer number2 = phoneBook.get(name2);
            if(number2 != null){
                System.out.println(name2+"="+number2);
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
