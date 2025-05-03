package application.of.recursive;

public class ApplicationOfRecursive {

    public static void main(String[] args) {

        seriesNumber(10);
        System.out.println(factorial(5));
    }

    public static long factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            System.out.println(n);
            return n * factorial(n - 1);//recursive call
        }
    }

    public static void seriesNumber(int n) {

        if (n <= 0) {
            System.out.println("");
        } else {
            seriesNumber(n - 2);
            System.out.println(n);
        }

    }
}
