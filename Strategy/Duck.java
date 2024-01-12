package DesignPattern.Strategy;

/**
 * Duck
 */
abstract class Duck {
    FlyComponent flyComponent;
    QuackComponent quackComponent;
    
    public void performFly() {
        flyComponent.fly();
    }

    public void performQuack() {
        quackComponent.quack();
    }
}