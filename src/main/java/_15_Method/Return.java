package _15_Method;

public class Return {
    public static int add(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static String addNim(String name){
    return name + "님";
    }

    public static void main(String[] args) {
        int sum = add(10 , 20);
        int sum2 = add(10 , add(10 , 20));
        String name = "홍길동";
        // addNim(name) -> 문자열
        if(addNim(name).endsWith("님")){ // 객체처럼 다룰 수 있다.
            System.out.println("님으로 끝남");
        }

    }
}
