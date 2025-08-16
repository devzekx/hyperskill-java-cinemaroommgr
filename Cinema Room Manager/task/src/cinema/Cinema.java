package cinema;

import java.util.Arrays;

public class Cinema {
    public static void main(String[] args) {
        // Let's declare some vars and arrays to manage this output.
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

        // print location

        System.out.println(location);

        // let's print the header - DONE

        for (int i = 0; i < header.length; i++) {
            System.out.print(header[i] + " ");
        }

        // let's print the body of the table - DONE

        for (int i = 0; i < data.length; i++) {
            System.out.println();
            for (int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
            }
        }

    }
}