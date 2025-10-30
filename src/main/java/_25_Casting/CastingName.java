package _25_Casting;

import _24_Inheritance.car.Car;
import _24_Inheritance.car.ElectricCar;
import _24_Inheritance.car.GasCar;

public class CastingName {
    public static void main(String[] args) {
        //상속에서의 캐스팅 : 1.업캐스팅.자동형변환(자식 -> 부모.자식이 부모로 변환되니 기능 감소)  2.다운캐스팅.강제형변횐(부모 -> 자식.부모가 자식으로 변환되니 기능 증가)

        Car c1 = new ElectricCar("현대"); //new로 만들어진건 자식클래스. 변수타입은 부모클래스
        Car c2 = new GasCar("르노삼성");
        //c1.charge(); 업캐스팅(자동형변환)되어서 ElectricCar의 메서드 호출 불가
        ElectricCar ec = (ElectricCar) c1; //다운캐스팅.강제형변환
        ec.charge();
        /* 컴파일러 / JVM을 구분해서 생각하자. 객체 초기화에서 Car c1 = new ElectricCar("현대");
        좌변은 컴파일러 , 우변은 JVM. 컴파일러는 변수타입만 고려해서 코드해석.JVM은 실제 메모리에 올라간것만 고려해서 작동.
        */
        //다운캐스팅 주의사항!!
         //ElectricCar ec2 = (ElectricCar) c2; //GasCar c2객체를 ElectricCar로 형변환 불가. 서로 직접적인 상속이 아니라서. 근데 오류가 발생하지 않는 이유는
        //컴파일러가 변수타입만 고려해서 코드해석하기 때문. 하지만 런타임 오류 발생.
        // 쉽게말해 , 컴파일러는 Car -> ElectricCar로 다운캐스팅 허용. 하지만 JVM은 실제 올라가는 메모리를 고려하기 때문에 힙에 [battery | model]초기화 해야되는데
        //c2는 battery필드가 없음. 그래서 런타임 오류.
        //instanceof
        System.out.println(c2 instanceof ElectricCar);

        //안전한 다운캐스팅
        if(c2 instanceof ElectricCar){
            ElectricCar ec2 = (ElectricCar) c2;
        }else if(c2 instanceof GasCar){
            GasCar gc = (GasCar) c2; //c2는 GasCar클래스로 만들었고 Car타입인데 c2가 GasCar에 포함되면 c2를 GasCar타입으로 변환
        }

        Car t = new ElectricCar("모델S"); // ElectricCar클래스로 만든 Car타입이라서 둘다 true.
        //instanceof 원리 : 왼쪽객체가 오른쪽 타입에 대입 가능한가?
        System.out.println(t instanceof ElectricCar);
        System.out.println(t instanceof Car);
        System.out.println(t instanceof GasCar);


    }
}
