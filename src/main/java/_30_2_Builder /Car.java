package _30_2_Builder;

/*@Builder 없이 전부 풀어서 쓴 코드.
Car1Builder를 Car1내부에 쓰는 이유 - Car1에서만 쓸것이니까 , 접근제어가 쉬움.

[빌더] -- 아직 존재하지 않는 객체를 만들기 위한 도구.`객체 생성을 위한 도구`라고 생각. 객체를 안전하고 명확하게 만들기 위한 '생성 전용 도구'.
필요한 재료들을 모두 모은후 생성 시작! -> 준비가 끝난 시점에 객체 생성 시작.(준비후 생성)

[생성자] --  호출 즉시 객체를 생성.
필요한 재료들을 모두 모음과 동시에 생성 시작! -> 필요한 모든 재료들이 한번에 전달돼야함.(준비와 동시에 생성)
*/

class Car1 { // 완성된 Car1
    //final인 이유 - 준비된 재료들로 모든 준비가 끝나고 생성하기 때문에 재료들이 바뀔일이 없다.
    private final String brand;
    private final String model;
    private final int year;

    public Car1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
/* ↓ static인 이유 - Car1Builder는 Car1객체를 만들기 위한 클래스이다. 스태틱이 아니면 외부 클래스의 객체가 반드시 먼저 필요한데,
그렇게 되면 Car1객체 생성 -> Car1Builder객체 생성 -> 또 Car1 객체 생성(??). 이게 굳이 이렇게 할 필요가 없다. 쉽게 말해,
밥을 만들기 위해 쌀이 필요한데 그 쌀을 구하기위해 밥이 필요... 그리고 빌더패턴에서 이 순서 자체가 말이 안됨. 그리고 이렇게 되면 객체를
또 만들게 돼서 메모리 낭비 , 빌더객체를 만들기 위해 외부 객체를 만들어야 하므로 서로 강한 결합이 되기 때문에 제한을 받음.

static에 올려놓으면 내부 클래스 객체를 통해 외부 클래스 객체를 연결하는게 아니라 외부 클래스의 정보만 알게 된다. -> 이게 빌더패턴의 핵심.
빌더패턴은 준비후 생성이므로 아직 객체가 존재하지 않기 때문에 빌더객체(빌더클래스가 내부에 있지만 내부객체라는 표현보다 빌더객체가 맞는듯.)를
만들고 준비를 다 한 후 외부 객체 생성. 그리고 Car1Builder는 Car1 객체 안에 있는게 아닌 Car1에 소속된 독립 클래스.

하나더 추가하자면 메서드 또는 생성자에 static 언제 붙이는가? --> 상태 없으면 붙이고, 상태 있으면 안붙임.
상태란? 필드가 값을 가지고 있다면 '상태가 있다'고 함. '상태가 없다'는 매번 호출될때마다 외부에서 값을 전달받는다.
그래서 아래 build()메서드는 외부(메인함수)에서 값을 전달받으니까 상태가 없는것 아닌가? 라고 생각할 수 있지만 그게 아니다. ->
builder.brand("현대") 이렇게 값을 전달받는것처럼 보이지만 실제로는 this.brand = "현대" 이렇게 Car1Builder에 저장되는것!!!
만약 static Car1 build(String brand, String model, int year) {
    return new Car1(brand, model, year);
}  이렇게 작성하면 호출되는 순간에 외부에서 값을 전달받는것이므로 상태가 없는게 맞다.

또한, builder()메서드는 호출순간에 새로운 객체가 생성되기 때문에 애초에 값이 없는 객체가 생성되므로 '상태가 없다' -> static
 */
    public static class Car1Builder { // Car1를 위한 설계도.
        //final아닌 이유 -준비가 되기전 재료들은 바뀔수 있기 때문. 호출할때마다 변경되니까.
        private String brand;
        private String model;
        private int year;

        public Car1Builder brand(String brand) { // Car를 위한 재료
            this.brand = brand;
            return this;
        }

        public Car1Builder model(String model) { // Car를 위한 재료
            this.model = model;
            return this;
        }

        public Car1Builder year(int year) { // Car를 위한 재료
            this.year = year;
            return this;
        }

        public Car1 build() { // Car1 객체 생성. 이 한줄 코드가 유일한 객체 생성.
    // build()메서드 하나로 준비한 재료들(brand , model , year)을 이용해 생성시작!!
            return new Car1(brand, model, year);
        }
    }

    public static Car1Builder builder() {
        return new Car1Builder();
    }
}


public class Car {
    public static void main(String[] args) {
       Car1.Car1Builder builder = Car1.builder();
       Car1.Car1Builder builder1 = builder.brand("현대");
        Car1.Car1Builder builder2 = builder1.model("포니");
        Car1.Car1Builder builder3 = builder2.year(2022);
        Car1 c = builder3.build();
    }

}
