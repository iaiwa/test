import java.util.Scanner;

public class Problema4 {
    public static int getFib(int n) {
        if (n <= 2) return 1;
        return getFib(n - 2) + getFib(n - 1);
    }

    public static int getFibAltfel(int n, int a, int b) {
        if (n <= 1) return a;
        return getFibAltfel(n - 1, b, a + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long start = System.currentTimeMillis();
        System.out.println(getFibAltfel(n, 1, 1));
        long end = System.currentTimeMillis();
        System.out.println("getFibAltfel took " + (end - start) + " miliseconds");
        start = System.currentTimeMillis();
        System.out.println(getFib(n));
        end = System.currentTimeMillis();
        System.out.println("getFib took " + (end - start) + " miliseconds");
    }
}