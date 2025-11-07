package _36_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        //list.of() : 불변객체로 생성됨.변경불가
        List<String> customerNames = List.of ("홍길동" , "박길동" , "김길동" , "최길동");
        //(문제1) 람다로 customerNames에 담긴 이름들 뒤에 "님"을 붙히는 코드.
        List<String> nims = new ArrayList<>(); // 바꾼걸 여기에 넣어줌.
        StringProcessor makeNim = s -> s + "님";
        for(String name : customerNames){
            String addNim = makeNim.process(name);
            nims.add(addNim);
        }
        System.out.println(nims);

        List<String> lowers = List.of("aaa" , "bbb" , "ccc" , "ddd");

        //StringProcessor를 재정의해서 람다식으로 lowers에 있는 소문자들을 모두 대문자로 만들어서 출력.
        List<String> uppers = new ArrayList<>();
        StringProcessor toUpper = s -> s.toUpperCase();
        for(String u : lowers){
            String makeU = toUpper.process(u);
            uppers.add(makeU);
        }
        System.out.println(uppers);

        List<String> names = List.of(".김풍" , "침착맨" , "이순신" , "홍길동" , "을지문덕" , "페이커" , "손" , "쵸비");
        //이름이 3글자 미만인 이름들만 추출.
        StringChecker is3Name = s -> s.length() < 3;
        List<String> under3Names = new ArrayList<>();
        for(String name : names){
            if(is3Name.check(name)){
                under3Names.add(name);
            }
        }
        System.out.println(under3Names);

        List<String> inputs = List.of("hello" , "" , "world!" , "" , "java" , "");
        //빈문자열이면 true , 아니면 false. notEmptyStrings에 빈문자열 제외해서 추가
        List<String> notEmptyStrings = new ArrayList<>();
        StringChecker isEmptyInput = s -> !s.isEmpty();
        for(String input : inputs){
            if(isEmptyInput.check(input)){
                notEmptyStrings.add(input);
            }
        }
        System.out.println(notEmptyStrings);



    }
}
