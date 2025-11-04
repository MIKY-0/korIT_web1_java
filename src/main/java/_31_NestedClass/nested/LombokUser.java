package _31_NestedClass.nested;

import lombok.*;

@ToString // 원래 우리가 toString 생성해서 작성해야되는데 롬복이 알아서 재정의.
@AllArgsConstructor // 모든 필드 초기화하는 생성자 자동 추가.
@NoArgsConstructor  //기본생성자 자동 추가.
//@RequiredArgsConstructor // final붙은 필드 초기화 하는 생성자 자동 추가. Builder랑 같이 사용 X
@Getter @Setter // 모든 필드의 getter , setter 자동 추가.
@Builder // 빌더 패턴 자동 추가
@Data // getter , setter , toString , equals , hashcode , RequiredArgsConstructor를 한번에 묶어서 자동 추가.
public class LombokUser {
    private String userName;
    private String name;
    private String email;
    private String address;
}
