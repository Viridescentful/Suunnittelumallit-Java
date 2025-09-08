package Algorithm_Performance_Comparison;

import Algorithm_Performance_Comparison.Abstract.Sorter;

import static Algorithm_Performance_Comparison.Algorithms.GfGBubble.bubbleSort;

public class SorterContext {
    private Sorter sorter;

    public SorterContext(Sorter sorter) {
        this.sorter = sorter;
    }

    public void setStrategy(Sorter sorter) {
        this.sorter = sorter;
    }

    public double processSort (int[] array) {
        long startTime = System.nanoTime();
        sorter.sort(array);
        long endTime = System.nanoTime();

        double SortDuration = (endTime - startTime) / 1000000000.0;

        return SortDuration;
    }
}
