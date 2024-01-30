//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LeftBlock {
    public static void main(String[] args) {

        //i for rows
        //j for coloumns


        int i, j, row = 6;

        for (i = 1; i < row; i++) {
//inner loop for columns
            for (j = 1; j <= i; j++) {
//prints stars
                System.out.print(i + " ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();

        }
    }
}

