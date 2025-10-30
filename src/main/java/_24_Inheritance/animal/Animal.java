package _24_Inheritance.animal;

public class Animal {
    protected String name;
    protected int age;

    public Animal(){
        System.out.println("Animal기본생성자");
        this.name = "이름없음";
        this.age = 0;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eat(){
        System.out.println("Animal이 음식 먹음");
    }
    public void showInfo(){
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
    }
}
