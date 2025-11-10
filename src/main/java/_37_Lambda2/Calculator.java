package _37_Lambda2;
@FunctionalInterface // 컴파일러가 함수 하나만 선언되었는지 검사.
public interface Calculator {
    int calculate(int num1 , int num2); // 인터페이스에서는 메서드 시크니처만 정의 -> 구체적 구현은 익명클래스에서.
    Calculator add = new Calculator() {
        @Override
        public int calculate(int num1 , int num2) {
            return 0;
        }
    };
}
