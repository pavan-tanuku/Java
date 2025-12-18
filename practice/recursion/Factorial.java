package Java.practice.recursion;

import java.util.Scanner;

public class Factorial {

    static void factorial(int limit) {
        if(limit == 0) {
            return;
        }
        System.out.println("The number is: " + limit);
        factorial(limit - 1);
    }

    static void factorial2(int limit) {
        if(limit == 0) {
            return;
        }
        factorial2(limit - 1);
        System.out.println("The number is: " + limit);
    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter the limit: ");
//        byte limit = scan.nextByte();
        int limit = 5;
        System.out.println("The tail recursion.");
        factorial(limit);
        System.out.println("The head recursion.");
        factorial2(limit);
//        System.out.println("The factorial of a given number " + limit + " is: " + result);
//        scan.close();
    }
}
