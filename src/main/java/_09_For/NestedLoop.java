package _09_For;

public class NestedLoop {
    public static void main(String[] args) {
//        for (int day = 1; day <= 7; day++) {
//            System.out.println(day + "일 살았음");
//        }
//        for(int week = 1; week <= 4; week ++){
//            System.out.println(week + "주 시작");
//            for (int day = 1; day <= 7; day++) {
//                System.out.println("\t" + day + "일 살았음");
//            }
//            System.out.println(week + "주 끝");
//        }

        // 구구단 [2단] 2 * 1 = 2 ... [3단] ....
        for(int i = 2; i <= 9; i++){
            System.out.println("----------" + i + "단----------");
            for(int j = 1; j <= 9; j++){
                System.out.printf("%d X %d = %d\n" , i , j , i * j);
            }
        }
    }
}
