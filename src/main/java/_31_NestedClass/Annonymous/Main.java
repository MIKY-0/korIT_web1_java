package _31_NestedClass.Annonymous;

public class Main {
    public static void main(String[] args) {
     Hello h = new Hello() { // 인터페이스는 원래 객체 생성이 안되지만 메인함수안에서 오버라이딩을 해주면 익명클래스.
         // Hello클래스의 인스턴스가 아니다!!!!그리고 Hello는 인터페이스라서 Hello가 될 수도 없음. 어디 클래스인지 그냥 모름.익명이라서.
         //Hello인터페이스로 형변환 시켜준것. 항상 업캐스팅된 상태로만 사용가능.
         @Override
         public void bye() {System.out.println("안녕히 계세요");}
         @Override
         public void hello() {System.out.println("안녕하세요");}
     };
        System.out.println(h.getClass().getName());

        Character ch = new Character("마스터" , 999 , 999) { // ch도 익명타입!!! 항상 업캐스팅된 상태로만 사용가능.
            @Override
            public void attack(Character target) {
                System.out.println("운영자");
                target.receiveDamage(attackDamage);
            }
        };
        System.out.println(ch.getClass().getName());
    }
}
