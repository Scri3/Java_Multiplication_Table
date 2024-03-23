package multiplication.table;

import javax.swing.JOptionPane;

public class MultiplicationTable {

    public static void main(String[] args) {

        int Rows = Integer.valueOf(JOptionPane.showInputDialog(null, "Please Enter the Rows' amount: "));
        int Columns = Integer.valueOf(JOptionPane.showInputDialog(null, "Please Enter the Columns' amount: "));
        int[][] MultiplicationTable = new int[Rows][Columns];
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Columns; j++) {
                int result = (i + 1) * (j + 1);
                MultiplicationTable[i][j] = result;
                System.out.print(MultiplicationTable[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
