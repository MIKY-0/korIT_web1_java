package _07_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;
        longValue = intValue;
        doubleValue = intValue;

        doubleValue = 1.5;
        intValue = (int)doubleValue;
        System.out.println(intValue);

        intValue = 1;
        doubleValue = 1.5;
        System.out.println(intValue + doubleValue);

        int kor = 90 , math = 90 , eng = 85;
        System.out.println((kor + math + eng) / 3.0);

        int i = Integer.parseInt("34");
        System.out.println(i + 1);
        double d = Double.parseDouble("34.44");
        System.out.println(d + 0.1);
    }
}
