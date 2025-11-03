package _29_Wrapper;

public class Main {
    public static void main(String[] args) {
        //int 래핑클래스
        Integer i1 = Integer.valueOf(90);
        Integer i2 = 90; //자동으로 컴파일러가 바로 윗줄 코드로 변환해줌.
        //long 래핑클래스
        Long l1 = Long.valueOf(100L);
        Long l2 = 100L;
        //double 래핑클래스 : Double , boolean 래핑클래스 : Boolean
        Integer a = Integer.valueOf(1000); // 박싱
        Integer b = Integer.valueOf(1000);
        System.out.println(a == b);
        System.out.println(a.equals(b));
        int int1 = a.intValue();

        int max = Integer.max(10 , 20); //박싱 -> 언박싱
        int min = Integer.min(10 , 20); //박싱 -> 언박싱
        int sum = Integer.sum(10 , 20); //박싱 -> 언박싱


    }
}
