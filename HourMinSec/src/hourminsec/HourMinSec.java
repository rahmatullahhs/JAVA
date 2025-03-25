/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hourminsec;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HourMinSec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    

{
        // Create a Scanner object for user input
        Scanner in = new Scanner(System.in);
        // Prompt the user to input the total seconds
        System.out.print("Input seconds: ");
        int seconds = in.nextInt();

        // Calculate the hours, minutes, and seconds
        int S = seconds % 60;  // Calculate the remaining seconds
        int H = seconds / 60;  // Convert total seconds to minutes
        int M = H % 60;         // Calculate the remaining minutes
        H = H / 60;            // Convert total minutes to hours

        // Display the time in the format HH:MM:SS
        System.out.print(H + ":" + M + ":" + S);

        // Print a new line for better formatting
        System.out.print("\n");
        
//        h=ts/3600
//                rs=ts%3600
//                        m=rs/60
//                                s=rs%60
        
        
        
    }
}

        
    }
    

