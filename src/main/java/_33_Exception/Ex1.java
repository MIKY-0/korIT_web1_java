package _33_Exception;

public class Ex1 {
    public static void main(String[] args) {
//        System.out.println(10 / 0);
//        System.out.println("실행중");

        try{
            int result = 10 / 0;
        }catch(ArithmeticException e){
            System.out.println("분모 0 불가능");
        }finally{ // scanner.close()같은 자원반납 코드를 작성.
            System.out.println("예외가 생기든 안생기든 항상 실행");
        }

    }
}
