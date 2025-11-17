package _34_Generic;

import _34_Generic.animal.Animal;

public class WildCard {
    public static void printAnyBox(Box2<?> box){ // 제한없는 와일드카드. 모든 타입 허용. : 다양한 타입에 대해 같은 메서드시그니처로 처리하겠다.
        // (참고) 구체적인 타입 정보는 컴파일타임에만 존재하고 런타임에는 Object로 취급. box안에 뭐가 들어있는지 모르니까. String , Integer... 다 가능하니까.
        //Box2<T>와 다른점 : Box2<T>는 객체 생성할 때 유동적으로 지정.
        //Box<?>는 이미 생성된 제너릭 Box2타입들을 모두 대응하겠다. 매우 느슨한 조건이다. Box2타입이기만 하면됨.
        System.out.println(box.getItem());    //읽기는 가능하지만
        //box.setItem("문자" , 정수 등...); 쓰기는 불가능.
        //필드로 가지고있는 item은 Object로 취급하기 때문. 타입 안정성이 깨질 수 있어 set(쓰기)는 문법적으로 막아둠.
        //Integer data = box.getItem(); //매개변수로 Box2<String> , Box2<Integer> 타입의 객체를 넘겨주더라도 다운캐스팅 불가능.
        Object data = box.getItem();
    }
    public static void printAnimaBox(Box2<? extends Animal> animalBox){ // 상한 경계 와일드카드(상단을 방어). 
        //런타임에 위의 제한없는 와일드카드처럼 Object가 아니라 Animal로 취급. -> 안전하다.
        //Animal 또는 Animal의 자식타입을 받아줌. Animal의 하위 타입만 받아줌.
        Animal animal = animalBox.getItem(); // 읽기전용. 상한경계를 만들었기 때문에 최소한 얘는 Animal클래스라는게 보장된다. 하지만 넣기(추가)는 불가능. Animal의 하위 클래스(Dog , Cat , 등등...)들 중 뭔지 모르니까.
    }
    public static void addAnimalToBox(Box2<? super Animal> box , Animal animal){ // 하한 경계 와일드카드(하단을 방어). Object까지 업캐스팅 가능. 다운캐스팅은 Animal까지 제한. 
        //Animal 또는 Animal의 부모타입을 받아줌. Animal의 위 타입만 받아줌.
        box.getItem();
        box.setItem(animal); // 쓰기전용. animal 또는 그 하위타입을 상위타입에 안전하게 쓰기 가능. 하한경계를 만들었기 때문에 얘는 최소한 Animal을 넣어도 안전하다고 보장된다.
    }
}
