package _05_String;
import java.util.Scanner;
public class String1 {
    public static void main(String[] args) {
//       //1.앞 6자리만 출력
//       //2.성별코드(뒷자리 첫번째 숫자)출력
//        String pn = "991122-1234567";
//       System.out.println("앞 6자리 : " + pn.substring(0,6));
//       System.out.println("성별코드 출력 : " + pn.substring(7 , 8));

        //1.입력한 이메일 유효한지(@ 있는지 없는지)
        //2.사용자 아이디 추출
        //3.도메인 추출
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일 입력 : ");

        String email = scanner.nextLine();
        int a = email.indexOf("@");
        int b = email.length();

        System.out.println("이메일 유효 여부 : " + (email.contains("@") && email.contains(".") ? "사용 가능" : "사용 불가"));
        System.out.println("사용자 아이디 : " + email.substring(0 ,a));
        System.out.println("사용자 도메인 : " + email.substring(a + 1 , b - 4));
    }
}
