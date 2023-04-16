public class StarProgram {
    public static void main(String[] args) {
int i, j, k;
       for(i=1;i<=5;i++){
           for(j=5;j>=i;j--){
               System.out.print(" ");
           }for(k=0;k<=i-1;k++){
               if(k==1 && i==3){
                   System.out.print("F ");
               }else
               System.out.print("* ");
           }
           System.out.println();
       }
    }
}
