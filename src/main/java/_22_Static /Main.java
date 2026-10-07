package _22_Static;

public class Main {
    public static void main(String[] args) {
        StaticData staticData1 = new StaticData(1);
        StaticData staticData2 = new StaticData(2);
        StaticData staticData3 = new StaticData(3);

        //생성자가 3번 호출됐더라도 count는 객체마다 가지고있는 변수라서 모두 1 출력
        System.out.println(staticData1.count);
        System.out.println(staticData2.count);
        System.out.println(staticData3.count);

        //staticCount는 힙에 없고 스태틱 영역에 따로 저장하기 때문에 모든 객체가 공유. 하나의 메모리 공간만 차지.
        System.out.println(staticData1.staticCount);
        System.out.println(staticData2.staticCount);
        System.out.println(staticData3.staticCount);
        System.out.println(StaticData.staticCount);//클래스로도 참조 가능(권장 방식)
    }
}
