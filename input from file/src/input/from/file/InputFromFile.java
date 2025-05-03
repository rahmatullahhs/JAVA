/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package input.from.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputFromFile {

    public static void main(String[] args) {

        try {

            FileReader fr = new FileReader("c://Users//Admin//Desktop//input.txt");
            FileWriter fw = new FileWriter("c://Users//Admin//Desktop//output.txt");

            String str = "";
            int i;
            while ((i = fr.read()) != -1) {

                str += (char) i;
            }

            System.out.println(str);

            fw.write(str);
            fr.close();
            fw.close();

            System.out.println(
                    "File reading and writing both done");
        } catch (IOException e) {

            System.out.println(
                    "There are some IOException");
        }
    }
}
