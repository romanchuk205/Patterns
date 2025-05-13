package functionalpatterns;

import java.util.function.Supplier;

class Product {
    public void info() {
        System.out.println("Product created!");
    }
}

public class FactoryExample {
    public static void run() {
        System.out.println("\n--- Factory Method Pattern ---");

        Supplier<Product> factory = Product::new;
        Product product = factory.get();
        product.info();
    }
}
