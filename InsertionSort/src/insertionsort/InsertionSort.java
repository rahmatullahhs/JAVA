package insertionsort;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InsertionSort {

    public static void main(String[] args) throws IOException {

//        int[] list = {1, 9, 4, 6, 5, -4};
//
//        InsertionSort.insertionSort(list);
//        ------------
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
//        advanceBoobolSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

     DataOutputStream output = null;
        try {
            output = new DataOutputStream(
new BufferedOutputStream(
new FileOutputStream("largedata.dat")));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InsertionSort.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < 800004; i++)
  output.writeInt((int)(Math.random() * 1000000));
 
 output.close();
 
// Display first 100 numbers
      DataInputStream input = new DataInputStream(
 new BufferedInputStream(new FileInputStream("largedata.dat")));
 for (int i = 0; i < 100; i++)
         System.out.print(input.readInt() + " ");
 
          input.close();
     }
   }
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {

            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }

            list[k + 1] = currentElement;
            System.out.println(currentElement);
        }

    }
//----------------

    public static void advanceBoobolSort(int[] list) {

        boolean needNextpas = true;

        for (int k = 1; k < list.length && needNextpas; k++) {
            needNextpas = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextpas = true;

                }
            }
        }

    }

//    ---------------
    public static void quickSort(int[] list) {

    }

}
