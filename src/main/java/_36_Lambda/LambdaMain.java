package _36_Lambda;

public class LambdaMain {
    public static int calcNum(int num1 , int num2 , Calculator calculator){
        return calculator.calculate(num1 , num2);
    }
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        Calculator multi = new Calculator() { // multi의 실제 타입은 add와 다른 클래스타입이다. 둘다 같은 익명클래스 객체지만 사실 서로 다른 익명클래스 객체.
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        //어차피 인터페이스에 정의된 메서드가 하나이기 때문에 그 메서드 정의만 새롭게 해주자(다른 불필요 코드 생략)
        Calculator lambdaAdd = (int a , int b) -> {
            return a + b;
        };
        // lambdaMulti 축약 정의.
        Calculator lambdaMulti = (int x , int y) -> {
            return x * y;
        };
        //Calculator의 메서드는 어차피 1개. 메서드 시그니처 특정가능 -> 매개변수 타입도 특정 가능.
        //한줄 리턴이 가능하면 중괄호 + return 키워드 생략가능
        Calculator lambdaAdd2 = (a , b) -> a + b;

        //lambdaMulti 축약 정의
        Calculator lambdaMulti2 = (x , y) -> x * y;

        System.out.println(lambdaAdd2.calculate(10 , 5));
        System.out.println(lambdaMulti2.calculate(10 , 5));

        calcNum(10 , 5 , lambdaAdd2);
        //익명클래스는 정의와 동시에 생성 -> 매개변수로 익명클래스를 받는 경우
        //인라인으로 정의를 함과 동시에 매개변수로 전달할 수 있다.
        calcNum(10 , 5 , (a , b) -> a + b);

    }
}
