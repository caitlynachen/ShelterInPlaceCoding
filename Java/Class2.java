import java.util.Scanner;

public class Class2 {

    public static void main(String[] args) {
        /*
        Runtime Error:
         Zero division error
        int zero_division = a / zero;
        System.out.println(zero_division);
        */
        // go over camel casing
        // quick hw review
        // review from concepts from last class
        int myAge = 19;
        int yourAge = 25;

        int d = 5;
        int c = 3;
        d *= c;

        System.out.println(d);

        a = 10;
        b = 3;
        System.out.println(a % b);

        boolean isHappy = true;

        // can be useful when looking at strings
        char e = 'c';

        System.out.println("This apple costs " + a + " dollars");

        String str = "This is a string.";
        // explain index in java (0 is first letter)
        String new_str = str.substring(10, 16);
        System.out.println(new_str);

        String anotherStr = "Another string";
        str += anotherStr;

        // indexes start from 0
        //returns index of the first char/string
        //char at only does for chars
        System.out.println(str.indexOf("str"));
        // returns int of string length
        System.out.println(str.length());

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("My name is " + name);

        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("My age is " + age);

        /*
        if (sc.hasNextInt()) {
            int age = sc.nextInt() ;
            System.out.println(age);
        } else {
            System.out.println("Sorry, couldn't understand you!");
        }
        */

    }
}