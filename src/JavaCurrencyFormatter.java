import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
   // Input/Output
   /* 12324.134
    US: $12,324.13
    India: Rs.12,324.13
    China: ￥12,324.13
    France: 12 324,13 €*/
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double value = in.nextDouble();
       in.close();

       NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
       String usCurrency = usFormat.format(value);

       DecimalFormat indFormat = new DecimalFormat("'Rs.'###,###.00");
       String indCurrency = indFormat.format(value);

       NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
       String chinaCurrency = chinaFormat.format(value);

       NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
       String franceCurrency = franceFormat.format(value);

       System.out.println("US: " + usCurrency);
       System.out.println("India: " + indCurrency);
       System.out.println("China: " + chinaCurrency);
       System.out.println("France: " + franceCurrency);


   }


}
