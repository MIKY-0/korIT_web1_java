package _21_Access;

public class AccessMain {
    public static void main(String[] args) {
        Access access = new Access("데이터입니다");
//        System.out.println(access.data);
//        access.data = "오류"; //참조해서 변경
//        System.out.println(access.data);  data의 접근제어자가 private가 되어서 직접 참조 불가.
        System.out.println(access.getData());
        access.setData("setter 메서드로만 변경 가능");
        System.out.println(access.getData());
    }
}
