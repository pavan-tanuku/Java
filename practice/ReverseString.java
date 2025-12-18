package Java.practice;
import java.util.Scanner;

/*
 key concepts: charAt(), loops, StringBuilder
 */
public class ReverseString {

    public static String inEfficiency(String word) {
        String reverseStr = "";
        for(int i = word.length() - 1; i >= 0; i--) {
            reverseStr += word.charAt(i);
        }
        return reverseStr;
    }

    // Here we are returning the StringBuilder
    public static StringBuilder effective(String word) {
        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        return sb;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String word = scan.nextLine();
        scan.close();
        String badAlgo = inEfficiency(word);
        String goodAlgo = String.valueOf(effective(word));
        System.out.println("Reverse the string using the charAt(): " + badAlgo);
        System.out.println("Reverse the string using the StringBuilder: " + goodAlgo);

    }
}
