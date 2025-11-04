package _31_NestedClass.nested;

public class Member {
    private String name;
    private int age;
    private String email;

    private Member(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
    }

    public static Builder builder(){
        return new Builder(); // 호출시 Builder 객체 생성.
    }

    public static class Builder{ // 정적 내부 클래스.
        private String name; // 외부 클래스 필드와 동일하게 작성.
        private int age;
        private String email;

        public Builder name(String name){ // 메서드 체이닝 : 자기 자신을 리턴하는 메서드
            //a.name("홍길동").age(10).email("java@naver.com") -> 객체를 리턴하면 객체처럼 다룰수 있기때문. 여기서 리턴한 this는 객체이다. 아래 메서드들은 setter역할 하는 메서드들.
            this.name = name;
            return this;
        }public Builder age(int age){
            this.age = age;
            return this;
        }public Builder email(String email){
            this.email = email;
            return this;
        }

        public Member build(){
            return new Member(this); // private 외부 생성자 호출 , builder객체를 넘겨줌(this)
        }
    }


}
