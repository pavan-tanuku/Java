package Java;

public class Swapping {
    static void main() {
        int a = 8;
        int b = 9;
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
}
