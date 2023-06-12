import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JavaIterator {
    static Iterator func(ArrayList myList) {
        Iterator it = myList.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)
                break;
        }

        return it;
    }

    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i=0;i<n;i++){
            myList.add(in.nextInt());
        }
        myList.add("###");
        for(int i=0;i<m;i++){
            myList.add(in.next());
        }
        Iterator it = func(myList);
        while (it.hasNext()){
            Object element = it.next();
            System.out.println((String) element);
        }
    }
}