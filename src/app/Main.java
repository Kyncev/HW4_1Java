package app;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(50) + 1;
            }
        }
        System.out.println("Матриця 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int sumEvenRows = 0;
        int sumOddRows = 0;
        long prodEvenCols = 1;
        long prodOddCols = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i % 2 == 0) {
                    sumEvenRows += matrix[i][j];
                } else {
                    sumOddRows += matrix[i][j];
                }
                if (j % 2 == 0) {
                    prodEvenCols *= matrix[i][j];
                } else {
                    prodOddCols *= matrix[i][j];
                }
            }
        }
        System.out.println("\nСума парних рядків: " + sumEvenRows);
        System.out.println("Сума непарних рядків: " + sumOddRows);
        System.out.println("Добуток парних стовпців: " + prodEvenCols);
        System.out.println("Добуток непарних стовпців: " + prodOddCols);
        boolean isMagic = true;
        int magicSum = 0;
        for (int j = 0; j < 4; j++) {
            magicSum += matrix[0][j];
        }
        for (int i = 0; i < 4; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
            }
            if (rowSum != magicSum) {
                isMagic = false;
            }
        }
        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 4; i++) {
                colSum += matrix[i][j];
            }
            if (colSum != magicSum) {
                isMagic = false;
            }
        }
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < 4; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][3 - i];
        }
        if (diag1 != magicSum || diag2 != magicSum) {
            isMagic = false;
        }
        if (isMagic) {
            System.out.println("\nМатриця є магічним квадратом.");
        } else {
            System.out.println("\nМатриця не є магічним квадратом.");
        }
    }
}