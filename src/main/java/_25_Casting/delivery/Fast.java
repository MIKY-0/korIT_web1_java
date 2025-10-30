package _25_Casting.delivery;

public class Fast extends Delivery{
    public Fast(int distance, int weight) {
        super(distance, weight);
    }

    @Override
    public int calcFree() {
        System.out.println("특급배송 시작");
        return 4000 + distance * 300 + weight * 200;
    }
}
