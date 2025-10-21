package _07_Typecasting;

public class NumberToString {
    public static void main(String[] args) {
        int num1 = 100;
        double num2 = 100.1;
        //숫자 -> 문자열(방법1) : 문자열 + 숫자 -> 문자열
        String strNum1 = "" + num1;
        String strNum2 = "" + num2;

        //숫자 -> 문자열(방법2) : 객체 메서드 사용
        String strNum3 = Integer.toString(num1);
        String strNum4 = Double.toString(num2);
    }
}
