package _29_Wrapper;
//Integer배열로 변환.  최고점 , 최저점을 적절한 Integer메서드를 사용해서 구하기
public class Practice {
    public static void main(String[] args) {
     int score[] = {85,92,78,96,88};
     Integer max = 0 , min = 0;
    Integer intScore[] = new Integer[score.length];

    for(int i = 0; i < intScore.length; i++){
        int intValue = score[i];
        Integer integerValue = Integer.valueOf(intValue);
        intScore[i] = integerValue;

        //Integer intValue = score[i];
        //intScore[i] = intValue;


        //intScore[i] = score[i];
        }
        max = min = intScore[0];

    for(int s : intScore){
        max = Integer.max(max , s);

        min = Integer.min(min , s);

    }
//    for(int i = 0; i < intScore.length; i++){
//            if(max < intScore[i]) {max = intScore[i];}
//            if(min > intScore[i]) {min = intScore[i];}
//        }
        System.out.printf("최고점 : %d , 최저점 : %d" , max , min);
    }
}
