import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String [] arg){
        Scanner in = new Scanner(System.in);
        int lineNumber = 1;
        while(in.hasNextLine()){
            String line = in.nextLine();
            System.out.println(lineNumber+" "+line);
            lineNumber++;
        }
        in.close();
    }
}
