package _03_Operator;

public class Operator5 {
    public static void main(String[] args) {
        int a = 5 , b = 3;
        int c = a > b ? 1 : 0;
        boolean isSame = a == b ? true : false;

        int age = 17;
        String ticketName = age >= 19 ? "성인 요금" :
                age >= 14 ? "청소년 요금" : "어린이 요금";

//        (문제1)
//        int height = 110;
//        String go = height >= 120 ? "탑승가능" : "탑승불가능";
//        System.out.println(go);
//         ---------------------------------------------
//         (문제2)
//        int unit = 162 , onePage = 20;
//        int allPage = (unit % onePage) > 0 ? unit / onePage + 1 : unit / onePage;
//        System.out.println(allPage);
    }
}
