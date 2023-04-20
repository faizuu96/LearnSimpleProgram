import jdk.nashorn.internal.runtime.SharedPropertyMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraysDictionaryandMaps {
    public static void main(String[] args) {
        Map<String,String> engtoTamilDictionary = new HashMap<>();
        engtoTamilDictionary.put("Monday","Thingal");
        engtoTamilDictionary.put("Tuesday","Sevvaai");
        engtoTamilDictionary.put("Wednesday","Pudhan");
        engtoTamilDictionary.put("Thursday","Viyalan");
        engtoTamilDictionary.put("Friday","Velli");

        System.out.println(engtoTamilDictionary.get("Monday"));
        System.out.println(engtoTamilDictionary.get("Tuesday"));
        System.out.println(engtoTamilDictionary.get("Wednesday"));
        System.out.println(engtoTamilDictionary.get("Thursday"));
        System.out.println(engtoTamilDictionary.get("Friday"));
        System.out.println();

        System.out.println(engtoTamilDictionary.keySet());
        System.out.println();

        System.out.println(engtoTamilDictionary.containsKey("Thusday"));
        System.out.println();

        System.out.println(engtoTamilDictionary.values());
        System.out.println();

        System.out.println("The Size of our Dictionary is: "+engtoTamilDictionary.size());
        System.out.println();
        System.out.println();

        Map<String, Boolean> shoppingList = new HashMap<>();

        shoppingList.put("Maggie", true);
        shoppingList.put("Cookies", Boolean.FALSE);
        shoppingList.put("Juice", Boolean.TRUE);
        shoppingList.put("Rice", Boolean.TRUE);
        shoppingList.put("Oil", false);

        System.out.println(shoppingList.get("Juice"));
        System.out.println(shoppingList.get("Maggie"));
        System.out.println(shoppingList.isEmpty());
        System.out.println(shoppingList.toString());
        //shoppingList.clear();
        System.out.println(shoppingList.isEmpty());
        System.out.println(shoppingList.toString());
        System.out.println();
        shoppingList.remove("Maggie");
        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.replace("Juice",Boolean.FALSE));
        System.out.println(shoppingList.toString());








    }
}
