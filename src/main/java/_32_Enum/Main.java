package _32_Enum;

public class Main {
    public static double dc(int price , ClassGrade grade){
        int dcRate = 0;
        if(grade == ClassGrade.BASIC){
            dcRate = 5;
        }
        return price * dcRate / 100.0;
    }

    public static void main(String[] args) {
        int price = 10000;
        double result = dc(price , ClassGrade.BASIC); // 매개변수로 기존 상수의 경우 int나 String 타입을 받았기 때문에 상수를 선언해도 문법적으로 아무 문자나 숫자 넘길 수 있었다.
        //하지만 객체를 상수처럼 쓰면 컴파일 시점에 에러를 띄움으로서 문법적으로 상수를 쓰도록 강제할 수 있다.
        System.out.println(result);


    }
}
