package _31_NestedClass.nested;
//(문제1)User클래스의 빌더패턴 적용
/*
1.외부 클래스 생성자(내부 클래스 참조할 객체)
2.내부 클래스 참조값 생성.
3.내부 클래스 생성{
4.외부 클래스 필드 동일하게 작성
5.필드마다 외부에서 받을 매개변수를 포함한 메서드 생성. this(내부 클래스)에게 리턴.
6.1번에서 만든 생성자를 통해 this로 리턴한 내부 클래스 객체들을 전부 외부 클래스로 보내기 위해 외부 클래스에 참조할 메서드 생성
 */
public class User {
    private String userName;
    private String name;
    private String email;
    private String address;

    // 1번
    public User(Builder1 builder1) {
        this.userName = builder1.userName;
        this.name = builder1.name;
        this.email = builder1.email;
        this.address = builder1.address;
    }
    //2번
    public static Builder1 builder2(){ //메인함수에서 생성할 떄 new User로 해도되지만 외부에서 접근하게 하기 싫어서 static붙여서 하는것. Main클래스의 12번 라인 참고!!!
            return new Builder1();
        }
    //3번
    public static class Builder1 {
    //4번
        private String userName;
        private String name;
        private String email;
        private String address;
    //5번
        public Builder1 userName(String userName){
            this.userName = userName;
            return this;
        }public Builder1 name(String name){
            this.name = name;
            return this;
        }public Builder1 email(String email){
            this.userName = userName;
            return this;
        }public Builder1 address(String address){
            this.address = address;
            return this;
        }
    //6번
        public User builder3(){
            return new User(this); //this -> Builder1로 만들어진 객체
        }
    }
}
