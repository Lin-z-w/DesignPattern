package DesignPattern.Strategy;


public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallerDuck mallerDuck = new MallerDuck();
        mallerDuck.performFly();
        mallerDuck.performQuack();
    }
}
