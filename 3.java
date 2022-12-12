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


        int[] newArr = new int[original.length];
        int newIndex = 0;
        newArr[0] = original[0];

        for (int i = 1; i < original.length; i++) {
            if (original[i] >= newArr[newIndex]) {
                newArr[newIndex + 1] = original[i];
                newIndex++;
            }
        }
        int[] hhh = Arrays.copyOfRange(newArr, 0, newIndex + 1);
        System.out.println(Arrays.toString(hhh));
    }
}