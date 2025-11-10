package _38_Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Practice1 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("노트북" , 5 , true , 1000000),
                new Item("마우스" , 0 , true , 30000),
                new Item("키보드" , 10 , false , 50000),
                new Item("헤드셋" , 3, true , 80000),
                new Item("리모컨" , 1 , false , 60000)
        );
        List<String> itemNames = items.stream()//상품명만 추출.
                .map(item -> item.getName()) // item을 String으로 변환해야되서 map 사용
                .collect(Collectors.toList());
        System.out.println(itemNames);

        //(문제1)가격들만 뽑아서 평균가격 출력.
        // stream에서는 외부변수 사용 제한(final만 사용 가능)

//        int avg = 0 , total = 0;
//        List<Double> avgs = items.stream()
//                .map(item -> item.getPrice())

        //(문제2)각 상품들의 재고를 포함한 총 가격 출력. 리턴 없으니까 forEach
        items.stream()
                .forEach(item -> {
                            int stock = item.getStock();
                            int price = item.getPrice();
                            System.out.println(stock * price);
                        });

        //(문제3)재고가 1개 이상이면서 세일중인 items들 List로 콜렉트
        List<Item> stock1Over = items.stream()
                .filter(item -> item.getStock() >= 1 && item.isOnSale())
                .collect(Collectors.toList());
        System.out.println(stock1Over);
    }
}
