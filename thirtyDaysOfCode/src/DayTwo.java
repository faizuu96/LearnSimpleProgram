import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayTwo {
    //This Helps to understand POS Calculation
    //Total, ServiceTax, GSTTax
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double totalAmount = Double.parseDouble(in.readLine());
        int serviceTax = Integer.parseInt(in.readLine());
        int gstTax = Integer.parseInt(in.readLine());
        double serviceTaxs = totalAmount * serviceTax/100 ;
        double gstTaxs = totalAmount * gstTax/100;
        //simpleWay
        int temp = (int) Math.round(totalAmount + serviceTaxs + gstTaxs);
        //otherWay
        //double temp = totalAmount + serviceTaxs + gstTaxs;
        //int netTotal = (int)temp;
        System.out.println(temp);
    }
}
