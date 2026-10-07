package _23_Final;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private int stock;
    private boolean isOnSale;
    private int price;
}
