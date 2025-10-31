package _26_Abstract;

public class Main {
    public static void main(String[] args) {
        //컴파일러는 부모클래스에 attack있는지 검사 -> 통과
        //JVM은 new로 생성된 객체의 attack을 호출
        //오버라이딩 강제된가 -> 업캐스팅 되더라도 자식메서드를 호출하겠다
        Character warrior1 = new Warrior("전사1"); //업캐스팅  추상클래스는 객체생성이 안되지만 자식클래스를 통해 객체생성 가능
       Character warrior2 = new Warrior("전사2");
        warrior1.attack(warrior2);

        Character m1 = new Mage("마법사1"); //Mage타입 m1으로 만들수 있지만 다형성때문에 Character타입으로 만듦.
        //장점 : Character배열 생성 가능
        Character a1 = new Archer("궁수1");
        Character character[] = {warrior1 , m1 , a1};
        for(Character c : character){ // 추상클래스 상속 -> 오버라이딩 강제 -> 다형성 보장. attack은 객체마다 서로 다르게 작동.
            c.attack(warrior2);
        }


    }
}
