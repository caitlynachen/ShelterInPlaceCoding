package com.company;
import java.util.Scanner;

public class Class1 {

    public static void main(String[] args) {
	// write your code here
        // STRONGLY TYPED - COMPILED LANGUAGE
        System.out.println("Hello World!");
        // The value stored in a variable can be changed during program execution.
        //A variable is only a name given to a memory location, all the operations done on the variable effects that memory location.
        //In Java, all the variables must be declared before use.
        int a = 1;
        int b = 2;
        int zero = 0;
        int sum = a + b;
        /*
        Compile Time Errors:
        cannot change types to variable
         Incompatible types
        a = 3.0;
         Syntax Error
        A = 3;
        */
        //int rounds down
        System.out.println(a / b);
        System.out.print(a % b);
        System.out.print(a ^ b);
        /*
        Runtime Error:
         Zero division error
        int zero_division = a / zero;
        System.out.println(zero_division);
        */

        System.out.println(sum);

        double c = 1.5;
        double d = 2.4;
        double dSum = c + d;
        d = 1;
        d++;
        d *= c;

        System.out.println(dSum);

        boolean isHappy = true;

        char e = 'c';

        System.out.println("This apple costs " + a + " dollars");

        String str = "This is a string.";
        String new_str = str.substring(10, 16);
        System.out.println(new_str);

        String another_str = "Another string";
        str += another_str;

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
