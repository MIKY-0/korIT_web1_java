package _32_Enum;

public class Payment {
    private int feeRate;
    private String name;
    public static final Payment CASH = new Payment(0);
    public static final Payment CARD = new Payment(2);
    public static final Payment MOBILE = new Payment(5);

    private Payment(int feeRate) {
        this.feeRate = feeRate;
    }
    private Payment(String name){
        this.name = name;
    }
}
