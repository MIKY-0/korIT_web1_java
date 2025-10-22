package _13_Array;

public class StackHeap {
    public static void main(String[] args) {
        int age = 25;
        boolean isStudent = true;
        /*
        현재 스택 : main메서드 - age변수 : 25 , isStudent변수 : true.
        현재 힙 : empty
         */
        int score[] = {85,90,70};
        /*
        현재 스택 : main메서드 - age변수 : 25 , isStudent변수 : true , score 배열변수 주소값(0x1000).
        현재 힙 : score 배열변수 주소값(0x1000) , 0x1000 : 85 , 0x1004 : 90 , 0x1008 : 70.
         */
    }
}
