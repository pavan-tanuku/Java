package Java.DSA.Mathematics;
import java.lang.*;
import java.util.Scanner;

//Test cases:
//I/p: n = 4
//O/p: 24
//I/p: n = 6
//O/p: 720
//I/p: n = 0
//O/p: 1

public class Factorial {

    public static int factorial1(int num) {
        System.out.println("Best algorithm: ");
        int res = 1;
        for(int i = 2; i <= num; i++)
            res *= i;
        return res;
    }

    public static int factorial2(int num) {
        if(num == 1)
            return 1;
        return (num * factorial2(num - 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        int fact1 = factorial1(num);
        System.out.println("The factorial of a number " + num + " is: " + fact1);
        System.out.println();

        System.out.println("Recursively algorithm (Bad algorithm): ");
        int fact2 = factorial2(num);
        System.out.println("The factorial of a number " + num + " is: " + fact2);
        scan.close();
    }
}
