package _14_MultiArray;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class Java {
    public static void main(String[] args) {
        int a[] = {1,2,3}; // 0x1000 , 0x1004 , 0x1008
        double d[] = {1.0,2.0,3.0}; // 0x1000 , 0x1008 , 0x1016

        String s[] = {"a","bcde","fghijkl"}; // 0x1000 , ? , ?




        String seats[][] = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"},
        };
        System.out.println("seats[][]의 캐싱(toString)값 : " + Arrays.toString(seats));
        System.out.println("seats[][]의 주소값 : " + seats);
        System.out.println("seats[0]의 주소값 : " + seats[0]);
        System.out.println("seats[1]의 주소값 : " + seats[1]);
        System.out.println("seats[2]의 주소값 : " + seats[2]);

//        System.out.println("------------------------------------------------------------");
//
//        String seatA[] = {"A1","A2","A3","A4","A5"};
//        System.out.println("seatA[]의 주소 : " + seatA);
//
//        String seatB[] = {"B1","B2","B3","B4","B5"};
//        System.out.println("seatB[]의 주소 : " + seatB);
//
//        String seatC[] = {"C1","C2","C3","C4","C5"};
//        System.out.println("seatC[]의 주소 : " + seatC);
//
//        String seatss[][] = {seatA , seatB , seatC};
//        System.out.println("seatss[][]의 주소 : " + seatss);
//        System.out.println("seatss[][]의 캐싱값(toString) : " + Arrays.toString(seatss));
//        System.out.println("seatss[0]의 주소 : " + seatss[0]);
//        System.out.println("seatss[1]의 주소 : " + seatss[1]);
//        System.out.println("seatss[2]의 주소 : " + seatss[2]);
    }
}
