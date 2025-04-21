
package exambubblesortarray;

import java.util.Arrays;
import java.util.Scanner;


public class ExamBubbleSortArray {

  
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);

        System.out.print("Enter  size: ");
        int arraySize = s.nextInt();

        int[] myArray = new int[arraySize];

        for (int index = 0; index < myArray.length; index++) {
            System.out.print("Enter value: ");
            int userValue = s.nextInt();
            myArray[index] = userValue;
        }

        
        for (int round = 0; round < myArray.length - 1; round++) {
            for (int step = 0; step < myArray.length - 1 - round; step++) {
                if (myArray[step]>myArray[step+1]) {
                    int temp = myArray[step + 1];
                    myArray[step + 1] = myArray[step];
                    myArray[step] = temp;
                }
            }
        }
        System.out.println("bubble sorting: " + Arrays.toString(myArray));
    }

}