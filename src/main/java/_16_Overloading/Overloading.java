package _16_Overloading;

public class Overloading {
    // 시그니처 : printInfo함수(1 : String)
    public static void printInfo(String name){
        System.out.println("이름 : " + name);
    }
    // 시그니처 : printInfo함수(1 : String , 2 : int)
    public static void printInfo(String name , int age){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
    public static void main(String[] args) {

    }
}
