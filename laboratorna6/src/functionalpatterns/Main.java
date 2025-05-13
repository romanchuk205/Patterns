package functionalpatterns;

public class Main {
    public static void main(String[] args) {
        StrategyExample.run();
        FactoryExample.run();
        DecoratorExample.run();

        try {
            ExecuteAroundExample.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
