package _17_Class;

public class ClassMain {
    public static void main(String[] args) {
        int score[] = {80,90,40,60,50};
        String name[] = {"홍길동0","홍길동1"};

        Student st1 = new Student();
        Student st2 = new Student();
        //st1과 st2는 객체의 주소를 담은 변수.
        //st1과 st2 Student 클래스로 만들어진 객체.
        //st1과 st2는 실제로는 변수이지만 객체,인스턴스라고도 말하기도 함.(엄밀히 말하면 객체,인스턴스는 아님)
        st1.name = "홍길동";
        st1.kor = 90;
        st1.eng = 80;
        st1.math = 70;

        Student st[] = {st1 , st2};


    }
}
