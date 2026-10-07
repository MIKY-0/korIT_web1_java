package _21_Access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {System.out.println("퍼블릭 메서드");}
     void defaultMethod() {System.out.println("디폴트 메서드");}
    private void privateMethod() {System.out.println("프라이빗 메서드");}

    public void inner(){
        privateMethod();
    }
}
