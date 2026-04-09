package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Створюємо об'єкт Scanner для читання даних з консолі
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму вашого доходу: ");
        double income = scanner.nextDouble();

        double taxRate; // Ставка податку
        double taxAmount; // Підсумкова сума податку

        // Реалізація прогресивної шкали через if-else
        if (income <= 10000) {
            // Від 0 до 10000 включно
            taxRate = 2.5;
        } else if (income <= 25000) {
            // Від 10000 виключно до 25000 включно
            taxRate = 4.3;
        } else {
            // Більше 25000
            taxRate = 6.7;
        }

        // Розрахунок: (сума * відсоток) / 100
        taxAmount = (income * taxRate) / 100;

        // Виведення результату
        System.out.printf("При доході %.2f ставку податку становить %.1f%%\n", income, taxRate);
        System.out.printf("Сума податку до сплати: %.2f\n", taxAmount);

        scanner.close();
    }
}