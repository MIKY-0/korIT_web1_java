package _28_Object;

import java.util.Objects;

public class ObjectStudent {
    String name;
    int age;
    public ObjectStudent(String name , int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        String data = "이름 : "  + this.name + " , 나이 : " + this.age;
        return data;
    }

    @Override
    public boolean equals(Object o) { //null검사 , 클래스마다 다르면 false
        if (o == null || getClass() != o.getClass()) return false;
        ObjectStudent that = (ObjectStudent) o;
        return age == that.age && Objects.equals(name, that.name); //핃드 값비교. 원시자료형 == 연산자료
    }

    @Override
    public int hashCode() {// equals를 오버라이딩 하면 반드시 hashCode도 오버라이딩 해야한다
        return Objects.hash(name, age);
    }
}
