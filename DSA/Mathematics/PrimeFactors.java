package Java.DSA.Mathematics;
import java.util.Scanner;

/*
TestCases: n > 1
I/p: n = 12
O/p: 2 2 3
I/p: n = 13
O/p: 13 (prime number)
I/p: n = 315
O/p: 3 3 5 7
 */

public class PrimeFactors {

    // Naive solution O(nlogn)
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if(num == 1) isPrime = false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) isPrime = false;
        }
        return isPrime;
    }

    public static void primeFactors(int num) {
        System.out.println("The factors of a number " + num + " is: ");
        for(int i = 2; i <= num; i++) {
            if(isPrime(i)) {
                int count = 0;
                while(num % i == 0) {
                    count++;
                    num /= i;
                }
                System.out.println("The factor are: " + i + "^" + count);

            }
        }
    }

    //Efficient solution
    public static void printPrimeFactor(int num) {
        if(num <= 1) return;
        for(int i = 2; i * i <= num; i++) {
            while(num % i == 0) {
                System.out.println(i);
                num /= i;
            }
        }
        if(num > 1) System.out.println(num);
    }

    // More Efficient way (reduce the unnecessary iterations)
    // O(square root (n))
    public static void printEfficientPrimeFactor(int num) {
        if(num <= 1) return;
        while(num % 2 == 0) {
            System.out.println(2);
            num /= 2;
        }
        while(num % 3 == 0) {
            System.out.println(3);
            num /= 3;
        }
        for(int i = 5; i * i <= num; i = i + 6) {
            while(num % i == 0) {
                System.out.println(i);
                num /= i;
            }
            while(num % (num + 2) == 0) {
                System.out.println(i + 2);
                num = num / (i + 2);
            }
        }
        if(num > 3) System.out.println(num);
    }

    public static void main(String[] args) {
        System.out.println("Checking the prime factors of a given number");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        primeFactors(num);
    }
}
