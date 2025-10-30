package _25_Casting.delivery;

public class Delivery {
    protected int distance;
    protected int weight;

    public Delivery(int distance, int weight) {
        this.distance = distance;
        this.weight = weight;
    }
    public int calcFree(){
        System.out.println("기본계산 함수 호출");
        return 3000;
    }
    public void printInfo(){
        int fee = calcFree();
        System.out.println("배송비 : " + fee);
    }
}
