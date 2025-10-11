package Java.DSA.Mathematics;

import java.util.Scanner;

public class PrimeNumber {

    //bad algorithm
    public static boolean badAlgo(int num) {
        System.out.println("Checking the number " + num + " is prime or not using bag algorithm.");
        boolean isPrime = true;
        if(num == 1) isPrime = false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) isPrime = false;
        }
        return isPrime;
    }

    //Efficient algorithm
    public static boolean effincientAlgo(int num) {
        System.out.println("Checking the number " + num + " is prime or not using Efficient way.");
        boolean isPrime = true;
        if(num == 1) isPrime = false;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to check it is prime / not: ");
        int num = scan.nextInt();
        System.out.println();
        boolean badCode = badAlgo(num);
        if(badCode) {
            System.out.println("The result is a prime number.");
        } else {
            System.out.println("The result is not a prime number.");
        }

        boolean efficientCode = effincientAlgo(num);
        if(efficientCode) {
            System.out.println("The result is a prime number.");
        } else {
            System.out.println("The result is not a prime number.");
        }
        scan.close();
    }
}
