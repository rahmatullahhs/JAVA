package positivenegzero;

import java.util.Scanner;

public class PositiveNegZero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter your number");
        int input = s.nextInt();

        if (input > 0) {
            System.out.println("positive");
        } else if (input == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
 }

    }

}
