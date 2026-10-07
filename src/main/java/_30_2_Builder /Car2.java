package _30_2_Builder;

import lombok.Builder;
import lombok.ToString;

// 롬복을 이용한 완성된 빌더패턴.
@Builder
@ToString
class CarA{
    private final String brand;
    private final String model;
    private final int year;

    public CarA(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
}

public class Car2 {
    public static void main(String[] args) {
        CarA c = CarA . builder()
                .brand("현대")
                .model("포니")
                .year(2022)
                .build();
        System.out.println(c);

    }
}
