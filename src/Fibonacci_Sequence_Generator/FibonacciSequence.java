package Fibonacci_Sequence_Generator;

import Fibonacci_Sequence_Generator.Abstract.Sequence;

import java.util.Iterator;


public class FibonacciSequence implements Sequence {
    private Node tail;

    public FibonacciSequence() {
        this.tail = null;
    }

    public void add(Integer i) {
        if (tail == null) {
            Node newNode = new Node(i);
            tail = newNode;
        } else {
            Node newNode = new Node(i);
            newNode.setPrevious(tail);
            tail = newNode;
        }

    }

    public Node getTail() {
        return tail;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Fibonaccilterator(this);
    }
}
