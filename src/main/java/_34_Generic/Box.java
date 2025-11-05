package _34_Generic;

public class Box {
    //private String item;
    private Object item;  //2.String을 Object로 변환
    public Box(Object item) { //2.String을 Object로 변환.
        this.item = item;
    }

    public Object getItem() {
        return item;
    }
}
