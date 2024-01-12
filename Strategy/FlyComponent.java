package DesignPattern.Strategy;

interface FlyComponent {
    public void fly();
}

class FlyWithWinds implements FlyComponent {
    public void fly() {
        System.out.println("I'm flying.");
    }
}

class FlyNoWay implements FlyComponent {
    public void fly() {
        System.out.println("I can't fly.");
    }
} 
