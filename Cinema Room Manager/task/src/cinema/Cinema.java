package cinema;
import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // open scanner
        Scanner input = new Scanner(System.in);

        // vars
        String income = "Total income:";

        // ask input here
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = input.nextInt();

        // calculate logic here
        int totalSeats = seats * rows;

        if (totalSeats <= 60) {
            int priceSmallRoom = totalSeats * 10;
            System.out.println(income);
            System.out.println("$" + priceSmallRoom);
        } else {
            int frontRows = rows / 2;
            int backRows = rows - frontRows;
            int priceFrontRows = frontRows * seats * 10;
            int priceBackRows = backRows * seats * 8;
            int priceOdd = priceFrontRows + priceBackRows;
            System.out.println(income);
            System.out.println("$" + priceOdd);
        }

        // close scanner
        input.close();


        /*
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
         */

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