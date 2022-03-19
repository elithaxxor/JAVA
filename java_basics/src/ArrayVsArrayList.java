import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;


public class ArrayVsArrayList {
    @SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
    public static void main(String[] args){
        try {
            System.out.println("arrays vs array list");
            // [ARRAY] --> static size [can hold anything (objects and vars)]
            // first declare array size
            String[] friendsArray = new String[4];
            String[] friendsArray2 = {"john", "frank", "del", "pablo"};

            System.out.println(friendsArray2[1]); // [GET VALUE]
            System.out.println(friendsArray.length);

            // set index
            System.out.println("SETTING STATIC INDEXES");
            friendsArray[0] = "SNAKE";
            System.out.println(Arrays.toString(friendsArray2)); // [PRINT STATIC ARRAY]
            System.out.println(friendsArray2[0]);

            // [ARRAY-LIST] --> dynamic size [can only hold objects]
            ArrayList<String> friendsArrayList = new ArrayList<>();
            ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("john", "frank", "del", "pablo"));
            System.out.println(friendsArrayList2.get(1));
            System.out.println(friendsArrayList2.size()); // [GET SIZE LEN]
            friendsArrayList2.add("JAGUAR"); // [ADD INDEX]
            friendsArrayList2.remove("del"); // [REMOVE INDEX] --> can speecify obj. name or index position

            System.out.println(friendsArrayList);
            System.out.println(friendsArrayList.get(4)); // [GET INDEX]
        }
        catch(NullPointerException e) {
            System.out.println("Error at " + e);
        }
    }
}
