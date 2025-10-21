package _07_Typecasting;

public class Overflow {
    public static void main(String[] args) {
        long maxIntValue = 2100000000L; //int 범위내
        long overIntValue = maxIntValue + 100000000L; //int 범위 초과

        int intValue = (int)maxIntValue; //정상적인 형변환
        System.out.println(intValue);

        int intValue2 = (int)overIntValue; //오버플로우
        System.out.println(intValue2);
    }
}
