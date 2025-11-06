package _35_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        //추가
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apple");
        System.out.println(fruits);
        //길이
        System.out.println(fruits.size());
        //포함여부 확인. 해쉬함수 사용하기 때문에 매우 빠름.(조회가 빠름. 제거도 빠름.순서가 없음)
        System.out.println(fruits.contains("banana"));
        System.out.println(fruits.remove("apple"));
        // fruits.remove("안녕"); // 없는 자료면 아무일도 안일어남.(Set 특징)
        //집합연산
        Set<String> name1 = new HashSet<>();
        Set<String> name2 = new HashSet<>();

        name1.add("홍길동"); name1.add("고길동"); name1.add("박길동");
        name2.add("김길동"); name2.add("최길동"); name2.add("박길동");
        //합집합
        Set<String> union = new HashSet<>(name1);
        union.addAll(name2); // name2의 모든요소를 name1에 add 수행. name1 + name2
        System.out.println(union);
        //교집합
        Set<String> intersection = new HashSet<>(name1);
        intersection.retainAll(name2); //중복값만 남김.
        System.out.println(intersection);
        //차집합
        Set<String> difference = new HashSet<>(name1);
        difference.removeAll(name2);
        System.out.println(difference);
        //문자열.split() : 특정 문자열 기준으로 문자열을 분리해서 배열로 리턴
        String str1 = "my name is Son";
        String mystr[] = str1.split(" ");
        System.out.println(Arrays.toString(mystr));

        //(문제1)아래 문장에서 중복단어들을 제거. split -> 배열 -> Set으로 변환(for문)
        String text = "java is good java is powerful";
        String myText[] = text.split(" ");
        Set<String> a = new HashSet<>();

        for(String my : myText){
            a.add(my);
            System.out.println(a);
        }


    }
}
