package Fibonacci_Sequence_Generator;

import java.util.Iterator;

public class Fibonaccilterator implements Iterator<Integer> {
    private Node tail;

    public Fibonaccilterator(FibonacciSequence fibonacciSequence) {
        this.tail = fibonacciSequence.getTail();
    }

    @Override
    public boolean hasNext() {
        return tail != null;
    }

    @Override
    public Integer next() {
        int first = tail.getData();
        int second = tail.getPrevious().getData();
        return second + first;
    }
}
