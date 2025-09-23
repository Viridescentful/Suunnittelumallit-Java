package Algorithm_Performance_Comparison;

import Algorithm_Performance_Comparison.Sorters.Bubble;
import Algorithm_Performance_Comparison.Sorters.Merge;
import Algorithm_Performance_Comparison.Sorters.Selection;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Operation {
    private SorterContext sorterHandler;
    private int size;
    private int[] array;

    private final Scanner scanner = new Scanner(System.in);

    public Operation() {

        this.sorterHandler = new SorterContext(new Bubble());
        // read amount
        System.out.println("Enter the amount: ");
        this.size = scanner.nextInt();
        this.array = new int[size];

        Random random = new Random();
        for (int i = 0; i < size; i++) {
            this.array[i] = random.nextInt(size);
        }
    }


    public void perform() {
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

        //System.out.println("Sorted array: " + Arrays.toString(arrayForSort));
        System.out.println("Smallest element: " + arrayForSort[0]);
        System.out.println("Largest element: " + arrayForSort[arrayForSort.length - 1]);
        System.out.println("Time taken: " + paymentSuccessful + " seconds");
        System.out.println();
    }
}
