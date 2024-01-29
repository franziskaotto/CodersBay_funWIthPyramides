//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LeftBlock {
    public static void main(String[] args) {

        //i for rows
        //j for coloumns

        int i = 1;
        int j;

        while (i <= 5) {
            j = 1;
            while (j <= (i % 2 == 0 ? i + 1 : i)) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

    }


}