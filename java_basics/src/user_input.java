import java.util.Scanner;
/*
    * nextLine() --> string
    * nextInt() --> int
    *
* */
public class user_input {
    public static void main(String[] args){

        // VARS
        String name;
        int age;
        float shoeSize;

        // OBJ
        Scanner scanner = new Scanner(System.in);

        // INPUT
        System.out.println("Please enter your name ");
        name = scanner.nextLine();
        System.out.println("Please enter your age ");
        age = scanner.nextInt();
        // float float_age = Float.parseFloat(age);
        System.out.println("Please enter your shoe size ");
        shoeSize = scanner.nextFloat();

        // PRINT
        System.out.println("[name] " + name);
        System.out.println("[age] " + age );
        System.out.println("[float_age] " + float_age );

        System.out.println("[shoe size] " + shoeSize);

        scanner.close();

    }
}
