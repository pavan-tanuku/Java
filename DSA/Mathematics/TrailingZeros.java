package DSA.Mathematics;
import java.lang.*;
import java.util.Scanner;
//Test cases:
//I/p: n = 5  => 1*2*3*4*5 = 120 ==> 1 trailing zero
//O/p: 1
//I/p: n = 10
//O/p: 2
//I/p: n = 100
//O/p: 24

public class TrailingZeros {

    public static int worstMethod(int num) {
        long fact = 1;
        if(num > 20) return -1;
        for(int i = 2; i <= num; i++)
            fact *= i;
        int res = 0;
        while(fact % 10 == 0) {
            res++;
            fact /= 10;
        }
        return res;
    }

    public static int bestMethod(int num) {
        int res = 0;
        for(int i = 5; i <= num; i *= 5) {
            res += (num / i); // adding floor value
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Computing the Trailing zeros of a factorial:");
        System.out.println();
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        System.out.println("Model-1: Naive Method (works unto 20!)");
        int method1 = worstMethod(num);
        System.out.println("The no of trailing zeros in the " + num + " is: " + method1);
        System.out.println();
        System.out.println("Method-2: Efficient Algorithm (works for any number)");
        int method2 = bestMethod(num);
        System.out.println("The no of trailing zeros in the " + num + " is: " + method2);
        scan.close();
    }
}
