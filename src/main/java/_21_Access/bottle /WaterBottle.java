package _21_Access.bottle;

public class WaterBottle {
   private int currentWater;
   WaterBottle(int currentWater){
       this.currentWater = currentWater;
   }
   void fill(int amount){
       int result = currentWater + amount;
       if(0 > result || result > 1000){
           System.out.println("물의 양 틀림");
       }else{
           System.out.println("물을 채움");
           currentWater += amount;
       }
   }
   void drink(int amount){
       if(amount < 0){
           System.out.println("물의 양 틀림");
       }
       if(amount > currentWater){
           System.out.println("현재 물 양 보다 더 많이 못마심");
           return;
       }
       currentWater -= amount;
       System.out.println("물을 마심");
   }
   public int getCurrentWater(){
       return currentWater;
   }

    public static void main(String[] args) {
        /* (문제1) WaterBottle클래스 작성
        필드 : currentWater(현재 물의 양)
        생성자 : currentWater를 초기화하는 생성자
        메서드 : void fill(int amount) : amount값 검증(0보다 큰지) , 총량은 1000ml 미만 , 유효하면 "물을 채웠습니다"
        , void drink(int amount) : amount값 검증(0보다 큰지) , 현재 물의 양보다 더 많은 양 마실수 없음 , 유효하면 "물을 마셨습니다"
        , int getCurrentWater() : 현재 물의 양 리턴(getter 작성)
         */
        WaterBottle waterBottle = new WaterBottle(0);
        waterBottle.fill(500);
        waterBottle.fill(800);
        waterBottle.drink(400);
        waterBottle.drink(800);
        waterBottle.fill(-10);
        waterBottle.drink(-10);
        System.out.println(waterBottle.getCurrentWater());
    }
}
