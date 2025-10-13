package Java.DSA.Mathematics;
import java.util.Scanner;
 /*
TestCases: n > 0
I/p: n = 13
O/p: YES
I/p: n = 14
O/p: NO
I/p: n = 101
O/p: YES
 */
public class PrimeNumber {

    //bad algorithm O(n)
    public static boolean badAlgo(int num) {
        System.out.println("Checking the number " + num + " is prime or not using bag algorithm.");
        boolean isPrime = true;
        if(num == 1) isPrime = false;
        for(int i = 2; i < num; i++) {
            if(num % i == 0) isPrime = false;
        }
        return isPrime;
    }

    //Efficient algorithm O(square root (n))
    public static boolean effincientAlgo(int num) {
        System.out.println("Checking the number " + num + " is prime or not using Efficient way.");
        boolean isPrime = true;
        if(num == 1) isPrime = false;
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) isPrime = false;
        }
        return isPrime;
    }

    //more efficient(reduce the unnecessary iterations)
    public static boolean isPrime(int num) {
        if(num == 1) return false;
        if(num == 2 || num == 3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        for(int i = 5; i * i <= num; i = i + 6) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
        }
        return true;
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
