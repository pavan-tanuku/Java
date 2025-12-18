package Java.DSA.chatgpt.linearsearch;

// Search an element in an integer array

import java.util.Scanner;

public class SearchElement {

    static int elementIndex(int[] numbers, int key) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int size = scan.nextInt();
        int[] numbers = new int[size];
        // reading a dynamic array elements
        System.out.println("Enter the elements:");
        for(int i = 0; i < size; i++) numbers[i] = scan.nextInt();
        System.out.print("Enter the key to search: ");
        int key = scan.nextInt();
        int index = elementIndex(numbers, key);
        if(index != -1) {
            System.out.println("The key " + key + " is at index " + index);
        } else {
            System.out.println("The key " + key + " is not present in the given array!");
        }
    }

}
