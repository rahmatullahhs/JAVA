package overlodingmethod;

import java.util.Arrays;
import java.util.Scanner;

public class OverLodingMethod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("how many time you want to input");
        int n = s.nextInt();
        int[] myArry = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("enter your number");
            int userInput = s.nextInt();
            myArry[i] = userInput;
        }
        sum(myArry);

//        ------------------
    }

    public static int sum() {
        return 10 + 20;
    }

    public static int sum(int a, int b) {
        return b + a;
    }

    public static void sum(int... a) {
        int sum = 0;
        for (int item : a) {
            sum += item;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
    }
//  -------------------------  
}
