import org.omg.CORBA.ORB;

import java.util.Scanner;

public class DayFour {
    private int age;
    public DayFour(int initialAge){
        if(initialAge<0){
            System.out.println("Age is not valid, setting age to 0.");
        }else{
            age=initialAge;
        }
    }
    public void amIOld(){
if(age<13){
    System.out.println("You are young");
}else if(age>=13 && age<18){
    System.out.println("You are a teenager");
}else{
    System.out.println("Your are old");
}
    }
    public void yearPasses(){
        age++;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=0;i<T;i++){
            int age = in.nextInt();
            DayFour dayFour = new DayFour(age);
            dayFour.amIOld();
            for (int j=0;j<3;j++){
                dayFour.yearPasses();
            }
            dayFour.amIOld();
            System.out.println();
        }
        in.close();
    }
}