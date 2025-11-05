package _32_Enum;
//ClassGrade클래스를 Grade 열거로 바꾼것. ClassGrade클래스랑 똑같은 기능.
public enum Grade {
    //public static final Grade BASIC = new GRADE(5); 가 생략 -> 변수이름(생성자에게 넣어주는 매개변수) 로 축약 가능.
    //enum은 Enum클래스를 상속받은 상수용 인터페이스 제조 클래스.
    BASIC(5) , GOLD(10) , DIAMOND(20);
    private int dcRate;

    Grade(int dcRate){ //생성자에 private 생략 가능 , public 불가능
        this.dcRate = dcRate;
    }
    //클래스로부터 만들어진 것이라 메서드 정의 가능.(getter , setter 생성 가능)

    public int getDcRate() {
        return dcRate;
    }
    public double getDcPrice(int price){ // 할인계산로직을 Grade에 위임 가능(클래스라서).
        //SOLID - 객체지향프로그래밍 설계 원칙(권장). 단일책임원칙 : 하나의 클래스는 하나의 책임만 책임지게 설계하라.
        //답이 정해져있는게 아니라 상황마다 유연하게 대처.
        return  price * dcRate / 100.0;
    }
    //권장사용 예시 - 서로 논리적으로 관련있는 상수들.(회원등급 , 요일 , 문제유형 , 커스텀예외)
}
