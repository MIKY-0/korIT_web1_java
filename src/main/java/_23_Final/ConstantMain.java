package _23_Final;

public class ConstantMain {
    public static void main(String[] args) {
        //매직넘버 , 매직스트링 : 하드코딩되어있는 숫자 , 문자열(우리가 롤이라는 게임을 모르는 상태라면 18레벨이 뭔지도 모르고 5:5인것도 모름)
        //나중에 코드를 봤을때 "이 숫자(문자열)가 뭐였지?" 궁금해지면 매직넘버 , 매직스트링
        System.out.println("게임명 : " + Constant.NAME);
        System.out.println("게임모드 : " + Constant.BATTLE_MODE);
        System.out.println("플레이어 수 : " + Constant.MAX_PLAYER);

        int playerLV = 18; //사용자가 입력하는 값

        if(playerLV + 1 > Constant.MAX_LEVEL ) {System.out.println("이미 최대 레벨 도달");}
        else {playerLV++;}

        //물건 구입 - 금액에 따라 할인. 5만원 넘어가면 10% 할인.
        int price = 100000; //사용자 입력값
        double dcPrice = 0.0; //초기화

        if(price > Constant.DISCOUNT_THRESHOLD) { // DC_THRESHOLD 할인기준 (50000이상)
            double dcAmount = price * Constant.DISCOUNT_RATE; // DISCOUNT_RATE (10% 할인)
            dcPrice = price - dcAmount; // dcPrice는 10% 할인한 가격.
        }else{
            dcPrice = price;
        }
    }
}
