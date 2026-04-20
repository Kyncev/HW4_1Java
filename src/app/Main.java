package app;
import java.util.Arrays;
import java.util.Random;

public class Main {

    private static final int SIZE = 20;
    private static final int MIN = -100;
    private static final int MAX = 100;

    public static void main(String[] args) {

        int[] array = generateArray();

        System.out.println("Елементи масиву: " + Arrays.toString(array));

        int negativeSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        int firstNegativeIndex = -1;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];


            if (value < 0) {
                negativeSum += value;

                if (firstNegativeIndex == -1) {
                    firstNegativeIndex = i;
                }
            }


            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }


            if (value < min) {
                min = value;
                minIndex = i;
            }

            if (value > max) {
                max = value;
                maxIndex = i;
            }
        }

        System.out.println("Сума від'ємних чисел: " + negativeSum);
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
        System.out.println("Найменший елемент: " + min + " (індекс " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (індекс " + maxIndex + ")");


        if (firstNegativeIndex == -1 || firstNegativeIndex == array.length - 1) {
            System.out.println("Немає елементів після першого від'ємного числа.");
        } else {
            double sum = 0;
            int count = 0;

            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sum += array[i];
                count++;
            }

            double average = sum / count;
            System.out.printf(
                    "Середнє арифметичне після першого від'ємного: %.2f%n",
                    average
            );
        }
    }


    private static int[] generateArray() {
        Random random = new Random();
        int[] array = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt(MAX - MIN + 1) + MIN;
        }

        return array;
    }
}