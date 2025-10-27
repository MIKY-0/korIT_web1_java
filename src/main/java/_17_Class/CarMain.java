package _17_Class;
/*
        (문제1)클래스 정의.
        클래스 : Car / 필드 : brand , model(모델명) , year(출시년도)
        main에서 "현대-소나타-2023년식" 출력.
        main에서 Car객체 생성 , 객체 필드에 접근해서 현대 , 소나타 , 2023으로 초기화
         */
class Car{
    String brand;
    String model;
    int year;
}

public class CarMain {
    public static void main(String[] args) {
        Car c =  new Car();
        c.brand = "현대";
        c.model = "소나타";
        c.year = 2023;
        System.out.printf("%s - %s - %d년식" , c.brand , c.model , c.year);
    }
}
