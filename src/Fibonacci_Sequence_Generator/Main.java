package Fibonacci_Sequence_Generator;

public class Main {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciSequence.iterator().next());
            fibonacciSequence.add(fibonacciSequence.iterator().next());
        }
    }
}
