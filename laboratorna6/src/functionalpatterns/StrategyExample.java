package functionalpatterns;

import java.util.function.BiFunction;

public class StrategyExample {
    public static void run() {
        System.out.println("\n--- Strategy Pattern ---");

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;

        executeStrategy(add);
        executeStrategy(multiply);
    }

    static void executeStrategy(BiFunction<Integer, Integer, Integer> strategy) {
        int result = strategy.apply(10, 5);
        System.out.println("Result: " + result);
    }
}
