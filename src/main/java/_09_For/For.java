package _09_For;

public class For {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println("hello world " + (i + 1));
        }
        int a = 0;
        for(; a < 5; a++){
            System.out.println(a);
        }
        System.out.println(a);

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum);
        //(문제1) 1~100까지 짝수합 , 홀수합 따로 출력.
        int evenSum = 0 , oddSum = 0;

        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
            evenSum += i;
            }else{
                oddSum += i;
            }
        }
        System.out.printf("짝수합 : %d , 홀수합 : %d" , evenSum , oddSum);
        System.out.println();
        //(문제2) 1~100 까지 3배수와 7배수 출력
        int count3 = 0 , count7 = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0) {
                count3 ++;
            }if(i % 7 == 0){
                count7 ++;
        }
        }
        System.out.println(count3);
        System.out.println(count7);
    }
}
