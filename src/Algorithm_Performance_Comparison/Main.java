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
        Operation operation = new Operation();
        operation.perform();
        operation.perform();
        operation.perform();

        Operation operation2 = new Operation();
        operation2.perform();
        operation2.perform();
        operation2.perform();
    }
}
