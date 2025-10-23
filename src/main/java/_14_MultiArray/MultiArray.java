package _14_MultiArray;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args){
        String seatA[] = {"A1","A2","A3","A4","A5"};
        //seatA : 스택에 존재하며 힙주소 저장 중. 힙주소 : 0x1000
        System.out.println(seatA);
        String seatB[] = {"B1","B2","B3","B4","B5"};
        System.out.println(seatB);
        //seatA : 스택에 존재하며 힙주소 저장 중. 힙주소 : 0x2000
        String seatC[] = {"C1","C2","C3","C4","C5"};
        System.out.println(seatC);
        //seatA : 스택에 존재하며 힙주소 저장 중. 힙주소 : 0x3000
        String seats[][] = {seatA , seatB , seatC};
        System.out.println(seats);
        System.out.println(seats[0]);
        //seatA : 스택에 존재하며 힙주소 저장 중. 힙주소 : (새로운 힙주소)0x4000 -> [0x1000 , 0x2000 , 0x3000]

       String seats2[][] = {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
               {"C1", "C2", "C3", "C4", "C5"},
        };
//        //seats2를 통해 B3 출력.
//        String Bseat[] = seats[1];
//        System.out.println(Arrays.toString(Bseat));
//        String B3 = seats2[1][2];
//        System.out.println(B3);
//
//        //(문제1)A4 , C5 출력
//        System.out.print(seats2[0][3] + "\t" + seats2[2][4]);
//
        System.out.println(Arrays.toString(seats2)); // 내부 캐싱값
//        System.out.print(seats2[0] + " " + seats2[1] + " " + seats2[2]);
//        System.out.println(Arrays.deepToString(seats2));
    }
}
