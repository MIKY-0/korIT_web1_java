package _12_BreakContinue;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("현재 번호 : " + i);
//            if (i == 3) {break;}
//        }
//        int waiting = 50;
//        int stock = 10;
//        for(int i = 1; i <= waiting; i++){
//            System.out.println(i + "번째 손님 입장");
//            if(i == stock){
//                System.out.println("재고소진\n영업종료");
//                break;
//            }
//        }
//        String pw = "1234";
//        Scanner scanner = new Scanner(System.in);
//        while(true){
//            System.out.print("비밀번호 입력 : ");
//            String input = scanner.nextLine();
//            if(input.equals(pw)) {
//                System.out.println("로그인 성공");
//                break;
//            }
//        }

        //(문제1) 1~100까지 누적합이 200 넘어가면 정지. 정지했을 때 마지막 더한수 , 최종합계 출력.
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
            if(sum > 200){
                System.out.printf("마지막 더해진 수 : %d , 최종 누적합 : %d" , i , sum);
                break;
            }
        }
    }
}
