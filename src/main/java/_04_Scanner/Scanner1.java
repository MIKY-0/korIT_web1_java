package _04_Scanner;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //객체생성
        System.out.print("문자열 입력 : ");
        String a = scanner.nextLine();
        System.out.println("입력한 문자열 : " + a);

        System.out.print("정수 입력 : ");
        int b = scanner.nextInt();
        System.out.println("입력한 정수 : " + b);
        scanner.close();
    }
}
