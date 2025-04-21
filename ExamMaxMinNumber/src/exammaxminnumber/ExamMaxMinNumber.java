package exammaxminnumber;

import java.util.Scanner;

public class ExamMaxMinNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter size");

        int size = s.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {

            System.out.println("enter numbers");
            int number = s.nextInt();
            numbers[index] = number;
        }
        int mxN = numbers[0];
        int mnN = numbers[0];

        for (int number : numbers) {
            if (number > mxN) {
                mxN = number;
            }

            if (number < mnN) {
                mnN = number;
            }

        }
        System.out.println("maximam =" + mxN);
        System.out.println("minimum =" + mnN);
    }

}
