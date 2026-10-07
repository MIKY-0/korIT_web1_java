package _06_If;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args){
        //(문제1) 10만원 이상이면 10퍼센트 할인 , 아니면 할인없음.
        //가격에 따라 출력.
        Scanner scanner = new Scanner(System.in);
//        System.out.print("가격 입력 : ");
//        int price = scanner.nextInt();
//        scanner.nextLine();
//
//        if(price >= 100000){
//            double total = price * 0.9;
//            System.out.println("최종 가격 : " + total);
//        }else {
//            System.out.println("할인 적용 X , " + price);
//        }

        //(문제2) 로그인. 입력값과 실제값 비교 -> 아이디,패스워드 모두 일치하면 "로그인 성공",하나라도
        //다르면 로그인 실패.
        String Id = "java";
        String pw = "1234";
        System.out.print("아이디 입력 : ");
        String inputId = scanner.nextLine();
        System.out.print("패스워드 입력 : ");
        String inputPW = scanner.nextLine();

        if(inputId.equals(Id) && inputPW.equals(pw)){
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }
    }
}
