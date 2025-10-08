package Java.DSA.Mathematics;
import java.lang.*;
import java.util.Scanner;

//Test cases:
//I/p: a = 4, b = 6
//O/p: 2
//I/p: a = 100, b = 200
//O/p: 100
//I/p: a = 7, b = 13
//O/p: 1

public class GCD {

    private static int naiveAlgo(int a, int b) {
        int res = Math.min(a, b);
        while(res > 0) {
            if(a % res == 0 && b % res == 0)
                break;
            res--;
        }
        return res;
    }

    private static int euclideanAlgo1(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) a %= b;
            else b %= a;
        }
        if(a == 0) return b;
        else return a;
    }

    private static int euclideanAlgo2(int a, int b) {
        if(b == 0)
            return a;
        else
            return euclideanAlgo2(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number a & b: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println();
        System.out.println("Using Naive Solution(worst algorithm): ");
        int algo1 = naiveAlgo(a, b);
        System.out.println("The GCD of the number " + a + " & " + b + " is: " + algo1);
        System.out.println();
        System.out.println("Using Euclidean Algorithm(By Striver using loop): ");
        int algo2 = euclideanAlgo1(a, b);
        System.out.println("The GCD of the number " + a + " & " + b + " is: " + algo2);
        System.out.println();
        System.out.println("Using Euclidean Algorithm(By tutorial sir using recursion): ");
        int algo3 = euclideanAlgo2(a, b);
        System.out.println("The GCD of the number " + a + " & " + b + " is: " + algo3);
        scan.close();
    }
}
