package _22_Static;

public class StaticMethod {
    private int instanceValue; // 객체마다 가지고있음
    private static int staticValue; //클래스마다 가지고있음(이 클래스로 나온 모든 객체가 공유)

    public static void staticMethod(){ // 스태틱 메서드
        //인스턴스 메서드 호출 불가 이유 : 인스턴스 메서드는 this(초기화하면 생김)를 가지고 있기 때문
        //this도 사용 불가능. -> 객체가 생성되기 전에 메모리에 로드됨.
    }
    public void instanceMethod(){ //인스턴스 메서드
    //인스턴스 메서드에서는 스태틱 사용가능! 스태틱이 메모리에 먼저 로드되기 때문에. 실행시 이미 메모리에 있음
    }
}
