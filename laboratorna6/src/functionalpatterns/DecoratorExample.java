package functionalpatterns;

import java.util.function.Function;

public class DecoratorExample {
    public static void run() {
        System.out.println("\n--- Decorator Pattern ---");

        Function<String, String> base = s -> s;
        Function<String, String> encrypted = base.andThen(s -> "encrypted(" + s + ")");
        Function<String, String> compressed = encrypted.andThen(s -> "compressed(" + s + ")");

        String result = compressed.apply("file data");
        System.out.println("Final result: " + result);
    }
}
