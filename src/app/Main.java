package app;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. Створюємо масив та об'єкт для випадкових чисел
        int[] numbers = new int[20];
        Random random = new Random();

        // 2. Заповнюємо масив (діапазон від -100 до 100)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }

        System.out.println("Елементи масиву: " + Arrays.toString(numbers));

        // Змінні для підрахунків
        int sumNegative = 0;
        int evenCount = 0;
        int oddCount = 0;

        int minIndex = 0;
        int maxIndex = 0;

        // 3. Основний цикл для обчислень
        for (int i = 0; i < numbers.length; i++) {
            // Сума від'ємних
            if (numbers[i] < 0) {
                sumNegative += numbers[i];
            }

            // Парні/непарні
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Пошук мінімуму та максимуму
            if (numbers[i] < numbers[minIndex]) minIndex = i;
            if (numbers[i] > numbers[maxIndex]) maxIndex = i;
        }

        // 4. Середнє арифметичне після першого від'ємного
        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        // Виводимо результати
        System.out.println("Сума від'ємних чисел: " + sumNegative);
        System.out.println("Кількість парних: " + evenCount);
        System.out.println("Кількість непарних: " + oddCount);
        System.out.println("Найменший: " + numbers[minIndex] + " (індекс " + minIndex + ")");
        System.out.println("Найбільший: " + numbers[maxIndex] + " (індекс " + maxIndex + ")");

        if (firstNegativeIndex != -1 && firstNegativeIndex < numbers.length - 1) {
            double sumAfter = 0;
            int countAfter = 0;
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                sumAfter += numbers[i];
                countAfter++;
            }
            System.out.printf("Середнє після першого від'ємного: %.2f%n", (sumAfter / countAfter));
        } else {
            System.out.println("Від'ємних чисел немає або вони в самому кінці.");
        }
    }
}
