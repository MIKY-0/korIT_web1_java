package _08_Switch;
import java.util.Scanner;
public class WeekDiscount {
    public static void main(String[] args) {
        //(문제1) 요일마다 할인율 다름. 스캐너로 요일 입력. switch문.
        //월-10% , 화/수/목-5% , 금-15% , 토/일-20% , 그외-0%
        //최종출력 오늘 : ?요일 \ 정가 : ?원 \ 할인금액 : ?원 \ 최종가격 : ?원
        Scanner scanner = new Scanner(System.in);
        System.out.print("오늘은 무슨 요일? : ");
        String day = scanner.nextLine();
        int price = 10000;

        day = day.contains("요일") ? day : day + "요일"; // "월","월요일" 두가지 모두 적용.
        day = day.length() == 1 ? day + "요일" : day; // "월","월요일" 두가지 모두 적용.

        switch(day){
            case "월" :
                System.out.printf("오늘 : %s요일\n정가 : %d원\n할인금액 : %.2f원\n최종가격 : %.2f원" ,
                        day , price , price * 0.1 , price * 0.9); break;

            case "화" :
            case "수" :
            case "목" :
                System.out.printf("오늘 : %s요일\n정가 : %d원\n할인금액 : %.2f원\n최종가격 : %.2f원" ,
                        day , price , price * 0.05 , price * 0.95); break;

            case "금" :
                System.out.printf("오늘 : %s요일\n정가 : %d원\n할인금액 : %.2f원\n최종가격 : %.2f원" ,
                        day , price , price * 0.15 , price * 0.85); break;

            case "토" :
            case "일" :
                System.out.printf("오늘 : %s요일\n정가 : %d원\n할인금액 : %.2f원\n최종가격 : %.2f원" ,
                        day , price , price * 0.2 , price * 0.8); break;

            default :
                System.out.printf("오늘 : %s요일\n정가 : %d원\n할인금액 : %.2f원\n최종가격 : %.2f원" ,
                        day , price , price * 0 , price);
        }

    }
}
