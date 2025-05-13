import java.util.*;
import java.util.stream.*;

public class LambdaLab {

    // 1. Відфільтрувати непарні числа
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
    }

    // 2. Знайти середнє значення
    public static OptionalDouble calculateAverage(List<Double> numbers) {
        return numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average();
    }

    // 3. Сортувати список рядків в алфавітному порядку
    public static List<String> sortAlphabetically(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // 4. Сума всіх парних чисел
    public static int sumEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 5. Факторіал числа
    public static long factorial(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (a, b) -> a * b);
    }

    // 6. Множення та підсумовування всіх елементів
    public static Map<String, Integer> sumAndProduct(List<Integer> numbers) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int product = numbers.stream().reduce(1, (a, b) -> a * b);
        Map<String, Integer> result = new HashMap<>();
        result.put("Sum", sum);
        result.put("Product", product);
        return result;
    }

    // 7. Квадрат кожного числа
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // 8. Сортувати рядки за довжиною
    public static List<String> sortByLength(List<String> strings) {
        return strings.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    // 9. Кількість слів у реченні
    public static long countWords(String sentence) {
        return Arrays.stream(sentence.trim().split("\\s+"))
                .filter(word -> !word.isEmpty())
                .count();
    }

    // 10. Перший непорожній рядок
    public static Optional<String> firstNonEmpty(List<String> strings) {
        return strings.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();
    }

    // 11. Чи всі рядки починаються з великої літери
    public static boolean allStartWithCapital(List<String> strings) {
        return strings.stream()
                .allMatch(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)));
    }

    // 12. Друге за величиною число
    public static Optional<Integer> secondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
    }

    // 13. Найбільше парне число
    public static Optional<Integer> largestEven(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);
    }

    // Main для демонстрації
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5);
        List<String> strings = Arrays.asList("Apple", "banana", "Cherry", "", "date");

        System.out.println("1. Odd Numbers: " + filterOddNumbers(numbers));
        System.out.println("2. Average: " + calculateAverage(doubles).orElse(Double.NaN));
        System.out.println("3. Sorted Alphabetically: " + sortAlphabetically(strings));
        System.out.println("4. Sum of Even Numbers: " + sumEvenNumbers(numbers));
        System.out.println("5. Factorial of 5: " + factorial(5));
        System.out.println("6. Sum and Product: " + sumAndProduct(numbers));
        System.out.println("7. Squares: " + squareNumbers(numbers));
        System.out.println("8. Sorted by Length: " + sortByLength(strings));
        System.out.println("9. Word Count: " + countWords("This is a test sentence"));
        System.out.println("10. First Non-empty String: " + firstNonEmpty(strings).orElse("None"));
        System.out.println("11. All Start With Capital: " + allStartWithCapital(strings));
        System.out.println("12. Second Largest: " + secondLargest(numbers).orElse(null));
        System.out.println("13. Largest Even: " + largestEven(numbers).orElse(null));
    }
}
