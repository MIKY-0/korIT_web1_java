package _36_Lambda;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("홍길동" , 18),
                new Person("김자바" , 22),
                new Person("이파이썬" , 30),
                new Person("박리액트" , 15)
        );
        //람다로 20세 이상 추출.
        PersonChecker adultChecker = p -> p.getAge() > 20;
        List<Person> adults = new ArrayList<>();
        for(Person person : people){
            if(adultChecker.check(person)){
                adults.add(person);
            }
        }
        System.out.println(adults);


        //이름이 3글자 초과이면서 성인인 사람 추출.
        List<Person> result = new ArrayList<>();
        PersonChecker adName = p -> p.getName().length() > 3 && p.getAge() >= 20;

        for(Person person : people){
            if(adName.check(person)){
                result.add(person);
            }
        }
        System.out.println(result);

        //이름의 두번째 글자를 *로 바꿔서 추출. Person객체를 매개변수로 받아서 이름을 변경하고 이름이 변경된 Person객체를 리턴.
        //Person 객체 리턴. 방법1) 매개변수로 받은 Person객체 조작(setter사용)  방법2) 새로운 Person객체 만들어서 리턴(new 사용) - 일반적인 사용
        //방법1
        Modifier<Person> makeMasking = p -> {
            String name = p.getName();
            if(name.length() >= 2){
                String maskedName = name.charAt(0) + "*" + name.substring(2);
                return new Person(maskedName , p.getAge());
            }
            return new Person(p.getName()  , p.getAge()); // return new Person(p) 해도 괜찮음
        };

        List<Person> maskingPeople = new ArrayList<>();
        for(Person person : people){
            Person maskedPerson = makeMasking.modify(person);
            maskingPeople.add(maskedPerson);
        }
        System.out.println(maskingPeople);

        //Modifier이용해서 20세 미만인 사람 이름을 "비공개"로 변경.
        List<Person> minors = new ArrayList<>();
        //바꾼 Person 객체들을 minors에 담아서 출력
        Modifier<Person> undefiningName = p -> {
            String name = p.getName();
            if(p.getAge() < 20){
                return new Person("비공개" , p.getAge());
            }
            return new Person(p.getName() , p.getAge());
        };
        //방법2 사용법
        Modifier<Person> undefiningName2 = p -> {
            if(p.getAge() < 20){
                p.setName("비공개");
            }
            return p;
        };

        for(Person person : people){
            Person undefinedPerson = undefiningName.modify(person);
            minors.add(undefinedPerson);
        }

        System.out.println(people);
        System.out.println(minors); // new로 만들어서 쓰면 원본을 건들지 않음.

        List<Person> setterVer = new ArrayList<>();
        for(Person p : people){
            Person modifiedPerson = undefiningName2.modify(p);
            setterVer.add(modifiedPerson);
        }
        System.out.println(people);
        System.out.println(setterVer); // setter 잘 안쓰는 이유 : 원본도 같이 바뀜
    }
}
