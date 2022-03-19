public class basics {
    public static void main(String[] args){
        // variables
        String name = "Adel";
        char grade = 'A';
        byte age0 = '0'; // 8 bit signed
        short age1 = Short.parseShort("10"); // 16 bit
        int age2 = 20; // 32 bit signed
        long age3 = 30L; // 64 optionally signed
        float gpa0 = 3.8f; // 32-bit floating point
        double gpa2 = 3.9; // double 64 bit point
        boolean isTall; // 1 bit --> true/false
        int intFromString = Integer.parseInt("50");
        double doubleFromString = Double.parseDouble("50.99");
        int str_toInt = Integer.parseInt("3243");

        // [PRINT VARS]
        isTall = true;
        name = "adel a"; //
        System.out.println("Hello");
        System.out.println("your name is " + name); // Concatenate str
        System.out.printf("Your Name is %s \n", name); // print(f) %s == string

        // [MATHS]
        double results = gpa0 * gpa2;
        System.out.println(results);

        // [F-STRINGS]
        String name01 = "adel";
        //MessageFormat.format("my name is {0}", name01);
        // [CONVERTING DATA-TYPES]
        // [CASTING]
        System.out.println((int)3.14);
        System.out.println((double)3);

        System.out.println(intFromString * doubleFromString);
        System.out.println(100 + intFromString);
        System.out.println(100 + doubleFromString);
        // str to int/double
        System.out.println(str_toInt);

        // [CALL NEW METHOD]
        int loop_start = 0;
        int age = 22;
        String stringcall = "Adelly";
        String method_return = new_method_call(stringcall, 3);
        new_method();
        conditional(stringcall, age);
        for_loop(loop_start);
        System.out.println("Method_Return" + method_return);

        // [OBJECTS]
        catt cat_1 = new catt();
        cat_1.name = "frank";
        cat_1.age = 72;
        catt cat_2 = new catt();
        cat_2.name = "jessie";
        cat_2.age = 44;
        System.out.println("cat_1 age" + cat_1.name + cat_1.age);
        System.out.println("cat_2 age" + cat_2.name + cat_2.age);

        // [CALL-VOID OBJ] --> does not need obj for call
        System.out.println("Calling static void");
        catt.dog_noise();

    }
    // [NEW PRIVATE METHOD]
    private static void new_method(){
        System.out.println("new_method call");
    }

    private static String new_method_call(String stringcall, int age){
        System.out.println("hello " + stringcall + "i am " + age + "years old");
        return "hello " + stringcall + "i am " + age + "years old";
    }

    private static void conditional(String stringcall, int age){
        System.out.println("Conditional method");

        if (stringcall.equals("larry")){
            System.out.println("hi larry");
        }
        else if (stringcall.equals("adelly")){
            System.out.println("hi adelly");
        }
        else {
            System.out.println("Cannot Compute");
        }
    }
    private static void for_loop(int loop_start){
        System.out.println("starting loop on val" + loop_start);
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}


// to run java program
// javac App.java
// java App
// public static main --> main method
/*	*** [FOR printf()]
	/%f --> double or float
	%d --> integer
	%s --> string
	%c --> character
	%b --> boolean
*/
