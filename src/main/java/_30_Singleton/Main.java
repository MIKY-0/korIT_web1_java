package _30_Singleton;

public class Main {
    public static void main(String[] args) {
        LogManager log1 = LogManager.getInstance(); // 스태틱메서드로 객체생성
        log1.log("첫번쨰 로그");
        LogManager log2 = LogManager.getInstance(); // 스태틱메서드로 객체생성
        log2.log("두번쨰 로그");
        //정말 같은 주소(스택에 저장된 값)일까?
        System.out.println(log1 == log2); // -> 정말 하나의 객체만 생성해서 여러번 사용 가능.
        AppConfig con1 = AppConfig.getSingle();
        AppConfig con2 = AppConfig.getSingle();

        System.out.println(con1 == con2);
        System.out.println(con1);
        System.out.println(con2);
        con1.setAppMode(AppConfig.PRODUCTION_MODE);//con1과 con2는 설정값(객체 상태)을 공유. con1의 상태를 변경. -> con1과 con2 둘다 변경됨.
        System.out.println(con1);
        System.out.println(con2);

    }
}
