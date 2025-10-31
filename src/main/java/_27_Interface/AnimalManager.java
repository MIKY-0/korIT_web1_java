package _27_Interface;

public class AnimalManager {

    //AnimalManager클래스의 makeSound의 의존성 : Animal인터페이스 알아야됨.
    //Dog클래스 의존성 : Animal , .... 를 의존 -> AnimalManager를 의존하지 않음.
    //Duck클래스 의존성 : Animal , ... 를 의존 -> AnimalManager를 의존하지 않음.
    //의존성 방향 [Dog] -> [Animal] <- [AnimalManager] : Dog는 Animal를 알고 AnimalManager는 Animal을 알고있음
    //위 문장에서 알 수 있는것 : 구체적 클래스끼리 의존하는게 아니라 인터페이스를 통해 작동 -> 결합도 낮다(= 유연할 수 있다 , 변경에 안정적)
    //이상적인 구조 : 모든 구현체가 추상체를 의존하는 구조

    public void makeSound(Animal animal){
        animal.sound();
    }
    public void makeFlying(Flyable flyable){
        flyable.fly();
    }
    public void makeSwimming(Swimmable swimmable){
        swimmable.swim();
    }

}
