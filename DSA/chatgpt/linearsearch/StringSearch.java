package Java.DSA.chatgpt.linearsearch;

// Search an element in a string array

import java.util.Scanner;

public class StringSearch {

    static int stringSearch(String[] names, String key) {
        for(int i = 0; i < names.length; i++) {
            if(key.equals(names[i])) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = scan.nextInt();
        scan.nextLine();
        String[] names = new String[size];
        // reading the string array
        System.out.println("Read the names: ");
        for(int i = 0; i < size; i++) {
            names[i] = scan.nextLine();
        }
        System.out.print("Enter the string name to search: ");
        String key = scan.nextLine();
        int index = stringSearch(names, key);
        if(index != -1) {
            System.out.println("The key is present in the array at index \"" + index+"\"");
        } else {
            System.out.println("The string \"" + key + "\" is not present in the array!");
        }
    }
}
