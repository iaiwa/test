public class Problema1 {


    public static void main(String[] args) {
        int n = 2018;
        System.out.println(metodaX(n));
    }

    public static int metodaX(int n) {
        int s = 0;
        int c = 0;
        while (n > 0) {
            c = n % 10;
            s = s + c;
            n = n / 10;


        }


        return s;
    }
}
