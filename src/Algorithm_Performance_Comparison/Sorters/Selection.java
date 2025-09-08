package Algorithm_Performance_Comparison.Sorters;

import Algorithm_Performance_Comparison.Abstract.Sorter;
import Algorithm_Performance_Comparison.Algorithms.GfGSelection;

public class Selection extends Sorter {

    @Override
    public void sort(int[] array) {
        GfGSelection.selectionSort(array);
    }
}
