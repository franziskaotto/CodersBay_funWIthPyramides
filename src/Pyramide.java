public class Pyramide {
    public static void main(String[] args) {

        //i for rows
        //j for coloumns

        int i;
        int j;
        int row = 6;



        for (i = 1; i < row; i++) {
            for (j = row - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++ ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
