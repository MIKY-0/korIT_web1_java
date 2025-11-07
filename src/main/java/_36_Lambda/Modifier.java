package _36_Lambda;
@FunctionalInterface
public interface Modifier<T> { // Person을 제너릭 T로 바꿔서 가능 -> 그렇게 되면 Practice2 클래스에서 Modifier뒤에 <Person>을 붙여줘야됨. 제너릭 안쓰면 Modifier뒤에 <Person>지워주자
    T  modify(T t);
}
