public class Block {

    public static void main (String[] args) {
        //i for rows
        //j for coloumns

        int i;
        int j;
        int row = 5;

        for (i = 1; i <= row; i++) {
            for (j = 0; j < row; j++) {
                System.out.print(i + " ") ;
            }
            System.out.println();
        }

    }
}
