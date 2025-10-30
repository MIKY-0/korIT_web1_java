package _24_Inheritance.car;

public class GasCar extends Car{
    private int fuelLV;
    public GasCar(){
        //super(); 생략가능
        System.out.println("GasCar기본 생성자");
        this.fuelLV = 100;
    }
    public GasCar(String brand){
        super(brand); //이코드를 생략하면 자동으로 super()가 생성.
        this.fuelLV = 100;
    }
    //오버라이딩
    //오버라이딩되려면 부모의 메서드시그니처와 완전 동일해야함.
    @Override
    public void move(){
        System.out.println("가솔린차 이동");
    }
    @Override
    public void showInfo(){
        System.out.println("브랜드 : " + super.brand);
        System.out.println("차종 : 가솔린차");
        System.out.println("연료 : " + this.fuelLV);
    }
}
