package _13_Array;

public class Quiz2 {
    public static void main(String[] args) {
        //(문제1) 평균이상의 학생수 , 최고점수 출력.
        int count = 0;
        double avg = 0;
        int score[] = {80,90,75,100,65,88,91,70};
        int sum = 0;
        int max = score[0];

        for(int scores : score) {sum += scores;}
        avg = (double) sum / score.length;
        System.out.println("평균 : " + avg);

        for(int i = 0; i < score.length; i++){
            if(score[i] >= avg) {count ++;}
            if(max < score[i]) {max = score[i];}
        }
        System.out.printf("학생 수 : %d , 최고점수 : %d" , count , max);
    }
}
