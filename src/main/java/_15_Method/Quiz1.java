package _15_Method;

public class Quiz1 {
    public static boolean Even(int a){
//        if(a % 2 == 0) {return true;}
//        return false;
        return a % 2 == 0;
    }

    public static boolean containsNum(int a[] , int b){
        for(int num : a){
            if(num == b) {return true;}
        }
        return false;
    }

    public static void main(String[] args) {
        //(문제1) 홀짝 판단하는 메서드 구현. isEven(8) -> true
        // (문제2) 배열과 숫자를 매개변수로 받아서 숫자가 배열에 있는지 검사하는 메서드.containsNum(nums , 8) -> false
        int num[] = {1,3,7,9};
        System.out.println(Even(8));

    }
}
