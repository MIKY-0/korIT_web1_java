package _38_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
    List<String> names = Arrays.asList("김자바" , "이파이썬" , "박스프링" , "최코틀린" , "김자바" , "정리액트"); // 리스트 생성
    Consumer<String> printer = name -> System.out.println(name);
        names.stream().forEach(name -> System.out.println(name)); //리스트를 스트림으로 변환(names.stream()). 인라인으로 Consumer 구현 / 주입.
        //printer를 name -> System.out.println(name)로 바꿔서 넣은것. forEach()같은 함수들을 Stream 연산이라고 함.
        //Stream 연산 종류 : 1.중간연산(체이닝 가능 , 최종연산 하기 전까지 실행 X.(지연) 지연 - 쉽게말해 게임에서 내가 보는 화면만 계산 하고 시점을 돌리면 그때의 화면을 계산)
        // 2.최종연산(마무리 , 체이닝 불가능 ) -> 스트림을 소모 , 최종연산시 중간연산들을 실행.

        //중간연산 1.filter(Predicate<T> p). -> true인 결과 데이터만 필터링함.
        List<String> kims = names.stream() // kims로 새로 만들어줌 : 원본 보존을 위해.
                .filter(name -> name.startsWith("김")) // 김씨로 시작하는 이름 추출. 중간연산
                .collect(Collectors.toList()); // 최종연산
        System.out.println(kims);

        //중간연산 2.map(Function<T , R> f) -> Function데이터를 변환할 때 사용.
        List<String> nims = names.stream()
                            .map(name -> name + "님")
                            .collect(Collectors.toList());
        System.out.println(nims);

        //중간연산 3.distinct() -> 중복제거(객체를 다룰 경우 equals , hashcode 비교)   4.limit(개수) -> 개수제한
        List<String> unique3Name = names.stream()
                .distinct()
                .filter(name -> name.length() == 3 ) // 이름 3글자인 사람만 추출.
                .limit(2) // 2명만 추출  만약 map을 넣는다면 filter이후 하는게 오버헤드 적을듯.
                .collect(Collectors.toList());
        System.out.println(unique3Name);

        //최종연산 1. collect(Collector<T , A , R> c) -> 내부적으로 여러 함수형 인터페이스 조합.(복잡) 보통 직접 구현해서 넣지않고 미리 정의되어 있는 것을 사용하는게 일반적.
        //Collectors.toList() , Collectors.toSet()
        //2. forEach(Consumer<T> c)
        names.stream() // 스트림화
                .filter(name -> name.length() == 4) // 중간연산
                .forEach(name -> System.out.println(name)); // 최종연산
    }
}
