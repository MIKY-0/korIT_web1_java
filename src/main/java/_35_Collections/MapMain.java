package _35_Collections;

import _28_Object.ObjectStudent;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String , Integer> studentMap = new HashMap<>();
        //추가
        studentMap.put("김자바" , 90);
        studentMap.put("이파이썬" , 85);
        studentMap.put("박스프링" , 92);
        /*
        {"김자바" : 90,
        "이파이썬" : 85,
        "박스프링" : 92 }  이렇게 저장되어있음.
         */
        //조회 value가 리턴. 맵메서는 키 중복 불가능. 중복 되면 나중에 들어오는 key-value가 기존값을 덮어씀. 중복이 안되게하는 방법이 해쉬함수.
        System.out.println(studentMap.get("김자바"));
        studentMap.put("김자바" , 100);
        System.out.println(studentMap.get("김자바"));
//↓ 28번패키지 ObjectStudent클래스 가져옴        //만약 key로 객체 쓰는 경우 어떻게 중복을 판단? 1.주소가 같으면 같게.  2. 필드가 같으면 같게.
        //hashCode() , equals()의 결과가 모두 동일하면 같은객체. 같은 객체면 key로 사용할 때 중복제거의 대상이 됨.
        Map<ObjectStudent , Integer> myMap = new HashMap<>();
        //크기
        System.out.println(studentMap.size());
        //제거
        studentMap.remove("박스프링");
        //studentMap.remove("안녕"); // 없는 키 제거해도 아무일도 안일어남.(Map의 키는 Set으로 구성되어져서.) 런타임 , 컴파일 에러 없음.
        System.out.println();
        //Map을 for문으로 순회.
        //1. key들만 따로 뽑아내서 for문으로 일일이 get해주는 방법
        Set<String> keys = studentMap.keySet(); // 모든키를 Set으로 리턴
        //keySet()메서드 내부에서 for문을 사용하고 있다.
        for(String key : keys){
            Integer value = studentMap.get(key);
            System.out.println(key + " : " + value);
        }

        /*Map안에 Map가능
            {
            "홍길동" : {
            "주소" : "부산",
            나이 : 20
            },
            "김길동" : {
            "주소" : "서울",
            나이 : 29
            }
           }
       --------------------------------------
       Set안에 Map가능
       중복제거 -> Map클래스의 hashCode() , equals()가 사용됨.key가 기준이 되어서 중복 제거됨.
         */
        //2.키-값을 한번에 set으로 바꿔서 키-값 쌍 순회
        Set<Map.Entry<String , Integer>> entries = studentMap.entrySet();

        for(Map.Entry<String , Integer> entry : entries){
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println(name + " : " + score);
        }
        //두가지 방법 모두 성능 비슷. 방법1) keySet() + .get() -> 매 반복마다 해시탐색.  방법2) entrySet() -> 해시탐색 1회로 키 + 값 모두 접근.
        //데이터개수가 많아질수록 방법2가 더 좋음. 방법2 권장.
    }
}
