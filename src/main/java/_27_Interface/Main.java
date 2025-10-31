package _27_Interface;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog(); // Dog dog = new Animal(); -> 오류. Animal은 인터페이스기 때문에.new뒤에는 클래스가 와야하기 때문.
        Animal duck = new Duck();
        Animal animal[] = {dog , duck};
        for(Animal a : animal){
            a.sound();
            //a.swim(); 여기서는 안됨
            if(a instanceof Flyable){ // a가 Flyable로 캐스팅 가능하다면
                ((Flyable) a).fly(); // 임시 캐스팅 Animal 타입의 a객체를 Flyable타입으로 임시로 변환후 다시 Animal타입으로 복원
            }
            if(a instanceof Swimmable){
                ((Swimmable)a).swim();
            }

            Dog dog2 = new Dog(); //캐스팅 안된상태
            Duck duck2 = new Duck(); //캐스팅 안된상태
            AnimalManager manager = new AnimalManager();
            //되는 이유 : 매개변수로 넘어갈때 Animal타입으로 자동캐스팅됨.
            manager.makeSound(dog2);
            manager.makeSound(duck2);
            //매개변수로 넘어갈때 Swimmable타입으로 자동캐스팅됨.
            manager.makeSwimming(dog2);
            manager.makeSwimming(duck2);

        }
    }
}
