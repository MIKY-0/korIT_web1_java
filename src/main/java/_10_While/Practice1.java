package _10_While;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1 , 11); // 1이상 11미만
        int input = 0;

        while(num != input){
            System.out.print("정수 입력 : ");
            input = scanner.nextInt();
            if(input == num){
                System.out.println("정답" + num);
            }else{
                System.out.println("다시 입력");
            }
        }
    }
}
