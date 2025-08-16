package cinema;

import java.util.Arrays;

public class Cinema {
    public static void main(String[] args) {
        // Let's declare some vars and arrays to manage this output.
        String cinema = "Cinema:";
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

        // figure out formatting to print a 2d array
        System.out.println(Arrays.toString(data[0]));



        // let's print the header - DONE
        int counterHeader = 0;

        for (counterHeader = 0; counterHeader < header.length; counterHeader++) {
            System.out.print(header[counterHeader] + " ");
        }

        // let's print the body of the table - TODO

        int counterData = 0;

        for (counterData = 0; counterData < data.length; counterData++) {
            int printData = counterData;
            // System.out.print(data[counterData] + " ");
        }

    }
}