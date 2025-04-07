/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnumbergenerate;

import java.util.Scanner;

public class RandomNumberGenerate {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Guess a number between 0 to 9");
        int input = s.nextInt();
        int Random = (int) (Math.random()*10 );
        
        System.out.println(Random);

        if (input == Random) {

            System.out.println(" win ");
        } else {
            System.out.println("lose");
        }

    }

}
