package Java.DSA.Mathematics;

//Test cases:
//I/p: n = 78987;
//O/p: YES
//
//I/p: n = 8668;
//O/p: YES
//
//I/p: n = 8;
//O/p: YES
//
//I/p: n = 21;
//O/p: NO
//
//I/p: n = 367;
//O/p: NO

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PalindromeNumber {

    boolean isPal(int n) {
        int temp = n;
        int rev = 0;
        while(temp != 0) {
            int lastDigit = temp % 10;
//            you can't write rev *= 10 + lastDigit ==> rev = rev * ( 10 + lastDigit) because of operator precedence
            rev = rev * 10 + lastDigit;
            temp /= 10;
        }
        return (rev == n);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println("Is the given number is palindrome: " + obj.isPal(n));
        scan.close();
    }
}
