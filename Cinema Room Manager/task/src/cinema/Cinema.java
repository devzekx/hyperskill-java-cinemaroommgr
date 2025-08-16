package cinema;

import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // open scanner
        Scanner input = new Scanner(System.in);

        // vars
        String location = "Cinema:";
        String[] header = {" ", "1", "2", "3", "4", "5", "6", "7", "8"};
        String[][] data = {
                {"1", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"2", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"3", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"4", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"5", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"6", "S", "S", "S", "S", "S", "S", "S", "S"},
                {"7", "S", "S", "S", "S", "S", "S", "S", "S"}
        };

        // ask input here
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter the number of seats in each row:");

        // calculate logic here


        // close scanner
        input.close();







                /* print header method
        for (int i = 0; i < header.length; i++) {
            System.out.print(header[i] + " ");
        }
        */

        /* print body method
        for (int i = 0; i < data.length; i++) {
            System.out.println();
            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
            }
        }
        */
    }
}