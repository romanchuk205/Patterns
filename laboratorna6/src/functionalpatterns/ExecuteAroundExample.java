package functionalpatterns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class ExecuteAroundExample {
    public static void run() throws IOException {
        System.out.println("\n--- Execute Around Pattern ---");

        String line = processFile(br -> {
            try {
                return br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        System.out.println("Read from file: " + line);
    }

    public static String processFile(Function<BufferedReader, String> processor) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            return processor.apply(br);
        }
    }
}
