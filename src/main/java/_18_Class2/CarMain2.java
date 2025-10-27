package _18_Class2;

public class CarMain2 {
    public static void main(String[] args){
        Car c = new Car();
        c.speed = 0;
        c.isEngineOn = false;

        c.engineStart(); //시동 on. 객체의 상태(필드값)을 메서드로 접근하여 변경
        c.accelerate();
        c.accelerate();
        c.brake();
        c.showStatus();
        c.engineStop();


    }
}
