package Algorithm_Performance_Comparison;

import Algorithm_Performance_Comparison.Sorters.Bubble;
import Algorithm_Performance_Comparison.Sorters.Merge;
import Algorithm_Performance_Comparison.Sorters.Selection;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static Algorithm_Performance_Comparison.Algorithms.GfGBubble.bubbleSort;
import static Algorithm_Performance_Comparison.Algorithms.GfGMerge.mergeSort;
import static Algorithm_Performance_Comparison.Algorithms.GfGSelection.selectionSort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SorterContext sorterHandler = new SorterContext(new Bubble());

        // read amount
        System.out.println("Enter the amount: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(size);
        }

        int[] arrayForSort = Arrays.copyOf(array, array.length);

        System.out.println("Select sort method: ");
        System.out.println("1. Bubble");
        System.out.println("2. Selection");
        System.out.println("3. Merge");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                sorterHandler.setStrategy(new Bubble());
                break;
            case 2:
                sorterHandler.setStrategy(new Selection());
                break;
            case 3:
                sorterHandler.setStrategy(new Merge());
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        double paymentSuccessful = sorterHandler.processSort(arrayForSort);

        System.out.println("Sorted array: " + Arrays.toString(arrayForSort));
        System.out.println("Time taken: " + paymentSuccessful + " seconds");
    }
}
