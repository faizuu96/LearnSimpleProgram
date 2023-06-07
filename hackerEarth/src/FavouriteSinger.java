import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FavouriteSinger{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int nos=sc.nextInt();
        String [] arr=new String[nos];
        for(int i=0;i<nos;i++)
        {
            arr[i]=sc.next();
        }

        TreeMap<String,Integer> t1=new TreeMap();
        for (int i = 0; i < arr.length; i++) {
            if (!t1.containsKey(arr[i]))
            {
                t1.put(arr[i], 1);
            }
            else
            {
                int x=t1.get(arr[i]);
                x++;
                t1.put(arr[i], x);
            }
        }
        int maxValueInMap = (Collections.max(t1.values()));
        int count=0;
        for (Map.Entry<String, Integer> entry :              t1.entrySet())
        {               if (entry.getValue() == maxValueInMap)
        {                                   count++;
        }
        }
        System.out.println(count);
    }
}