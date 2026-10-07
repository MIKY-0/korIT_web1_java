package _23_Final;

public class FinalStudent {
    private final String name;
    private final int studentId;
    private int age;
    //final필드는 반드시 생성자로 초기화 해줘야됨.
    //final은 getter는 되지만 setter는 불가능.
    public FinalStudent(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public void printInfo(final String schoolName){
        System.out.println("학교 : " + schoolName);
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + studentId);
    }
}
