import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Array size: ");
        int sizeInput = scan.nextInt();

        int[] original = new int[sizeInput];

        System.out.print("Array itself: ");

        for (int i = 0; i < sizeInput; i++) {
            original[i] = scan.nextInt();
        }

        System.out.print("Number to be deleted: ");
        
        int dNumber = scan.nextInt();

        int[] newArr = new int[original.length];

        int newIndex = 0;

        for (int val : original) {
            if (val != dNumber) {
                newArr[newIndex] = val;
                newIndex++;
            }
        }

        int[] lastNewArr = Arrays.copyOfRange(newArr, 0, newIndex);

        System.out.println(Arrays.toString(lastNewArr));
    }
}