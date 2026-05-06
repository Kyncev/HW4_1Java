package app;
import java.util.Arrays;

public class Main {

    public static void printSqr(int number) {
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number));
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static int arraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        return reversed;
    }

    public static int power(int a, int b) {
        int result = 1;

        for (int i = 0; i < b; i++) {
            result *= a;
        }

        return result;
    }

    public static void printText(int n, String text) {

        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {

        // 1
        int number = 12;
        printSqr(number);

        // 2
        double radius = 4.3;
        double height = 12.7;
        double volume = cylinderVolume(radius, height);

        System.out.println("\nОб'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume);

        // 3
        int[] numbers = {10, 30, 50, 70, 90};

        System.out.println("\nМасив чисел: " + Arrays.toString(numbers));
        System.out.println("Сума всіх елементів масиву дорівнює " + arraySum(numbers));

        // 4
        String text = "Privit, Mr. Andrey!";
        System.out.println("\nРядок в зворотньому порядку: " + reverseString(text));

        // 5
        int a = 4;
        int b = 3;
        System.out.println("\nРезультат " + a + "^" + b + " дорівнює " + power(a, b));

        // 6
        int n = 4;
        String message = "Hillel Java Basic";
        System.out.println();
        printText(n, message);
    }
}