package _24_Inheritance.animal;
/*      1.상속 - Animal클래스
        2.필드 - private String color
        3.기본생성자 - 부모의 기본생성자 호출하고 color는 회색으로 초기화
        4.매개변수생성자 - 부모의 매개변수 생성자 호출하고 color도 매개변수로 받아서 초기화
        5.오버라이딩 : eat("고양이가 생선을 먹는다")  showInfo("이름 , 나이 , 털색")
 */
public class Cat extends Animal{
    private String color;

    public Cat(){
        super(); //생략가능
        this.color = "회색";
    }
   public Cat(String name , int age , String color){
        super(name , age);
        this.color = color;
   }
    @Override
    public void eat(){ //메서드 시그니처를 부모와 동일하게 정의.
        System.out.println("고양이가 생선을 먹는다");
    }
    @Override
    public void showInfo(){
        System.out.println("이름 : " + super.name); //this.name해도됨
        System.out.println("나이 : " + super.age);
        System.out.println("털색 : " + this.color);
    }
}
