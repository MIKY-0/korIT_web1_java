package _10_While;
import java.util.Scanner;
import java.util.Random;
public class Practice2 {
    public static void main(String[] args){
        //(문제1)스캐너,랜덤. 1~100 랜덤 숫자. while문으로 입력받아 랜덤숫자와 비교해서 작으면 업 크면 다운.(업다운게임).\
        //맞추면 정답!
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int input = 0;
        int num = random.nextInt(1 , 100);
        int count = 0;

        while(input != num){
            System.out.print("정수 입력 : ");
            input = scanner.nextInt();
            if(input < num){
                System.out.println("업");
                count ++;
            }else if (input > num){
                System.out.println("다운");
                count ++;
            }else{
                System.out.println("정답! : " + num);
                count ++;
            }
        }
        System.out.println(count + "번 만에 정답");
    }
}
