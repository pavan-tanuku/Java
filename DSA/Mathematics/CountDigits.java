package Java.DSA.Mathematics;
import java.util.Scanner;

//Test cases:
// I/p : x : 9234
// O/p : 4
//
// I/p : 38
// O/p : 2
//
// I/p: 7
// O/p : 1


public class CountDigits {
    static int countDigits(int x) {
        int res = 0;
        while(x > 0) {
            x /= 10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of test cases: ");
        int testCases = scan.nextInt();
        while(testCases-- > 0) {
            System.out.print("Enter the x in " + testCases + " iteration: ");
            int x = scan.nextInt();
            System.out.println("The no of digits in the " + x + " is: " + countDigits(x));
        }
        scan.close();
    }
}
