package _24_Inheritance.car;
//부모 클래스 - 기초 설계도(공통부분) 역할.
// 모든 차가 가져야할 공통 필드 , 기능들을 정의
//공통필드 , 곧통기능을 추려내는 것 -> 추상화
public class Car {
    //상속 - 부모의 protected , public 필드와 메서드들을 물려받음.
    //재사용성 증가.(초기에 이 특징떄문에 많이 썼지만)
    //상속 계층구조를 통한 다형성 구현(현재는 이 장점때문에 많이 사용)
    //여러번 사용할 필드나 메서드를 복붙하기보단 상속해서 사용하겠다.

    private int yaer; //출시년도
    protected String brand; //브랜드. 상속받는 클래스만 접근가능

    public Car() {
        System.out.println("기본 생성자 호출");
        this.brand = "기본차";
    }
    public Car(int yaer, String brand) { //전체초기화 생성자
        this.yaer = yaer;
        this.brand = brand;
    }
    public Car(String brand) {
        System.out.println("부모 생성자 호출 " + brand);// 상속되는 필드 생성자
        this.brand = brand;
    }
    //아래 코드들은 Car를 상속하면 가지고 있는 공통 메서드
    public void move(){
        System.out.println("기본차 이동");
    }
    public void openDoor(){
        System.out.println("차문 연다");
    }
    public void showInfo(){
        System.out.println("기본차 showInfo 호출");
        System.out.println("브랜드 : " + brand);
    }
}
