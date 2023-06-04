
import java.util.Arrays;
import java.util.Scanner;

public class JavaSubstringComparison {
    public static void main(String[] args) {
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


    }
}
