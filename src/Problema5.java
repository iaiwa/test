import java.util.Scanner;

public class Problema5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdu numarul de termeni: ");
        int n = sc.nextInt();
        int s = 0, c;
        for (c = 1; c <= n; c++) {
            s = s * 10 + c;
            System.out.println(s + " ");
        }
    }
}

