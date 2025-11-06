package _34_Generic.animal;

public class AnimalHospital<T extends Animal> { //<T extends A> : 타입 매개변수 "상한 경계 설정"
    //1.T는 animal타입이거나 animal을 상속받는 타입이어야 한다.
    //2.T는 Object까지 업캐스팅 되지않고 animal까지만 업캐스팅 된다.(이걸 컴파일러가 자동으로 해줌). 쉽게말해 굳이 Object까지 올라갈 필요가 없다.
    private T animal; // 필드로 animal을 상속받는 객체들을 제너릭으로 받고자 한다.

    public void makeSound(){//필드에 있는 animal상속객체들의 sound()호출을 해야하는데 T로는 업캐스팅이 Object까지 이뤄지기 때문에 sound()메서드를 호출 할 수 없다,
        //그래서 <T>를 <T extends Animal>이라고 작성. 하지만 상한경계를 설정해주면 sound()메서드가 있다는걸 보장할 수 있어서 컴파일러가 컴파일 검사를 통과시켜줌.
        animal.sound();
    }
    public T getBigger(T animal1 , T animal2){
        T bigger1 = animal1.getSize() > animal2.getSize() ? animal1 : animal2;
        return bigger1;
    }

}
