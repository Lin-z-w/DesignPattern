package DesignPattern.Strategy;

public class MallerDuck extends Duck {
    public MallerDuck() {
        flyComponent = new FlyWithWinds();
        quackComponent = new Quack();
    }
}
