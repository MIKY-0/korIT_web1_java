package _12_BreakContinue;

public class Continue {
    public static void main(String[] args) {
    for(int i = 1; i <= 50; i++){
    if(i % 2 == 0){continue;}
        System.out.println(i);
    }
    int waiting = 20;
    int noShow = 6;
    for(int i = 1; i <= waiting; i++){
        if(i == 6){continue;}
        System.out.println(i + "번째 손님");
    }
    }
}
