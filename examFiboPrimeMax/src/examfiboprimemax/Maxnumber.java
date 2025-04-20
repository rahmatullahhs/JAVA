
package examfiboprimemax;

import java.util.Arrays;
import java.util.Scanner;

public class Maxnumber {
    
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size: ");

//        array for collect input size
        int size = scan.nextInt();
        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {
//            for collect user input numbers 
            System.out.println("enter numbers");
            int number = scan.nextInt();
            numbers[index] = number;
        }
//variable for compare
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
    
    
    
    
    
    
    
    
    
    


