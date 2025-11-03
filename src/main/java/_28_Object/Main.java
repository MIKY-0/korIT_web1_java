package _28_Object;

public class Main {
    public static void main(String[] args) {
        ObjectStudent st1 = new ObjectStudent("홍길동" , 20);
        System.out.println(st1);
        ObjectStudent st2 = new ObjectStudent("홍길동" , 20);
        System.out.println(st1 == st2);

    }
}
