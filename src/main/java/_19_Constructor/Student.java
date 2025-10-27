package _19_Constructor;

public class Student {
    String name;
    int kor , eng , math;

    public Student(String name , int kor , int eng , int math){
        System.out.println("생성자 호출");
        //매개변수로 들어온 값을 검증해야함.
        boolean korValidation = validateScore(kor);
        boolean engValidation = validateScore(eng);
        boolean mathValidation = validateScore(math);
        if(!korValidation && !engValidation && !mathValidation) {
            System.out.println("점수는 0 ~ 100사이");
            return;
        }
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public boolean validateScore(int score) {
        if (score > 100) {return false;}
        if (score < 0) {return false;}
        return false;
    }
}
