package _13_Array;

public class Quiz {
    public static void main(String[] args){
        //(문제1) score 평균.
        int score[] = {80,90,75,100,65};
        int sum = 0;
        for(int scores : score) {sum += scores;}
        System.out.println("평균 : " + (double) sum / score.length);
        System.out.println();

        //(문제2) 상한음식 제외하고 출력
        String food[] = {"김치","두부(상함)","우유","달걀(상함)","사과"};

        for(int i = 0; i < food.length; i++){
            if(food[i].contains("상함")) {continue;}
            System.out.print(food[i] + "\t");
        }
    }
}
