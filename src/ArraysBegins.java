
import java.util.Arrays;

public class ArraysBegins {
    public static void printArray(int[] array){
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            int A33 = array[i];
            System.out.print(A33);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void printArray(String[] array){
        System.out.print("[");
        for(int i=0;i<array.length;i++){
            String A33 = array[i];
            System.out.print(A33);
            if(i<array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String[] args) {
        int[] A1;
        int[] A2 = new int[4];
        int[] A3 = {2,5,9,6};
        String[] employee = {"Areef","Haja","Faisal"};
        A2[0]=2;
        A2[1]=3;
        A2[2]=7;
        A2[3]=5;

        System.out.println(Arrays.toString(A2));
        System.out.println(Arrays.toString(A3));
        System.out.println();

        printArray(A3);
        Arrays.sort(A3);
        printArray(A3);
        System.out.println();

        System.out.println(Arrays.toString(employee));
        printArray(employee);
    }
}