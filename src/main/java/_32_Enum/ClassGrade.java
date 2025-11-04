package _32_Enum;

public class ClassGrade {
    private int dcRate; // 등급에 따라 할인율 차등적용
    public static final ClassGrade BASIC = new ClassGrade(5);
    public static final ClassGrade GOLD = new ClassGrade(10);
    public static final ClassGrade DIAMOND = new ClassGrade(20);

    private ClassGrade(int dcRate) { // private로 외부 접근 방어.
        this.dcRate = dcRate;
    }
}
