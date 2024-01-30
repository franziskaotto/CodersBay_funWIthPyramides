import java.util.Scanner;

public class InputPyramide {

    public static void main(String[] args) {

        //i for rows        >
        //j for coloumns    v



        Scanner scanner = new Scanner(System.in);
        int rows;

        while(true) {
            System.out.println("type 'quit' to exit");
            System.out.print("rows: " );

            if (scanner.hasNext("quit")) {
                System.out.println("Exiting program.");
                break;
            }

            rows = scanner.nextInt();


            for (int i = 1; i <= rows; i++) {
                for (int j = rows - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++ ) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }


        }
    }
}
