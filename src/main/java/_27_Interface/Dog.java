package _27_Interface;

public class Dog implements Swimmable , Animal{ // 강아지 - Animal , Swimmable 가능


    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지가 깡총");
    }

    @Override
    public void swim() {
        System.out.println("강아지가 어푸어푸");
    }
}
