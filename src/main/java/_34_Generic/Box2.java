package _34_Generic;

public class Box2<T> { //클래스명<'대문자'> -> 해당클래스내에서 가상의 타입(대문자)를 쓸 수 있다.
    private T item;

    public Box2(T item) {
        this.item = item;
    }
}
