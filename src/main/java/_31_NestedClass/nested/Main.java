package _31_NestedClass.nested;

public class Main {
    public static void main(String[] args) {
    Member m1 = Member // 클래스 참조
            .builder() //static 메서드 호출 -> 결과 : Builder 객체 생성.
            .name("홍길동") // 생성한 Builder 객체에 set.
            .age(20)// 생성한 Builder 객체에 set.
            .email("java@naver.com")// 생성한 Builder 객체에 set.
            .build(); // set해준 Builder객체의 필드를 그대로 member객체로 이동시켜 생성.

    User u1 = User.builder2().userName("사용자1").name("홍길동").email("java@naver.com").address("부산").builder3();   // new USer.builder2()..... 해도 되지만 외부에서 접근하는걸 막으려고 static붙여서 생성.User클래스 16번 라인 참고!!

        LombokUser lu = LombokUser
                .builder()
                .userName("자바")
                .name("김길동")
                .email("네이버")
                .address("부산")
                .build();

        System.out.println(lu); // 롬복이 알아서 toString으로 출력해줌.


    }
}
