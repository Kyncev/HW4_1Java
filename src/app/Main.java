package app;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main() {
        int[]arr = new int[15];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            arr[i]= rand.nextInt(100)+1;
        }
            System.out.println("Початковий вигляд масиву: " + Arrays.toString(arr));
            insertionSort(arr);
            System.out.println("Відсортований масив: " + Arrays.toString(arr));
            System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();
        int index = binarySearch(arr, target);
        if (index != -1){
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Число " + target + " не знайдено в масиві.");
        }
        scanner.close();
    }
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j]>key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
