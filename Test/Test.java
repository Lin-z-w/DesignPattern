package DesignPattern.Test;

import DesignPattern.Strategy.*;

public class Test {
    public static void main(String[] args) {
        MallerDuck mallerDuck = new MallerDuck();
        mallerDuck.performFly();
        mallerDuck.performQuack();
    }
}
