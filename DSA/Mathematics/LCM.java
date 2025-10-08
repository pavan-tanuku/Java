package Java.DSA.Mathematics;

/*
Test cases:
I/p: a = 4, b = 6
O/p: 12
I/p: a = 12, b = 15
O/p: 60
I/p: a = 2, b = 8
O/p: 8
I/p: a = 3, b = 7
O/p: 21

 */

import java.util.Scanner;

public class LCM {

    public static int badAlgo(int a, int b) {
        int res = Math.max(a, b);
        while(true) {
            if(res % a == 0 && res % b == 0)
                return res;
            res++;
        }
    }

    /*
    Efficient Algorithm:
    using formula: a*b = gcd(a, b) * lcm(a, b)

    gcd => using Euclidean algorithm
    lcm => using above formula.
     */

    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }

    public static int goodAlgo(int a, int b) {
//        finding gcd(a, b) using the euclidean algorithm
        int gcd = gcd(a, b);

        // finding lcm
        return (a * b) / gcd ;
    }

        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the two inputs: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        System.out.println("The BAD Algorithm is: ");
        int bad_Algo = badAlgo(a, b);
        System.out.println("The lcm using BAD Algorithm is " + bad_Algo);
        int good_Algo = goodAlgo(a, b);
        System.out.println("The lcm using GOOD Algorithm is: " + good_Algo);
    }
}
