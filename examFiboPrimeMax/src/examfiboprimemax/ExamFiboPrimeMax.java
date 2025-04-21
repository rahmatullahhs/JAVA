package examfiboprimemax;

import java.util.Scanner;

public class ExamFiboPrimeMax {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("input number: ");
        int input = s.nextInt();

        int round = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                round++;
            }
        }

        if (round == 2) {
            System.out.println(input + " prime.");
        } else {
            System.out.println(input + " not prime.");
        }
       
    }
}
