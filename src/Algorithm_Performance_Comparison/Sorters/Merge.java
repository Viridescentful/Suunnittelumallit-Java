package Algorithm_Performance_Comparison.Sorters;

import Algorithm_Performance_Comparison.Abstract.Sorter;
import Algorithm_Performance_Comparison.Algorithms.GfGMerge;

public class Merge extends Sorter {

    @Override
    public void sort(int[] array) {
        GfGMerge.mergeSort(array,0,  array.length - 1);
    }
}
