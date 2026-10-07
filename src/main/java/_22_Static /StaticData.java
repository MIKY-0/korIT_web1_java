package _22_Static;

public class StaticData {
    //id , count -> 인스턴스변수 : 각 객체마다 별도의 힙공간 존재.
    private int id;
    public int count;
    public static int staticCount;

    public StaticData(int id) {
        this.id = id;
        staticCount++;
        count++;
    }
}
