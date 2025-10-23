package _15_Method;

public class Parameter {
    public static void sum(int x){
        System.out.println(x + 5);
    }
    public static void main(String[] args) {
     int x = 5;
        sum(x); // 위 매개변수와 이 x는 다름.
    }
}
