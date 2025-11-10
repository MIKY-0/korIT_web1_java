package _37_Lambda2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaMain {
    public static void main(String[] args) {
    Calculator add = new Calculator() { // 익명클래스를 포장지로 사용한 예시.
        //add : Calculator 인터페이스를 이식받은 익명클래스 객체를 담은 변수.
        @Override
        public int calculate(int num1, int num2) {
            return num1 + num2;
        }
    };
    // 생략 가능. Calculator 인터페이스에 선언된 추상메서드가 하나밖에 없기때문에 시그니처 특정 가능.
        Calculator lambdaAdd = (num1 , num2) -> num1 + num2; // 메서드명 , 매개변수타입 , 리턴타입 생략 됨.

        Modifier<Integer , String> numToString = num -> "" + num;
       System.out.println(numToString.modify(10));

        List<String> names = List.of("홍길동" , "김길동" , "박길동" , "이길동");
        //Modifier를 사용해서 names에 있는 이름들 뒤에 "님" 붙이기
        List<String> nims = new ArrayList<>();
        Modifier<String , String> addNim = name -> name + "님";
        for(String name : names){
           String modifiedName = addNim.modify(name);
           nims.add(modifiedName);
        }
        //제너릭 함수형 인터페이스를 선언하니까 비슷한 역할의 인터페이스 중복을 피할수 있다!!
        //표준 함수형 인터페이스 -> stream API에서 사용.
        /*
        1.Function<T , R> : T를 받아서 R로 리턴.(변환)
        2.Consumer<T> : T를 받아서 void.(출력). 매개변수를 받지만 리턴이 없음.
        3.Supplier<T> : 매개변수 x , T타입을 생성.(new)
        4.Predicate<T> : T를 받아서 boolean반환.(조건검사)
         */
        //인터페이스명 : Function<T , R> / 메서드 시그니처 : R apply(T t)
        Function<String , String> addNim2 = name -> name + "님";
        System.out.println(addNim.modify("이순신"));
        System.out.println(addNim2.apply("이순신"));

        //인터페이스명 : Consumer<T> / 메서드 시그니처 : void accept(T t)
        Consumer<String> printer = msg -> System.out.println(msg);
        printer.accept("람다로 만든 프린터");

        //인터페이스명 : Supplier<T> / 메서드시그니처 : T get()  객체생성 , 커스텀에러(얘도 객체) 생성 할 경우 사용.
        Supplier<String> anyName = () -> "아무개";
        System.out.println(anyName.get());

        //인터페이스명 : Predicate<T> / 메서드 시그니처 : boolean test(T t)
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10));

        test(name -> name + "님" ,"홍길동"); // addNim : 메서드를 변수에 담는 것 처럼 보임. 실제로는 익명클래스 객체에 포장된 메서드.
        //매개변수에 인라인으로 메서드를 정의하면서 전달.

        //(문제1) "구마유시" 가 이름이 3글자 초과인지 검사. 이름이 3글자 초과인지 검사하는 Predicate구현체 구현.
        //test2() 에 "구마유시", Predicate 구현체 전달해서 작동.
        Predicate<String> over3Name = name -> name.length() > 3;
        test2(over3Name , "구마유시");
    }

    //test같이 표준 함수형 인터페이스를 매개변수로 받는 표준 함수(stream에서 출현)
    public static void test(Function f , String name){
        System.out.println(f.apply(name));
    }
    public static void test2(Predicate p , String name){
        System.out.println(p.test(name));
    }
}
