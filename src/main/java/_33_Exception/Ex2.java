package _33_Exception;

public class Ex2 {
    static void method1() throws MyCheckedException{
        System.out.println("메서드1 호출");
        method2();
    }static void method2() throws MyCheckedException{
        System.out.println("메서드2 호출");
        //throw new RuntimeException("method2에서 생성");
        throw new MyCheckedException("method2에서 생성"); // 체크예외 -> try-catch문 강제(컴파일시점에서 강제하기 때문). 여기서 try-catch해도되고 메인에서 해도됨. 대신 전파시켜줘야됨
        //static void method1,2() [throws MyCheckedException].
    }
    public static void main(String[] args) {
        //전파 : main() -> method1() -> method2().  method2()에서 예외 발생 JVM은 코드를 즉시 멈추고 해당 예외 객체타입을 받아주는 catch탐색. 근데 없음. -> main으로 갔는데도 catch없음.
        //-> 프로그램 종료 , 에러메시지 출력.
        //method1();

        try{
            method1();
        }catch(RuntimeException e){ // RuntimeException은 컴파일시점 검사가 아니라서 try-catch 강제 안함.
            System.out.println("main에서 예외처리 실행");
            System.out.println(e.getMessage());
        }catch(MyCheckedException e){ // 위 method1,2에서 전파시킨걸 받아줌. 최종적으로 체크예외를 main까지 throws로 전파시켜서 여기서 처리.
            System.out.println("main 체크예외처리 실행");
            System.out.println(e.getMessage());
        }
        try{
            throw new MyException("나만의 예외 생성"); // 예외 발생시 출력할 에러 메세지
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
