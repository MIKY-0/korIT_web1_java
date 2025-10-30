package _24_Inheritance.car;

public class Main {
    public static void main(String[] args) {
        ElectricCar t = new ElectricCar();

        /*상속관계에서 메서드 호출시 순서
        move()가 호출되면 move()를 자식클래스에 있는지 먼저 탐색. 없으면 부모클래스에 있는지 탐색.
         */
        t.move();
        t.openDoor();
        t.moveWithInfo(); //super.move()를 내부적으로 호출 중

        GasCar g = new GasCar("현대");
        System.out.println("-------------------------------");
        //오버라이드하면 자식메서드 호출되고 부모 메서드 무시
        g.move();
        g.showInfo();
    }
}
