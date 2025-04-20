/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxnumber;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter count: ");
        int limit = scan.nextInt();
        int[] numbers = new int[limit];

        for (int index = 0; index < limit; index++) {
            int number = scan.nextInt();

            numbers[index] = number;
        }

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        System.out.println("inputed numbers: " + Arrays.toString(numbers));

        for (int number : numbers) {

            if (number > maxNumber) {
                maxNumber = number;
            }

            if (number < minNumber) {
                minNumber = number;
            }
        }

        System.out.println("min: " + minNumber);
        System.out.println("max: " + maxNumber);

    }

}
