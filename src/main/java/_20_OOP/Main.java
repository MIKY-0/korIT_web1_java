package _20_OOP;

public class Main {
    public static void main(String[] args) {
        Friend f1 = new Friend("친구1");
        Friend f2 = new Friend("친구2");
        Friend f3 = new Friend("친구3");

        Person p = new Person("홍길동" , 20 , 3);
        p.setFriend(f1);//p객체가 f1객체를 알게됨
        p.setFriend(f2);//p객체가 f2객체를 알게됨
        p.setFriend(f3);//p객체가 f3객체를 알게됨
        //객체간의 상호작용 중심 -> OOP의 객체간의 상호작용
    }
}
