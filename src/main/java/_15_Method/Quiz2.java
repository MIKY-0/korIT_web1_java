package _15_Method;

public class Quiz2 {
    public static void printStudentInfo(String name , int kor , int eng , int math){
        int total = calcTotal(kor , eng , math);
        double avg = calcAverage(total);
        String grade = getGrade(avg);
        System.out.printf("이름 : %s , 총점 : %d , 평균 : %.2f , 등급 : %s" , name , total , avg , grade);
    }

    public static int calcTotal(int kor , int eng , int math) {return kor + eng + math;}
    public static double calcAverage(int total) {return (double)total / 3;}
    public static String getGrade(double avg) {
        if(avg >= 90) {return "A";}
        else if(avg >= 80) {return "B";}
        else if(avg >= 70) {return "C";}
        else if(avg >= 60) {return "D";}
        else {return "F";}
    }

    public static void main(String[] args) {
        //(문제1)위 컴파일 오류를 해결 , grade : 90이상 A , 80~89 B , 70~79 C , 60~69 D , 60미만 F
        printStudentInfo("한승환" , 84 , 90 , 97);
    }
}
