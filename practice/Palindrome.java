package Java.practice;

/*
Key concepts: Two Pointers, equals()
equals() use for objects not for primitives
 */

import java.util.Scanner;

public class Palindrome {

    public static boolean checkPalindrome(String word) {
        int start = 0, end = word.length() - 1;
        boolean isPalindrome = true;
        while(start < end) {
            if(!((Character.valueOf(word.charAt(start))).equals(Character.valueOf(word.charAt(end))))) isPalindrome = false;
            start++;
            end--;
        }
        return isPalindrome;
    }

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word = scan.next();
        scan.close();
        boolean isPalindrome = checkPalindrome(word);
        if(isPalindrome) System.out.println("The string \"" + word + "\" is a palindrome.");
        else System.out.println("The string " + word + " is NOT a palindrome.");
    }
}
