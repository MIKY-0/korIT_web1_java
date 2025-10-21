package _10_While;

import java.util.Scanner;

public class While {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isLogin = true;
        while(isLogin){
            System.out.println("로그인 상태");
            System.out.print("로그아웃 하실?(y/n) : " );
            String command = scanner.nextLine();
            isLogin = !"y".equals(command);
        }
        System.out.println("로그아웃 됨");
    }
}
