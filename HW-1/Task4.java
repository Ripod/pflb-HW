import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        MatrixModification("3 3 7\n1 2 3\n4 5 6\n7 8 9\nr 1 2\nr 3 2\nc 2 3\nc 1 2\ng 3 2\ng 1 2\ng 1 3");
    }

    public static void MatrixModification(String str) {
        int rows, columns, requests;
        Scanner input = new Scanner(str);
        rows = input.nextInt();
        columns = input.nextInt();
        requests = input.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        String signalStr;
        for (int i = 0; i < requests; i++) {
            signalStr = input.next();
            if (signalStr.equals("g")) {
                int outRow = input.nextInt() - 1;
                int outCol = input.nextInt() - 1;
                System.out.println(matrix[outRow][outCol]);
                continue;
            }
            if (signalStr.equals("r")) {
                int firstRow = input.nextInt() - 1;
                int secondRow = input.nextInt() - 1;
                for (int j = 0; j < columns; j++) {
                    int buffer = matrix[firstRow][j];
                    matrix[firstRow][j] = matrix[secondRow][j];
                    matrix[secondRow][j] = buffer;
                }
                continue;
            }
            if (signalStr.equals("c")) {
                int firstCol = input.nextInt() - 1;
                int secondCol = input.nextInt() - 1;
                for (int j = 0; j < rows; j++) {
                    int buffer = matrix[j][firstCol];
                    matrix[j][firstCol] = matrix[j][secondCol];
                    matrix[j][secondCol] = buffer;
                }
                continue;
            }
        }
    }
}
