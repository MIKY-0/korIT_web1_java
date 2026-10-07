package _14_MultiArray;

public class WorkHour {
    public static void main(String[] args){
        String employee[] = {"김철수","이영희","박민수","최지우"};
        int workRecords[][] = { // id , 근무시간 , 시급.
                {0,20,10000}, //김철수
                {1,25,12000}, //이영희
                {2,20,9000}, //박민수
                {3,45,11000} //최지우
        };
        // 전체 인건비 계산
        int total = 0;
        for(int workRecord[] : workRecords){
           int hours = workRecord[1];
           int wage = workRecord[2];
           int pay = hours * wage;
           total += pay;
        }
        System.out.println("전체 인건비 : " + total);

        //"이영희" 있는지 검사 -> 있으면 근무시간 , 시급 출력
        String targetName = "이영희";
        int targetIndex = -1;
        for( int i = 0; i < employee.length; i++){
            if(employee[i].equals(targetName)){
                targetIndex = i;
            }
        }
        if(targetIndex == -1){
            System.out.println(targetName + "은 존재하지 않는다");
            return;
        }
        for(int workRecord[] : workRecords){
            if(workRecord[0] == targetIndex){
                System.out.println("직원 : " + targetName);
                System.out.println("근무시간 : " + workRecord[1]);
                System.out.println("시급 : " + workRecord[2]);
            }
        }

        // 근무시간 30시간 미만인 직원들 출력
        int target = -1;

        for(int workRecord[] : workRecords) {
            if (workRecord[1] < 30) {
                target = workRecord[0];
            System.out.println("근무시간이 30시간 미만 직원들 : " + employee[target]);
            }
        }
        if(target == -1){
            System.out.println("전 직원이 근무시간 30시간 이상입니다");
            return;
        }

//        for(int workRecord[] : workRecords){
//        if(workRecord[1] < 30){
//            int id = workRecord[0];
//            String name = employee[id];
//            System.out.println("30시간 미만 : " + name);
        }
        }
