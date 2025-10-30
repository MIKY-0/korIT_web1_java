package _24_Inheritance.car;

public class ElectricCar extends Car{
    //protected brand필드를 가지게 됨.부모의 필드를 먼저 초기화 -> 자식의 필드 초기화. 항상 super먼저!!
    private int batteryLV;

    public ElectricCar(){ //자식 기본생성자
        super(); //부모 생성자 호출. 필수! 기본생성자는 생략가능.
        //부모의 필드를 먼저 초기화 -> 자식의 필드 초기화. 항상 super먼저!!
        System.out.println("전기차 생성자 호출");
        this.batteryLV = 100;
    }
    /*전기차 힙메모리
    [brand영역] | [batteryLV영역] -> 전체는 this , brand만 super를 가리킴. JVM이 부모부분만 구분.
    필드 : 힙에서 부모영역만 탐색해서 보겠다.
    메서드 : 부모클래스 기준에서 호출하겠다.
     */
    public ElectricCar(String brand){
        super(brand);
        this.batteryLV = 100;
    }
    public void moveWithInfo(){
        super.move();
        System.out.println("배터리 잔량 : " + this.batteryLV);
    }
    public void showDetailInfo(){
        super.showInfo();
        System.out.println("차종 :  전기차");
        System.out.println("배터리 잔량 : " + this.batteryLV);
    }
    public void charge(){
        System.out.println("배터리 충전");
        this.batteryLV = 100;
    }

}
