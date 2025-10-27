package _18_Class2;

class Car {
    int speed;
    boolean isEngineOn;

    //객체의 필드값(상태)들을 변경할 때 , 논리적으로 검증된 값이 오게끔 메서드 작성.
    void engineStart() {
        isEngineOn = true;
        System.out.println("자동차 시동 켬");
    }

    void engineStop() {
        isEngineOn = false;
        speed = 0;
        System.out.println("자동차 시동 꺼짐");
    }

    void accelerate() {
        if (!isEngineOn) {
            System.out.println("시동 먼저 켜라");
            return;
        }
        speed += 20;
    }

    void brake() {
        speed -= 20;
        if (speed < 0) {
            speed = 0;
        }
    }

    void showStatus() {
        System.out.println("자동차 계기판 출력");
        if (isEngineOn) {
            System.out.println("시동 on");
            System.out.println("현재 속도 : " + speed);
        } else {
            System.out.println("시동 off");
        }
    }
}
public class CarMain1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed = 0;
        c.isEngineOn = false;

        System.out.println("자동차 시동 켬");
        c.isEngineOn = true; // 시동켜기
        c.speed += 20;
        c.speed -= 100;
        System.out.println(c.speed);
        if(c.speed < 0){
            c.speed = 0;
        }
        System.out.println(c.speed);
        //객체의 상태(speed , isEngineOn의 값)가 바뀔때 마다 검증하는 코드를 작성해줘야함.
    }

}
