import java.util.Arrays;

public class enum_tutorial {
    public static void main(String[] args){
        // [CREATE ENUM OBJ FROM enumbneration_days.java]
        enumerations_days day = enumerations_days.friday;
        // [To Print Enums in list view]
        System.out.println(Arrays.toString(enumerations_days.values()));
        System.out.println(enum_with_vals.CAPTAIN_CRUNCH.cereal_score);

        // [ENUM CONDITIONALS]
        if (day == enumerations_days.friday){
            System.out.println("day is friday");
        }else{
            System.out.println("Not equal");
        }

        // [LOOP THROUGH ENUM]
        for(enumerations_days current_day : enumerations_days.values()){
            System.out.println(current_day);
        }
    }
}
