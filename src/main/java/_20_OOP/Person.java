package _20_OOP;

public class Person {
    String name;
    int age;
    Friend friends[]; //객체간의 관계 Person객체 하나는 여러개의 Friend객체를 알고있다.(1 : n 관계)

    public Person(String name , int age , int count){
        //객체 초기화 전에 데이터 검증 필요! 여기선 그냥 생략함.
        this.name = name;
        this.age = age;
        this.friends = new Friend[count]; //count 개수만큼 friend배열 사이즈 결정
    }
    public void setFriend(Friend friend) {
        for (int i = 0; i < friends.length; i++) {
           if (friends[i] == null) {
                friend = friends[i];
           }
        }
    }
    }

