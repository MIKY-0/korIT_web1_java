package _23_Final;

import java.sql.SQLOutput;

public class FinalMain {
    public static void main(String[] args) {
        final int d1;
        d1 = 10;
        final int d2 = 20;

        FinalStudent st1 = new FinalStudent("김자바" , 001 , 20);
        st1.printInfo("자바고");
        st1.setAge(21);

        final FinalStudent st2 = new FinalStudent("이자바" , 002 , 20);
        st2.setAge(21); // 가능. 왜 final인데 가능한가? final은 스택에 있는 변수가 저장하고 있는 값을
        //변경하지 못하게 하는것. st2의 주소값만 안바뀌면 상관없음.
        //st2 = new FinalStudent("이자바" , 002 , 21); 불가능. 얘는 st2의 주소를 새로 다시 지정하는 것이기 때문.
        System.out.println(Constant.NAME);
        System.out.println(Constant.MAX_LEVEL);
    }
}
