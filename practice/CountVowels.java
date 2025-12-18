package Java.practice;

/*
 key concepts: char check, toLowerCase()
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVowels {

    static void main() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scan.nextLine();
        scan.close();
        
        String lowerStr = str.toLowerCase();
        String vowels = "aeiou";

        Set<Character> vowelsCount = new HashSet<>();
        Set<Character> consonantsCount = new HashSet<>();

        char[] characters = lowerStr.toCharArray();
        for(char ch: characters) {
            if(vowels.contains(String.valueOf(ch))) vowelsCount.add(ch);
            else consonantsCount.add(ch);
        }
        System.out.println("The count of vowels in the string " + str + " is: " + vowelsCount.size());
        System.out.println("The count of consonants in the string " + str + " is: " + consonantsCount.size());
    }
}
