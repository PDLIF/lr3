import java.util.Scanner;
import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int sizeInput = scan.nextInt();

        double[] original = new double[sizeInput];

        System.out.print("Массив: ");
        for (int i = 0; i < sizeInput; i++) {
            original[i] = scan.nextDouble();
        }

        double[] newArr = new double[sizeInput];

        for (int i = 0; i < sizeInput; i++) {
            newArr[i] = original[i];
        }

        double sum = 0;

        for (int i = 0; i < sizeInput; i++) {
            sum = sum + newArr[i];
            newArr[i] = sum / newArr[i];
        }
        
        System.out.print("Исходный массив: ");

        for (double orig : original) {
            System.out.print(orig + " ");
        }

        System.out.println(" ");

        System.out.print("Новый массив: ");


        for (double num : newArr) {
            System.out.print(num + " ");
        }

        System.out.println("");
    }
}


