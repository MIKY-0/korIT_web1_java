package _15_Method;

public class Parameter2 {
    public static void changeNum(int n){
        System.out.println("changeNum 호출됨");
        n += 2;
        System.out.println(n);
    }
    public static void changeArray(int arr[]){
        arr[0] = 999;
    }
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println(num); // 함수별로 각기 다른 스택메모리 공간을 가지고 있기 때문.
        /*
        stack(main)---
        num : 10
        stack(main)---
        stack(changeNum)---
        n : 10 -> 12
         */
        int number[] = {1,2,3};
        System.out.println(number[0]);
        changeArray(number);
        System.out.println(number[0]);
        /*
        stack(main)---
        nums : 0x1000
        stack(main)---
        stack(changeArray)---
        arr : 0x1000
        stack(changeArray)---

        heap---
        0x1000 : 1
         */
    }
}
