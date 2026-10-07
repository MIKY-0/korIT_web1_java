package _16_Overloading;

public class Overloading2 {
    public static void printInfo(String name){
        System.out.println("이름 : " + name);
    }
    public static void printNum(int num){
        System.out.println("정수");
        System.out.println(num);
    }
    public static void printNum(double num){
        System.out.println("실수");
        System.out.println(num);
    }
    public static void main(String[] args) {
        printNum(1.0);
    }
}
