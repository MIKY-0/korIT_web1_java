package _33_Exception;
//(문제1) try문에 이메일 검증. 검증 조건 : 1.email이 null이면 에러 - 메세지 : 이메일이 null.
// 2.email이 빈문자 , @없으면 에러. 3.정상이면 "유효한 이메일 : {email}" 출력
//커스텀예외 생성(InvalidEmailException)
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일 입력 : ");
        String email = scanner.nextLine();
        try{
            if(email == null){  //이메일이 널이면 예외를 발생시키고 InvalidEmailException클래스로 다음 메세지 던짐
                throw new InvalidEmailException("email이 null");
            }
            if(email.isEmpty()){
                throw new InvalidEmailException("email이 비어있음");
            }
            if(!email.contains("@")){
                throw new InvalidEmailException(("email에 @없음"));
            }
        }catch(InvalidEmailException e){ // RuntimeException e 해도되지만 구체적인 클래스 명시 권장.
            //커스텀에러가 RuntimeException상속받고 있기 때문에 catch로 잡을 수 있음.
            //최종하단에 RuntimeException이나 Exception을 잡는 catch문 작성하는게 좋다.
            System.out.println("오류메세지 : " + e.getMessage());
        }
        finally{
            scanner.close();
        }


    }

}
