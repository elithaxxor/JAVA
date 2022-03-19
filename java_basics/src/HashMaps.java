import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

public class HashMaps {
    public static void main(String[] args){
        /* HashMaps require primative or fully wrapped wrappers <Integer> rather than <Int> */
        System.out.println("Hash Maps");
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("John", 232);
        empIds.put("Jerry", 211);
        empIds.put("Jack", 3245);
        System.out.println(empIds);

        System.out.println(empIds.get("John")); // [GET]
        System.out.println(empIds.containsKey("Jerry")); // [CONTAINS--> KEY]
        System.out.println(empIds.containsValue(3245)); // [CONTAINS--> VAL]

        // REPLACE VS PUT
        // PUT --> ADDS KEY VALUE AND UPDATES MAP
        // REPLACE --> REPLACES KEY/VAL PAIR
        empIds.put("Jonathin", 4242);
        empIds.replace("Jerry", 2324);
        empIds.putIfAbsent("STEVEN", 345525);
        System.out.println(empIds);

    }
}