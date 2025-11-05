package _34_Generic;

public class BoxMain {
    public static void main(String[] args) {
        Box b1 = new Box("아이템1");
        Box b2 = new Box(20); //<- 1.String밖에 못넣지만 나는 20을 넣고 싶다. //3.되는이유 : Object가 최상위 객체이기 때문에 업캐스팅 된것.(Integer -> Object).

        if(b1.getItem() instanceof String){
            Object item = b1.getItem();
            String str = (String) item; //업캐스팅해서 데이터를 넣어줬기 때문에 다운캐스팅 해줘야됨.
            System.out.println(str);
        }
        //1.코드가 방대해짐.  2.다운캐스팅에는 런타임에러가 발생할 수 있기 때문. -> 그래서 제네릭 출시
        System.out.println(b1.getItem()); // Object객체 꺼내옴
        System.out.println(b2.getItem()); // Object객체 꺼내옴

        Box2<String> stringBox = new Box2<String>("<String형 데이터>");
        Box2<Integer> intBox = new Box2<>(10); // <>사이에 타입 생략 가능.

    }
}
