package _27_Interface;

public class Duck implements Flyable , Animal , Swimmable{
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    @Override
    public void move() {
        System.out.println("오리가 뒤뚱뒤뚱");
    }

    @Override
    public void fly() {
        System.out.println("오리 날다");
    }

    @Override
    public void swim() {
        System.out.println("오리수영");
    }
}
