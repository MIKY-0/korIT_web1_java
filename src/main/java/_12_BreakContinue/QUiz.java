package _12_BreakContinue;
import java.util.Scanner;
public class QUiz {
    public static void main(String[] args){
        //1.사용자에게 비밀번호 입력.
        //2.비밀번호 맞으면 -> 로그인 성공 / 틀리면 -> 비밀번호 틀림 후 다시 입력
        //3.최대 5회까지 시도. 5회 도달하면 계정 잠그고 탈출.
        //4.입력이 비어있으면 (엔터만 친 경우) , "다시 입력하세요" 출력하며 이 경우 출력횟수 증가 안함.

        //빈 문자열 검사
//        String test = "";
//        System.out.println(test.length() == 0);
//        System.out.println(test.isEmpty()); 권장
//        String test = "    ";
//        System.out.println(test.isBlank());

        String pw = "1234";
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(true){
            System.out.print("비밀번호 입력 : ");
            String input = scanner.nextLine();
            if(count == 5){
                System.out.println("비밀번호 5회 오류. 지금부터 계정이 비활성화 됩니다");
                break;
            }
            if(input.equals(pw)){
                System.out.println("로그인 성공");
                break;
            }else{
                if(input.isEmpty()){
                    System.out.println("다시 입력");
                    continue;
                }
                System.out.printf("비밀번호 %d회 오류. 다시입력!!\n" , count);
                count ++;
            }
        }
    }
}
