package _06_If;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        //비만도 bmi
//        int weight = 70;
//        double height = 174 / 100.0;
//        double bmi = weight / (height * height);
//
//        if(bmi >= 30){
//            System.out.println("비만");
//        }else if(bmi >= 25){
//            System.out.println("과체중");
//        }else if(bmi >= 18.5){
//            System.out.println("정상");
//        }else{
//            System.out.println("저체중");
//        }

        //(문제1) 스캐너로 점수 입력. 점수에 따라 등급 판정.
        //90이상 A , 80~89 B , 70~79 C , 60~69 D , 60미만 F
        //A,B등급이면 장학금 대상 , 이외에는 장학금 대상 아님.
        //최종출력 점수 : ?점 등급 : ? 장학금 대상입니다! / 장학금 대상이 아닙니다!

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int score = scanner.nextInt();
        char grade = ' ';
        String a = "장학금 대상입니다!";
        String b = "장학금 대상이 아닙니다!";

        if(score > 100 || score < 0){ //얼리리턴 패턴 : 값 검증할 때 사용.
            //가독성을 위해 사용.
            System.out.println("불가능한 점수");
            return; //리턴을 만나면 즉시 메서드 종료!(이 클래스에서는 main클래스가 종료)
        }

        if(score >= 90){
            grade = 'A';
            System.out.println("점수 : " + score + "\n등급 : " + grade + "\n" + a);
        }else if(80 <= score && score<= 89){
            grade = 'B';
            System.out.println("점수 : " + score + "\n등급 : " + grade + "\n" + a);
        }else if(70 <= score && score<= 79){
            grade = 'C';
            System.out.println("점수 : " + score + "\n등급 : " + grade + "\n" + b);
        }
        else if(60 <= score && score<= 69){
            grade = 'D';
            System.out.println("점수 : " + score + "\n등급 : " + grade + "\n" + b);
        }else{
            grade = 'F';
            System.out.println("점수 : " + score + "\n등급 : " + grade + "\n" + b);
        }
    }
}
