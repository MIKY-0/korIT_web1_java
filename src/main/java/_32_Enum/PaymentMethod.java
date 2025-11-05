package _32_Enum;
//(문제1)결제 수단별 수수료 시스템 정의. 현금(CASH) - 0 , 카드(CARD) - 2 , 모바일(MOBILE) - 5
//필드 : 수수료율(feeRate) , 한글표시명(name).    메서드 : 수수료 계산 메서드(calcFee) , 한글명 리턴 메서드(getName)
//Payment클래스를 PaymentMethod 열거로 바꾼것. Payment클래스랑 똑같은 기능.
/*
enum 생성 순서 : 1) 필드 생성. 2) 필드들을 포함한 생성자 생성. 3) 최상단에 필드들과 생성자의 매개변수 값을 이용하여 상수 선언. {변수1 (매개변수1 , 매개변수2 , ...) , 변수2 , ...)}
4) 기능들을 담당할 메서드 생성. 메서드에 매개변수 넣어주기. */

public enum PaymentMethod {
    CASH(0 , "현금") , CARD(2 , "카드") , MOBILE(5 , "모바일"); // 상수 인스턴스들은 최상단 위치.
    private int feeRate;
    private String name;

    PaymentMethod(int feeRate , String name){ //위 필드들을 초기화 시켜줄 생성자 생성.
        this.feeRate = feeRate;
        this.name = name;
    }
    public double calcFee(int price){
        return price * feeRate / 100.0;
    }
    public String getName(String name){
        return name;
    }
}
