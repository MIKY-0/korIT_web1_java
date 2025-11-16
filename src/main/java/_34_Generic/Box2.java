package _34_Generic;

public class Box2<T> { //클래스명<'대문자'> -> 해당클래스내에서 가상의 타입(대문자)를 쓸 수 있다.
    private T item;

    public Box2(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    //메서드가 제너릭 타입의 매개변수를 받을때 정의하는법. void 앞에 있는 <T>: 이 메서드에서 사용할 타입 매개변수(type parameter)를 정의
    public static <T> void printBoxData(Box2<T> box){
        System.out.println(box.getItem());
    }
//   메인함수에서 사용 방법.
//     Box2<String> b = new Box2<>("hello");
//     Box2.printBoxData(b);            // 타입 추론으로 동작
//     Box2.<String>printBoxData(b); // 둘다 같은 코드.얘는 정확하게 명시한것.
}
