package _30_2_Builder;

import lombok.ToString;

@ToString
class  User{
    private final String name;
    private final String address;
    private final int age;

    public User(String name , String address , int age){
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public static class UserBuilder {
        private String name;
        private String address;
        private int age;

        public User build() {
            return new User(name , address , age);
        }

        public static UserBuilder builder() {
            return new UserBuilder();
        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }
    }
}

public class BuilderTest {
    public static void main(String[] args) {
        User.UserBuilder u = User.UserBuilder.builder();
        User.UserBuilder u1 = u.name("한승환");
        User.UserBuilder u2 = u1.address("부산진구");
        User.UserBuilder u3 = u2.age(26);
        User user = u3.build();
        System.out.println(user);

        User user1 = User.UserBuilder.builder()
                .name("홍길동")
                .address("서울")
                .age(30)
                .build();

        System.out.println(user1);
    }
}
