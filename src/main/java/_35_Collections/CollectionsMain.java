package _35_Collections;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        //List , Map , Set -> 제너릭 클래스. 제너릭 : 컴파일 시점에 타입을 추론 , 런타임 시점에 Object로 취급
        //기본자료형은 제너릭 취급 불가. -> 런타임때 Object 취급을 받기위해서 참조자료형이어야 함.기본자료형은 Object의 상속을 안받기 때문.
     List<Integer> number = new ArrayList<>();
     number.add(3);
     number.add(1);
     number.add(4);
     number.add(2);
     number.add(5);

     System.out.println("원본 상태 : " + number);
     //정렬(원본 조작)
        Collections.sort(number);
        System.out.println("정렬 후 : " + number);
        Collections.reverse(number);
        System.out.println("역순 정렬 : " + number);

        //최대 , 최소
        Integer max = Collections.max(number);
        Integer min = Collections.min(number);


    }
}
