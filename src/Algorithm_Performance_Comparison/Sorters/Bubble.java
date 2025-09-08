package Algorithm_Performance_Comparison.Sorters;

import Algorithm_Performance_Comparison.Abstract.Sorter;
import Algorithm_Performance_Comparison.Algorithms.GfGBubble;

public class Bubble extends Sorter {

    @Override
    public void sort(int[] array) {
        GfGBubble.bubbleSort(array, array.length);
    }
}
