package lambdas.powtorka;

import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Runnable myRunnable = () -> System.out.println("akcja");
        myRunnable.run();

        myRunnable = () -> {
            System.out.println("akcja1");
            System.out.println("akcja2");
        };
        myRunnable.run();

        Consumer<String> myConsumer = s -> System.out.println(
                "przekazano jako parametr " + s);
        myConsumer.accept("abcde");

        Function<String, Integer> myFunction = s -> s.length();
        System.out.println(myFunction.apply("ABCD"));
    }
}
