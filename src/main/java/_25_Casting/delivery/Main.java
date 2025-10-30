package _25_Casting.delivery;

public class Main {
    public static void main(String[] args) {
        //업캐스팅상태로 생성
        Delivery d1 = new Normal(10 , 5) ;
        Delivery d2 = new Fast(10 , 5) ;
        Delivery d3 = new Slow(10 , 5) ;
        Delivery dlist[] = {d1 , d2 , d3};

        //다형성 : 같은 메서드를 호출 -> 서로 다른 동작
        //컴파일러 에러 회피 가능이유 : 오버라이딩된 메서드(부모도 같은 메서드가 있다)
        //JVM 에러 회피 가능 이유 : 실제객체기준으로만 메서드 호출.
        for(Delivery d : dlist){
            d.printInfo();
        }
    }
}
