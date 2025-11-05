package _32_Enum;

public class GradeMain {
    public static void main(String[] args) {
        int price = 10000;
        double basicPrice = Grade.BASIC.getDcPrice(price);
        double goldPrice = Grade.GOLD.getDcPrice(price);
        double diamondPrice = Grade.DIAMOND.getDcPrice(price);

        //Enum클래스 상속 -> Enum에 선언되어있는 메서드를 상속해서 사용.  String -> Enum / Enum -> String
        //DB는 자바환경이 아니라서 우리가 직접 정의한 Enum을 모름. DB에는 문자열로 전송하는 경우가 많다.

        //i) String -> Enum  "GOLD"문자열로 GOLD객체 불러오기
        Grade goldInstance = Grade.valueOf(Grade.GOLD.name()); // -> Grade.GOLD.name()를 "GOLD"라고 적어도되지만 권장 X.
        System.out.println(goldInstance == Grade.GOLD);
        //ii) Enum -> String  자바에 있는 데이터를 DB에 쓸 때
        String GradeName = Grade.GOLD.name();
        System.out.println(GradeName);

    }
}
