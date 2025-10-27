package _19_Constructor;

public class ConstructorMain {
    public static void main(String[] args) {
        Student st1 = new Student("한승환" , 85 , 90 , 95); // 직접접근이아닌 메서드로 우회해서 접근하는것과 비슷.
        st1.name = "홍길동"; // 직접접근


    }
}
