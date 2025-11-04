package _31_NestedClass;

public class LocalClassMain {
    private int a;

    public void printTotal(int num1 , int num2){ // 인스턴스 메서드

        class Calculator{

            int add(int x , int y) {
                System.out.println("외부클래스의 private필드 접근 -> " + a);
                return x + y;
            }
        }
        //Calculator클래스는 printTotal메서드 내부에서만 사용 가능.
        Calculator c = new Calculator();
        int result = c.add(num1 , num2);
        System.out.println("계산 결과 : " + result);
    }
}
