package _35_Collections;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(); // 크기 지정 , 크기 제한 하지 않았음.
        //추가
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");
        fruits.add("포도");
        fruits.add("딸기");
        fruits.add(1 , "망고"); // 인덱스 지정해서 추가. 1번 인덱스에 망고를 추가하고 그 뒤 인덱스들은 한칸씩 밀려남.
        //길이
        System.out.println(fruits.size());
        //접근
        System.out.println(fruits.get(0));
        //수정
        fruits.set(0 , "자두");
        System.out.println(fruits.get(0));
        //제거 제거하면 해당 인덱스가 비어있는게 제거한 인덱스 뒤 부터 한칸씩 앞당겨짐.
        fruits.remove(1);
        System.out.println(fruits.get(1));
        fruits.remove("키위");
        //포함여부
        System.out.println(fruits.contains("바나나"));


    }
}
