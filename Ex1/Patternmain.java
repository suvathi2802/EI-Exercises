import behavioural.ObserverPattern;
import behavioural.Strategy;
import creational.Factory;
import creational.Singleton;
import structural.Adapter;
import structural.Decorator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern ===");
        new ObserverPattern().main(null);

        System.out.println("\n=== Strategy Pattern ===");
        new Strategy().main(null);

        System.out.println("\n=== Singleton Pattern ===");
        new Singleton().main(null);

        System.out.println("\n=== Factory Pattern ===");
        new Factory().main(null);

        System.out.println("\n=== Adapter Pattern ===");
        new Adapter().main(null);

        System.out.println("\n=== Decorator Pattern ===");
        new Decorator().main(null);
    }
}
