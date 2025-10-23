package _15_Method;

public class Method {
    public static void hello(){ // 매개변수,리턴값 둘다 x
        System.out.println("안녕하세요");
    }// 함수 정의
    public static void main(String[] args) {
        System.out.println("함수 호출 전");
        hello(); // 함수 호출. 같은 클래스 내에 있어서 생성자 안해도됨.
        System.out.println("함수 호출 후");

    }
}
