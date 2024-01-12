package DesignPattern.Strategy;

interface QuackComponent {
    public void quack();
}

/**
 * Quack
 */
class Quack implements QuackComponent {
    public void quack() {
        System.out.println("quack!");
    }
}

/**
 * MuteQuack
 */
class MuteQuack implements QuackComponent {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
